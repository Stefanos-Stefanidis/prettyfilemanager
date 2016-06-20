/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.SearchDao;
import java.io.File;
import javax.swing.JTextArea;

/**
 *
 * @author stef
 */
public class SearchController {

    public void searchFile(File dir, String SearchKey, JTextArea searchDisplay, String type) {

        SearchDao search = new SearchDao();
        search.walkin(dir, SearchKey, searchDisplay, type);
    }

}
