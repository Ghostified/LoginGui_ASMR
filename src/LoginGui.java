import Custom.TextFieldCustom;

import javax.swing.*;

public class LoginGui extends JFrame {
    private TextFieldCustom userNameField;
    public LoginGui() {
        super ("Tap Tap Ind . Login");
        setSize (CommonConstants.FRAME_SIZE);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);

        addGuiComponent ();
    }

    private void addGuiComponent() {
        //login Image
        JLabel loginImage = CustomTools.loadImage(CommonConstants.LOGIN_IMAGE_PATH);
        if (loginImage != null) {
            loginImage.setBounds(
                    (CommonConstants.FRAME_SIZE.width - loginImage.getPreferredSize().width) / 2,
                    25,
                    CommonConstants.LOGIN_IMAGE_SIZE.width, CommonConstants.LOGIN_IMAGE_SIZE.height
            );
            getContentPane().add(loginImage);
        } else {
            System.out.println("Failed to load login Image");
        }
        //username field
        userNameField = new TextFieldCustom("Enter Username:", 30);
        userNameField.setBounds(
                50,
                loginImage.getY() + 315,
                CommonConstants.TEXTFIELD_SIZE.width, CommonConstants.TEXTFIELD_SIZE.height
         );

        //add to frame
        getContentPane().add(loginImage);
        getContentPane().add(userNameField);
    }
}
