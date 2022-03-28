package server;

import java.util.ArrayList;
import java.util.List;

public class SimpleAuthService implements AuthService {
    private class UserData {
        String login;
        String pass;
        String nickname;

        public UserData(String login, String pass, String nickname) {
            this.login = login;
            this.pass = pass;
            this.nickname = nickname;
        }
    }

    private List<UserData> users;

    public SimpleAuthService() {
        users = new ArrayList<>();
        users.add(new UserData("qwe", "qwe", "qwe"));
        users.add(new UserData("asd", "asd", "asd"));
        users.add(new UserData("zxc", "zxc", "zxc"));
        for (int i = 0; i < 9; i++) {
            users.add(new UserData("user" + i, "pass" + i, "nick" + i));
        }
    }

    @Override
    public String getNicknameByLoginAndPass(String login, String pass) {
        for (UserData u : users) {
            if (u.login.equals(login) && u.pass.equals(pass)) {
                return u.nickname;
            }
        }
        return null;
    }

    @Override
    public boolean registration(String login, String pass, String nickname) {
        for (UserData u : users) {
            if (u.login.equals(login) || u.nickname.equals(nickname)) {
                return false;
            }
        }
        users.add(new UserData(login, pass, nickname));
        return true;
    }

    @Override
    public boolean changeNick(String oldNickname, String newNickname) {
        return false;
    }
}
