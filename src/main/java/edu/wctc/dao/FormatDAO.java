package edu.wctc.dao;

import entity.Format;

import java.util.List;

public interface FormatDAO {
    List<Format> getFormat();

    Format getFormat(int id);
}
