/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

/**
 *
 * @author stef
 */
public interface ICommand {

    public void undo();

    public void redo();

    public void perform();

}
