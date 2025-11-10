package Adapt;
import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.FileReader;

public class Adaptee {
    private ScriptEngine engine;

    public Adaptee() throws Exception {
        ScriptEngineManager manager = new ScriptEngineManager();
        engine = manager.getEngineByName("nashorn");
        if (engine == null) {
            throw new RuntimeException("JS engine not found! Use JDK 8 or add a JS engine.");
        }

        engine.eval(new FileReader("script.js"));
    }

    public String callRoar() throws Exception {
        Object Lion = engine.get("lion");
        Invocable inv = (Invocable) engine;
        return (String) inv.invokeMethod(Lion, "roar");
    }
}
