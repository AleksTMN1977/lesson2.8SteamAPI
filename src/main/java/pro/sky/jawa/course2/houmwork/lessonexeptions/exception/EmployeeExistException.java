package pro.sky.jawa.course2.houmwork.lessonexeptions.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.BAD_REQUEST)
public class EmployeeExistException extends RuntimeException{
}
