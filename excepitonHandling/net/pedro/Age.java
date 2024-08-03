package excepitonHandling.net.pedro;

import excepitonHandling.net.pedro.exception.BurroException;

public class Age {

    public static void validateAge(int age) throws BurroException{
        if(age < 0){
            throw new BurroException("Idade não pode ser negativa");
        }
    }
}