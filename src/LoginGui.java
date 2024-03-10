import javax.swing.*;

public class LoginGui extends JFrame {
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
        loginImage.setBounds(
                (CommonConstants.FRAME_SIZE.width - loginImage.getPreferredSize().width)/2,
                25,
                CommonConstants.LOGIN_IMAGE_SIZE.width, CommonConstants.LOGIN_IMAGE_SIZE.height
        );
        //username field

    }
}
