package com.oranges.pages;

import com.orangehrm.utils.ElementUtil;

public class HomePage {

    public static String verifyTitle() {
        return ElementUtil.doGetPageTitle();
    }

}
