package org.jenkinsci.test.acceptance.plugins.ldap;

import org.jenkinsci.test.acceptance.po.GlobalSecurityConfig;
import org.jenkinsci.test.acceptance.po.PageArea;

/**
 * Use @Describable to register an implementation.
 *
 * @author Michael Prankl
 * @since ldap version 1.10
 */
public abstract class LdapGroupMembershipStrategy extends PageArea {

    protected LdapGroupMembershipStrategy(GlobalSecurityConfig context, String path) {
        super(context, path);
    }

    public abstract void configure(String strategyParam);
}
