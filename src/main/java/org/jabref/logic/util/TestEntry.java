package org.jabref.logic.util;

import java.util.Arrays;

import org.jabref.model.entry.BibEntry;
import org.jabref.model.entry.BibtexEntryTypes;
import org.jabref.model.entry.FieldName;

public class TestEntry {

    private TestEntry() {
    }

    public static BibEntry getTestEntry() {

        BibEntry entry = new BibEntry(BibtexEntryTypes.ARTICLE);
        entry.setCiteKey("Smith2016");
        entry.setField(FieldName.AUTHOR, "Smith, Bill and Jones, Bob and Williams, Jeff");
        entry.setField(FieldName.EDITOR, "Taylor, Phil");
        entry.setField(FieldName.TITLE, "Title of the test entry");
        entry.setField(FieldName.NUMBER, "3");
        entry.setField(FieldName.VOLUME, "34");
        entry.setField(FieldName.ISSUE, "3");
        entry.setField(FieldName.YEAR, "2016");
        entry.setField(FieldName.PAGES, "45--67");
        entry.setField(FieldName.MONTH, "July");
        entry.setField(FieldName.FILE, ":testentry.pdf:PDF");
        entry.setField(FieldName.JOURNAL, "BibTeX Journal");
        entry.setField(FieldName.PUBLISHER, "JabRef Publishing");
        entry.setField(FieldName.ADDRESS, "Trondheim");
        entry.setField(FieldName.URL, "https://github.com/JabRef");
        entry.setField(FieldName.DOI, "10.1001/bla.blubb");
        entry.setField(FieldName.ABSTRACT,
                "This entry describes a test scenario which may be useful in JabRef. By providing a test entry it is possible to see how certain things will look in this graphical BIB-file mananger.");
        entry.setField(FieldName.COMMENT, "Lorem ipsum dolor sit amet, consectetur adipisici elit, sed eiusmod tempor incidunt ut labore et " +
                "dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquid ex ea commodi consequat. " +
                "Quis aute iure reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint obcaecat cupiditat non " +
                "proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
        entry.putKeywords(Arrays.asList("KeyWord1", "KeyWord2", "KeyWord3", "Keyword4"), ';');

        return entry;
    }

    public static BibEntry getTestEntryBook() {
        BibEntry entry = new BibEntry(BibtexEntryTypes.BOOK);
        entry.setCiteKey("Harrer2018");
        entry.setField(FieldName.AUTHOR, "Simon Harrer and Jörg Lenhard and Linus Dietz");
        entry.setField(FieldName.EDITOR, "Andrea Steward");
        entry.setField(FieldName.TITLE, "Java by Comparison");
        entry.setField(FieldName.YEAR, "2018");
        entry.setField(FieldName.MONTH, "March");
        entry.setField(FieldName.PUBLISHER, "Pragmatic Bookshelf");
        entry.setField(FieldName.ADDRESS, "Raleigh, NC");
        return entry;
    }
}
