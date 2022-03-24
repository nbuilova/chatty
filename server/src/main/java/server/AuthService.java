package server;

public interface AuthService {

    String getNicknameByLoginAndPass(String login, String password);

    boolean registration(String login, String password, String nickname);

    boolean changeNick(String oldNickname, String newNickname);
}
