package utils;

public class Authentificator {
    
    private int password;

    public void setPassword(int password) {
        this.password = password;
    }

    public boolean authenticate(int password) {
        if(this.password == password) return true;
        else return false;
    }
}
