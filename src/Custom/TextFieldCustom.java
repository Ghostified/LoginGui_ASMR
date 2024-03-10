package Custom;

public class TextFieldCustom {
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

    }
}
