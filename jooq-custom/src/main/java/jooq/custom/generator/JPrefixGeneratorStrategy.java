package jooq.custom.generator;

import org.jooq.codegen.DefaultGeneratorStrategy;
import org.jooq.meta.Definition;

public class JPrefixGeneratorStrategy extends DefaultGeneratorStrategy {

    @Override
    public String getJavaClassName(Definition definition, Mode mode) {
        String className = super.getJavaClassName(definition, mode);
        if (mode == Mode.DEFAULT) {
            //return className + "_";
            return "J" + className;
        }
        return className;
    }
}
