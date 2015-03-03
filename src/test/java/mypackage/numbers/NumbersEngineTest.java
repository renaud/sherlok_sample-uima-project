package mypackage.numbers;

import static org.junit.Assert.assertEquals;

import java.util.Collection;

import mypackage.types.MyNumber;

import org.apache.uima.analysis_engine.AnalysisEngine;
import org.apache.uima.fit.factory.AnalysisEngineFactory;
import org.apache.uima.fit.factory.TypeSystemDescriptionFactory;
import org.apache.uima.fit.pipeline.SimplePipeline;
import org.apache.uima.fit.util.JCasUtil;
import org.apache.uima.jcas.JCas;
import org.apache.uima.util.CasCreationUtils;
import org.junit.Test;

public class NumbersEngineTest {

    @Test
    public void test() throws Exception {

        JCas jCas = CasCreationUtils.createCas(
                TypeSystemDescriptionFactory.createTypeSystemDescription(),
                null, null).getJCas();

        // the sample text to annotate
        jCas.setDocumentText("What is 1.2 plus 3?.");

        // configure the engine with scripts and resources
        AnalysisEngine rutaEngine = AnalysisEngineFactory.createEngine(
                NumbersEngine.class, "allowFloats", true);

        // run the script. instead of a jCas, you could also provide a UIMA
        // collection reader to process many documents
        SimplePipeline.runPipeline(jCas, rutaEngine);

        // a simple select to print the matched Names
        Collection<MyNumber> numbers = JCasUtil.select(jCas, MyNumber.class);
        assertEquals(2, numbers.size());
        for (MyNumber n : numbers) {
            System.out.println(n);
        }
    }
}
