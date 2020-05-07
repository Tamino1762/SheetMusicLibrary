package edu.wctc.mapping;

import edu.wctc.service.FormatService;
import edu.wctc.service.InstrumentService;
import edu.wctc.service.MusicService;
import edu.wctc.service.PublisherService;
import entity.Music;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/music")
public class MusicController {

    @Autowired
    private MusicService musicService;

    @Autowired
    private FormatService formatService;

    @Autowired
    private InstrumentService instrumentService;

    @Autowired
    private PublisherService publisherService;

    @GetMapping("/admin/delete")
    public String deleteMusic(@RequestParam("musicId") int theId) {

            musicService.deleteMusic(theId);
        return "redirect:/music/list"; //?
    }


    @GetMapping("/list")
    public String listMusic(Model theModel) {
        List<Music> musicList = musicService.getMusic();

        theModel.addAttribute("music", musicList);

        return "list";
    }

    @RequestMapping("/user/showAddMusicForm")
    public String showAddMusicForm(Model theModel){
        Music theMusic = new Music();

        theModel.addAttribute("aMusic", theMusic);

        theModel.addAttribute("format", formatService.getFormat());

        theModel.addAttribute("instrument", instrumentService.getInstrument());

        theModel.addAttribute("publisher", publisherService.getPublisher());

        return "music-form";
    }

    @RequestMapping("/user/showUpdateMusicForm") //@RequestParam("musicId"), ??
    public String showUpdateMusicForm(int theId, Model theModel){

        Music theMusic = musicService.getMusic(theId);

        theModel.addAttribute("aMusic", theMusic);

        theModel.addAttribute("format", formatService.getFormat());

        theModel.addAttribute("instrument", instrumentService.getInstrument());

        theModel.addAttribute("publisher", publisherService.getPublisher());

        return "form";
    }
    @GetMapping("user/showUpdateMusicForm")
    @PostMapping("/user/save")
    public String saveMusic(@Valid @ModelAttribute("music") Music theMusic,
                            BindingResult bindingResult,
                            Model theModel){
        // Any validation errors?
        if (bindingResult.hasErrors()) {
            // Display the errors in the console
            System.err.println(bindingResult);

            theModel.addAttribute("format", formatService.getFormat());
            theModel.addAttribute("instrument", instrumentService.getInstrument());
            theModel.addAttribute("publisher", publisherService.getPublisher());

            return "form";
        }

            return "redirect:/music/list";

    }

    @GetMapping("/search")
    public String search(@RequestParam("searchTerm") String theSearchTerm, Model theModel){
        List<Music> matchingMusic = musicService.getMusicByTitle(theSearchTerm);

        theModel.addAttribute("music", matchingMusic);

        return "list";
    }

    @InitBinder
    public void initBinder(WebDataBinder dataBinder){

        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);

    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public void handle(Exception e){
        e.printStackTrace();
    }
}