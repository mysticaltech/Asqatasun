/*
 * Asqatasun - Automated webpage assessment
 * Copyright (C) 2008-2019  Asqatasun.org
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Contact us by mail: asqatasun AT asqatasun DOT org
 */

package org.asqatasun.rules.accessiweb22;

import org.asqatasun.entity.audit.TestSolution;
import org.asqatasun.ruleimplementation.AbstractDetectionPageRuleImplementation;
import org.asqatasun.rules.elementselector.SimpleElementSelector;
import static org.asqatasun.rules.keystore.HtmlElementStore.FORM_ELEMENT;
import static org.asqatasun.rules.keystore.RemarkMessageStore.MANUAL_CHECK_ON_ELEMENTS_MSG;

/**
 * Implementation of the rule 11.10.3 of the referential Accessiweb 2.2.
 * <br/>
 * For more details about the implementation, refer to <a href="http://doc.asqatasun.org/en/90_Rules/accessiweb2.2/11.Forms/Rule-11.10.3.html">the rule 11.10.3 design page.</a>
 * @see <a href="http://www.accessiweb.org/index.php/accessiweb-22-english-version.html#test-11-10-3"> 11.10.3 rule specification</a>
 *
 */
public class Aw22Rule11103 extends AbstractDetectionPageRuleImplementation {
    
    /**
     * Default constructor
     */
    public Aw22Rule11103 () {
        super(
                new SimpleElementSelector(FORM_ELEMENT),
                // solution when at least one element is found
                TestSolution.NEED_MORE_INFO,
                // solution when no element is found
                TestSolution.NOT_APPLICABLE,
                // manual check message
                MANUAL_CHECK_ON_ELEMENTS_MSG,
                null
            );
    }

}
