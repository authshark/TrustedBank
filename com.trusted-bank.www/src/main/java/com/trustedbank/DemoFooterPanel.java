/*
 * Copyright (C) VeriSign, Inc. created 2008. All rights reserved.
 * This is an unpublished work protected as such under copyright law.
 * This work contains proprietary, confidential, and trade secret
 * information of VeriSign, Inc.  Use, disclosure or reproduction
 * without the expressed written authorization of VeriSign, Inc.
 * is prohibited.
 */
package com.trustedbank;


import wicket.markup.html.link.PageLink;
import wicket.markup.html.panel.Panel;

import com.trustedbank.account.AddToken;
import com.trustedbank.account.Profile;
import com.trustedbank.account.RemoveToken;
import com.trustedbank.account.Signup;
import com.trustedbank.account.SignupDone;
import com.trustedbank.signin.SignOut;


/**
 * A footer panel component for demo links.
 */
class DemoFooterPanel extends Panel
{
    /** 
     * The class fingerprint that is set to indicate serialization
     * compatibility with a previous version of the class.
     */
    private static final long serialVersionUID = -4241221452057951963L;


    /**
     * Creates a new instance of {@link DemoFooterPanel}.
     *
     * @param id
     */
    public DemoFooterPanel( String id )
    {
        super( id );

        add( new PageLink( "home", Home.class ) );
        add( new PageLink( "enterotp", EnterOtp.class ) );
        add( new PageLink( "forgottoken", ForgotToken.class ) );
        add( new PageLink( "smsTempcode", SMSTempCode.class ) );
        add( new PageLink( "voiceTempcode", VoiceTempCode.class ) );
        add( new PageLink( "main", Main.class ) );
        add( new PageLink( "signout", SignOut.class ) );
        add( new PageLink( "addtoken", AddToken.class ) );
        add( new PageLink( "profile", Profile.class ) );
        add( new PageLink( "removetoken", RemoveToken.class ) );
        add( new PageLink( "signup", Signup.class ) );
        add( new PageLink( "signupdone", SignupDone.class ) );
    }
}
