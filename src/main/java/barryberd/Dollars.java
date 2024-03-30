package barryberd;

import javax.swing.*;

public class Dollars {
    public static void main(String[] args) {
        String username =
                JOptionPane.showInputDialog("Имя пользователя");
        String password =
                JOptionPane.showInputDialog("Пароль");

        if (!(username == null && password == null) && (
                (username.equals("bburd || BBURD") &&
                 password.equals("swordfish")) ||
                (username.equals("hritter || HRITTER") &&
                 password.equals("preakston"))
            )
        ) {
            JOptionPane.showInputDialog(null, "Вы допущены в систему");
        } else {
            JOptionPane.showInputDialog(null, "Попытайтесь еще раз...");
        }
    }
}
