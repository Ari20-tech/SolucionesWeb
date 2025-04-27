package com.VasquezRojas.Exception;
import java.time.LocalDateTime;

public record ErrorRecord (LocalDateTime datetime, String message, String details){

}
