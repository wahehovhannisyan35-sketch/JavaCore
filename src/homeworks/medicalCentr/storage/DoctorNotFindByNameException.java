package homeworks.medicalCentr.storage;

public class DoctorNotFindByNameException extends Exception {
    public DoctorNotFindByNameException(){


    }
DoctorNotFindByNameException(String massage){
        super(massage);
}
    public DoctorNotFindByNameException(String message, Throwable cause) {
        super(message, cause);
    }

    public DoctorNotFindByNameException(Throwable cause) {
        super(cause);
    }

    public DoctorNotFindByNameException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
