package sth.app.main;

import java.io.IOException;

import pt.tecnico.po.ui.Command;
import pt.tecnico.po.ui.Input;
import sth.core.SchoolManager;

import java.io.*;

/**
 * 4.1.1. Save to file under current name (if unnamed, query for name).
 */
public class DoSave extends Command<SchoolManager> {

  private SchoolManager _receiver;

  /**
   * @param receiver
   */
  public DoSave(SchoolManager receiver) {
    super(Label.SAVE, receiver);
    _receiver = receiver;

  }

  /** @see pt.tecnico.po.ui.Command#execute() */
  @Override
  public final void execute() {
    try {
         FileOutputStream fileOut = new FileOutputStream("/state.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(_receiver.getSchool());
         out.close();
         fileOut.close();
      } catch (IOException i) {
         i.printStackTrace();
      }
   }
}
