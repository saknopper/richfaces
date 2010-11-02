package org.richfaces.renderkit.html;

import java.util.Map;

import javax.faces.application.FacesMessage;

import org.jboss.test.faces.mock.Mock;
import org.richfaces.component.behavior.BehaviorTestBase;
import org.richfaces.component.behavior.ClientValidatorBehavior;
import org.richfaces.validator.LibraryResource;

import com.google.common.collect.ImmutableMap;

public class RendererTestBase extends BehaviorTestBase {

    protected static final String CLIENT_VALIDATORS_JS = "clientValidators.js";
    protected static final String ORG_RICHFACES = "org.richfaces";
    protected static final String REGEX_VALIDATOR = "regexValidator";
    protected static final FacesMessage VALIDATOR_MESSAGE = new FacesMessage("Validator Message");
    protected static final Map<String, ? extends Object> VALIDATOR_PARAMS = ImmutableMap.of("foo", "value", "bar", 10);
    protected static final LibraryResource CLIENT_VALIDATOR_LIBRARY = new LibraryResource(ORG_RICHFACES, CLIENT_VALIDATORS_JS);
    
    protected ClientValidatorRenderer renderer = new ClientValidatorRenderer();
    
    @Mock
    protected ClientValidatorBehavior mockBehavior;

    public RendererTestBase() {
        super();
    }


}