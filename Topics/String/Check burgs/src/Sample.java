public class Sample {
    public static void main(String[] args) {
        /*String iliadQuote = "\"But raging still, amidst his navy sat\n" +
                "The stern Achilles, stedfast in his hate;\n" +
                "Nor mix’d in combat, nor in council join’d;\n" +
                "But wasting cares lay heavy on his mind:\n" +
                "In his black thoughts revenge and slaughter roll,\n" +
                "And scenes of blood rise dreadful in his soul.\"";
        System.out.println(iliadQuote);

         */
        String query = "SELECT \"EMP_ID\", \"LAST_NAME\" FROM \"EMPLOYEE_TB\"\n" +
                "WHERE \"CITY\" = 'INDIANAPOLIS'\n" +
                "ORDER BY \"EMP_ID\", \"LAST_NAME\";\n";
//                "eol";
        System.out.println(query);
        String html = "<html>\n" +
                "    <body>\n" +
                "        <p>Hello, world</p>\n" +
                "    </body>\n" +
                "</html>\n";
        System.out.println(html);
        String iliadQuote = """
    "But raging still, amidst his navy sat
    The stern Achilles, stedfast in his hate;
    Nor mix’d in combat, nor in council join’d;
    But wasting cares lay heavy on his mind:
    In his black thoughts revenge and slaughter roll,
    And scenes of blood rise dreadful in his soul."
    """;

        System.out.println(iliadQuote);
        String example = """
    You can use "single" or ""double"" quotes any time you like. 
    But you must escape one if you want triple quotes: \"""
    or \"\""" if you want four. 
    The line after me will be directly concatenated onto the same line\
    But this line will preserve a single trailing space at the end\s
    And this line will keep six trailing spaces     \s 
    """;
        System.out.println(example);
        String poem = """
              "Over hill, over dale,
              Thorough bush, thorough brier,
              Over park, over pale,
              Thorough flood, thorough fire!\"""";
        System.out.println(poem);
    }
}
