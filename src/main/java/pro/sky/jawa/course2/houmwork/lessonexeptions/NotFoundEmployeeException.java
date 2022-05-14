package pro.sky.jawa.course2.houmwork.lessonexeptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class NotFoundEmployeeException extends RuntimeException {

}


