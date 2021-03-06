package de.peeeq.wurstscript.attributes;

import de.peeeq.wurstscript.ast.ExprIntVal;
import de.peeeq.wurstscript.utils.Utils;

public class IntVal {

    public static int getValI(ExprIntVal i) {
        String raw = i.getValIraw();
        try {
            if (raw.matches("-?[0-9]+")) {
                return Utils.parseInt(raw);
            } else if (raw.toLowerCase().startsWith("0x")) {
                return Utils.parseHexInt(raw, 2);
            } else if (raw.startsWith("$")) {
                return Utils.parseHexInt(raw, 1);
            } else if (raw.startsWith("'")) {
                try {
                    return Utils.parseAsciiInt(raw);
                } catch (NumberFormatException e) {
                    i.addError(e.getMessage());
                    return 0;
                }
            }
        } catch (NumberFormatException e) {
            // fall through...
        }
        i.addError("Invalid number: " + raw);
        return 0;
    }

}
