package mypackage.numbers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import mypackage.types.MyNumber;

import org.apache.uima.UimaContext;
import org.apache.uima.fit.component.JCasAnnotator_ImplBase;
import org.apache.uima.fit.descriptor.ConfigurationParameter;
import org.apache.uima.fit.descriptor.TypeCapability;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;

@TypeCapability(outputs = { "mypackage.types.MyNumber" })
public class NumbersEngine extends JCasAnnotator_ImplBase {

    @ConfigurationParameter(name = "allowFloats")
    private boolean allowFloats;

    private Pattern pattern;

    @Override
    public void initialize(UimaContext context)
            throws ResourceInitializationException {
        super.initialize(context);
        if (allowFloats) {
            pattern = Pattern.compile("[-]?[0-9]*\\.?,?[0-9]+");
        } else {
            pattern = Pattern.compile("[0-9]+");
        }
    }

    @Override
    public void process(JCas jCas) {

        Matcher m = pattern.matcher(jCas.getDocumentText());
        while (m.find()) {
            new MyNumber(jCas, m.start(), m.end()).addToIndexes();
        }
    }
}