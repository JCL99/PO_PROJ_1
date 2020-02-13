package sth.core;

import java.util.*;

public class Survey{

  private enum State{
    ABERTO,
    FECHADO,
    CRIADO,
    FINALIZADO,
  }

  private ArrayList<Submission> _answerList;

  public Survey(){
    _answerList = new ArrayList<Submission>();
  }

  void open(){

  }

  void addAnswer(Submission submission){
    _answerList.add(submission);
  }

}
