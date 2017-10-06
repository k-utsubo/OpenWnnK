package jp.co.omronsoft.openwnn;

import java.lang.reflect.Field;

//http://shekeenlab.hatenablog.com/entry/2014/09/15/000110
public class StyleableLoader {

    public static int[] Theme;
    public static int Theme_backgroundDimAmount;
    public static int[] Keyboard;
    public static int[] KeyboardView;
    public static int KeyboardView_keyBackground;
    public static int KeyboardView_verticalCorrection;
    public static int KeyboardView_keyPreviewLayout;
    public static int Keyboard_keyWidth;
    public static int Keyboard_keyHeight;
    public static int Keyboard_horizontalGap;
    public static int Keyboard_verticalGap;
    public static int[] Keyboard_Row;
    public static int Keyboard_Row_rowEdgeFlags;
    public static int Keyboard_Row_keyboardMode;
    public static int[] Keyboard_Key;
    public static int Keyboard_Key_codes;
    public static int Keyboard_Key_iconPreview;
    public static int Keyboard_Key_popupCharacters;
    public static int Keyboard_Key_popupKeyboard;
    public static int Keyboard_Key_isRepeatable;
    public static int Keyboard_Key_isModifier;
    public static int Keyboard_Key_isSticky;
    public static int Keyboard_Key_keyEdgeFlags;
    public static int Keyboard_Key_keyIcon;
    public static int Keyboard_Key_keyLabel;
    public static int Keyboard_Key_keyOutputText;
    public static int KeyboardView_keyPreviewOffset;
    public static int KeyboardView_keyPreviewHeight;
    public static int KeyboardView_keyTextSize;
    public static int KeyboardView_keyTextColor;
    public static int KeyboardView_labelTextSize;
    public static int KeyboardView_popupLayout;
    public static int KeyboardView_shadowColor;
    public static int KeyboardView_shadowRadius;
    static{
        try {
            loadStyleable("Theme");
            loadStyleable("Theme_backgroundDimAmount");
            loadStyleable("Keyboard");
            loadStyleable("KeyboardView");
            loadStyleable("KeyboardView_keyBackground");
            loadStyleable("KeyboardView_verticalCorrection");
            loadStyleable("KeyboardView_keyPreviewLayout");
            loadStyleable("Keyboard_keyWidth");
            loadStyleable("Keyboard_keyHeight");
            loadStyleable("Keyboard_horizontalGap");
            loadStyleable("Keyboard_verticalGap");
            loadStyleable("Keyboard_Row");
            loadStyleable("Keyboard_Row_rowEdgeFlags");
            loadStyleable("Keyboard_Row_keyboardMode");
            loadStyleable("Keyboard_Key");
            loadStyleable("Keyboard_Key_codes");
            loadStyleable("Keyboard_Key_iconPreview");
            loadStyleable("Keyboard_Key_popupCharacters");
            loadStyleable("Keyboard_Key_popupKeyboard");
            loadStyleable("Keyboard_Key_isRepeatable");
            loadStyleable("Keyboard_Key_isModifier");
            loadStyleable("Keyboard_Key_isSticky");
            loadStyleable("Keyboard_Key_keyEdgeFlags");
            loadStyleable("Keyboard_Key_keyIcon");
            loadStyleable("Keyboard_Key_keyLabel");
            loadStyleable("Keyboard_Key_keyOutputText");
            loadStyleable("KeyboardView_keyPreviewOffset");
            loadStyleable("KeyboardView_keyPreviewHeight");
            loadStyleable("KeyboardView_keyTextSize");
            loadStyleable("KeyboardView_keyTextColor");
            loadStyleable("KeyboardView_labelTextSize");
            loadStyleable("KeyboardView_popupLayout");
            loadStyleable("KeyboardView_shadowColor");
            loadStyleable("KeyboardView_shadowRadius");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void loadStyleable(String name){
        try {
            Class<?> styleable = Class.forName("android.R$styleable");
            Field src = styleable.getField(name);
            src.setAccessible(true);
            Field dest = StyleableLoader.class.getDeclaredField(name);
            dest.setAccessible(true);
            dest.set(null, src.get(null));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}