public class UserAuthenticationSystem {
    public static void main(String[] args) {
        Records idandPasswords = new Records();
        LoginPage loginSystems = new LoginPage(idandPasswords.getLoginInfo());
    }
}