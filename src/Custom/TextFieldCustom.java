package Custom;

import javax.swing.*;
import java.awt.event.*;

public class TextFieldCustom extends JTextField {
    private String placeHolderText ;
    private boolean hasPlaceHolder;
    public boolean isHasPlaceHolder() {
        return hasPlaceHolder;
    }


    public TextFieldCustom(String  placeHolderText, int charLimit) {
        super();
        this.placeHolderText = placeHolderText;

        //placeholder text  status
        hasPlaceHolder = true;

        //Limit char input in the field
        setDocument(new LimitText(charLimit));
        setText(this.placeHolderText);

        addListeners();
    }
    private void addListeners() {
        //check for mouse clicks
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (hasPlaceHolder) {
                    hasPlaceHolder = false;
                    setText("");
                }
            }
        });

        //check for key presses
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (hasPlaceHolder) {
                    hasPlaceHolder = false;
                    setText("");
                }
            }
        });

        //check to see if user has removed focus for this field
        addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

            }

            @Override
            public void focusLost(FocusEvent e) {
                // check if it is empty
                if (getText().toString().length() <= 0) {
                    hasPlaceHolder = true;
                    setText(placeHolderText);
                }
            }
        });
    }
}
