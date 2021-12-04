package _15_exception_and_debug.exercise.triagle_exception;

public class IllegalTriangleException extends RuntimeException{
  public IllegalTriangleException(String e){
      super(e);
  }
}
