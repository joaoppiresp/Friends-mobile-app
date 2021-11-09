package pt.iade.friends.models.exceptions;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException 
{
    private static final long serialVersionUID = 5405519104069955535L;
    public NotFoundException(String internal_id, String elemType, String internal_idName) 
    {
        super(elemType+" with "+internal_idName+" "+internal_id+" not found.");
    } 
}

