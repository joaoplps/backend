package model;

/**
 *
 * @author LPS
 */
public class SignIn {
    private final String user, pass;

    public SignIn(String u, String p) {
        user = u;
        pass = p;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof SignIn){
            SignIn sign = (SignIn) obj;
            return user.equals(sign.user) && pass.equals(sign.pass);
        }
        return false;
    }
}
