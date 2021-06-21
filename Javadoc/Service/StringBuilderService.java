package Service;

import java.lang.StringBuilder;

/**
 * This class consists of dynamic methods
 * to manipulate and get information about provided string.
 *
 * @author alex
 * @see StringBuilder
 * @see String
 */
public class StringBuilderService {

    /**
     * This is meant to be a wrapper for a provided string,
     * on which amnipulations will be made
     */
    private StringBuilder stringBuilder;

    /**
     * StringBuilderService constructor
     * {@link StringBuilderService}
     *
     * @param str String, on which manipulations will be made
     */
    public StringBuilderService(String str) {
        this.stringBuilder = new StringBuilder(str);
    }

    /**
     * This method is meant to be used for
     * getting current string on which manipulations are making
     * <p>
     * {@link #get()}
     *
     * @return String
     */
    public int getLength() {
        return this.get().length();
    }

    /**
     * This method replaces passed substrings in current string,
     * on which meant to be made manipulations,
     * onto provided string
     *
     * @param substringTo    String, on which substringsFrom will be replaced
     * @param substringsFrom Strings, which will be replaces with substringTo
     * @return StringBuilderService
     */
    public StringBuilderService replace(
            String substringTo,
            String[] substringsFrom
    ) {
        var modifiedString = this.stringBuilder
                .toString()
                .replaceAll(
                        String.format("(%s)", String.join("|", substringsFrom)),
                        substringTo
                );

        this.stringBuilder = new StringBuilder(modifiedString);

        return this;
    }

    /**
     * This method returns a string,
     * on which manipulations meant to be made
     *
     * @return String
     * @{link #stringBuilder}
     */
    public String get() {
        return this.stringBuilder.toString();
    }
}