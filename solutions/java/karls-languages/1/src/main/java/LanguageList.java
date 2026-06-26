import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
        return languages.isEmpty();
        // throw new UnsupportedOperationException("Please implement the isEmpty() method");
    }

    public void addLanguage(String language) {
        languages.add(language);
        // throw new UnsupportedOperationException("Please implement the addLanguage() method");
    }

    public void removeLanguage(String language) {
        languages.remove(language);
        // throw new UnsupportedOperationException("Please implement the removeLanguage() method");
    }

    public String firstLanguage() {
        return languages.isEmpty() ? null : languages.get(0);
        // throw new UnsupportedOperationException("Please implement the firstLanguage() method");
    }

    public int count() {
        return languages.size();
        // throw new UnsupportedOperationException("Please implement the count() method");
    }

    public boolean containsLanguage(String language) {
        return languages.contains(language);
        // throw new UnsupportedOperationException("Please implement the containsLanguage() method");
    }

    public boolean isExciting() {
        return languages.contains("Java") || languages.contains("Kotlin");
        // throw new UnsupportedOperationException("Please implement the isExciting() method");
    }
}
