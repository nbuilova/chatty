package server;

public interface AuthService {

    String getNicknameByLoginAndPass(String login, String pass);

    boolean registration (String login, String pass, String nickname);
}

