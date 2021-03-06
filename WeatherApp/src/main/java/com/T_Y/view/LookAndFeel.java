package com.T_Y.view;

import java.awt.*;

import static javax.swing.UIManager.*;

public class LookAndFeel {
    public static void tweakPLAF() {
        String className = "javax.swing.plaf.nimbus.NimbusLookAndFeel";
        try {
            setLookAndFeel(className);
        } catch (Exception e) {
            System.err.println("Failed setting NimbusLookAndFeel. Defaulting to system L&F");

            className = getSystemLookAndFeelClassName();
            try {
                setLookAndFeel(className);
            } catch (Exception e2) {
                System.err.println("Failed setting SystemLookAndFeel.. FML");
                e2.printStackTrace();
            }
        }

        put("info", get("ToolTip.background"));
        put("ToolTip.font", new Font("Arial", Font.PLAIN, 14));
    }


}
