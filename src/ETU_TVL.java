/* Generated By:JavaCC: Do not edit this line. ETU_TVL.java */
import java.util.List;
import java.util.ArrayList;

public class ETU_TVL implements ETU_TVLConstants {
    public static final int INTEGER_TRUE = 2;
    public static final int INTEGER_FALSE = 1;
    public static final int INTEGER_UNKNOWN = 0;

    private static List<Node> declaredVariablesList;



    public static void main(String args[]) {
       declaredVariablesList = new ArrayList<Node>();

       ETU_TVL parser;

       if (args.length == 1) {
         try {
           parser = new ETU_TVL(new java.io.FileInputStream(args[0]));
         }
         catch (java.io.FileNotFoundException e) {
           return;
         }
       }
       else {
         System.out.println("Please enter a file as a parameter. e.g. \u005c"java ETU_TVL file\u005c"");

         return;
       }

       try {
         parser.ETU_TVL_Language();
       }
       catch (ParseException e) {
         System.out.println(e.getMessage());
       }
    }
    public static void addDeclaredVariable(String name) {
        declaredVariablesList.add(new Node(name));
    }
    public static boolean containsDeclaredVariable(String name) {
        for(Node node: declaredVariablesList)
            if(name.equals(node.getName()))
                return true;

        return false;
    }
    public static void setValue(String name, int value) {
        for(Node node: declaredVariablesList) {
            if(name.equals(node.getName())) {
                node.setValue(value);

                return;
            }
        }
    }
    public static int getValue(String name) {
        for(Node node: declaredVariablesList) {
            if(name.equals(node.getName())) {
                return node.getValue();
            }
        }

        return 0;
    }
    public static String getValueAsString(int value) {
        if (value==INTEGER_TRUE)
            return "TRUE";
        else if (value==INTEGER_FALSE)
            return "FALSE";
        else
            return "UNKNOWN";
    }

/*************************************************************************************/
/********************           GRAMMAR STARTS FROM HERE          ********************/
/*************************************************************************************/



/********************    <ETU TVL Language>  ********************/
  static final public void ETU_TVL_Language() throws ParseException {
    jj_consume_token(PROGRAM);
    jj_consume_token(ID);
    jj_consume_token(SEMICOLON);
    DeclarationSection();
    InitializationSection();
    MainSection();
  }

/********************    <Declaration Section>   ********************/
  static final public void DeclarationSection() throws ParseException {
    jj_consume_token(DECLARATION_SECTION);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ID:
      VariableNameList();
      break;
    default:
      jj_la1[0] = jj_gen;
      ;
    }
    jj_consume_token(SEMICOLON);
  }

/********************    <Variable Name List>    ********************/
  static final public void VariableNameList() throws ParseException {
    String name;
    name = VariableName();
    ETU_TVL.addDeclaredVariable(name);
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case COMMA:
        ;
        break;
      default:
        jj_la1[1] = jj_gen;
        break label_1;
      }
      jj_consume_token(COMMA);
      name = VariableName();
    if(ETU_TVL.containsDeclaredVariable(name)) {
        {if (true) throw new ParseException("\u005cnEXCEPTION: You can't declare variables which have same names: \u005c""+ name +"\u005c"\u005cn");}
    }

    ETU_TVL.addDeclaredVariable(name);
    }
  }

/*****    <Variable Name>  *****/
  static final public String VariableName() throws ParseException {
    Token token;
    token = jj_consume_token(ID);
    {if (true) return token.toString();}
    throw new Error("Missing return statement in function");
  }

/********************    <Initialization Section>  ********************/
  static final public void InitializationSection() throws ParseException {
    jj_consume_token(INITIALIZATION_SECTION);
    label_2:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case ID:
        ;
        break;
      default:
        jj_la1[2] = jj_gen;
        break label_2;
      }
      InitList();
      jj_consume_token(SEMICOLON);
    }
  }

/********************    <Init List>  ********************/
  static final public void InitList() throws ParseException {
    String name;
    int value;
    name = VariableName();
    jj_consume_token(EQUALS);
    value = LogicalValue();
    if(!ETU_TVL.containsDeclaredVariable(name)) {
        {if (true) throw new ParseException("\u005cnEXCEPTION: Use of undeclared variable in the initialization section: \u005c""+ name +"\u005c"\u005cn");}
    }

    ETU_TVL.setValue(name, value);
  }

/********************    <Logical Value>  ********************/
  static final public int LogicalValue() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case TRUE:
      jj_consume_token(TRUE);
    {if (true) return ETU_TVL.INTEGER_TRUE;}
      break;
    case FALSE:
      jj_consume_token(FALSE);
    {if (true) return ETU_TVL.INTEGER_FALSE;}
      break;
    case UNKNOWN:
      jj_consume_token(UNKNOWN);
    {if (true) return ETU_TVL.INTEGER_UNKNOWN;}
      break;
    default:
      jj_la1[3] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

/********************    <Main Section>  ********************/
  static final public void MainSection() throws ParseException {
    jj_consume_token(MAIN_SECTION);
    label_3:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case INPUT:
      case OUTPUT:
      case ID:
        ;
        break;
      default:
        jj_la1[4] = jj_gen;
        break label_3;
      }
      Statement();
      jj_consume_token(SEMICOLON);
    }
  }

/********************    <Statement>  ********************/
  static final public void Statement() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case INPUT:
      InputStmt();
      break;
    case OUTPUT:
      OutputStmt();
      break;
    case ID:
      BoolAssignmentStmt();
      break;
    default:
      jj_la1[5] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

/********************    <Input Stmt>  ********************/
  static final public void InputStmt() throws ParseException {
    String message;
    String name;
    jj_consume_token(INPUT);
    message = message();
    System.out.print(message);
    name = VariableName();
    if(!ETU_TVL.containsDeclaredVariable(name)) {
        {if (true) throw new ParseException("\u005cnEXCEPTION: Use of undeclared variable in the main section: \u005c""+ name +"\u005c"\u005cn");}
    }

    System.out.println(ETU_TVL.getValueAsString(ETU_TVL.getValue(name)));
  }

/********************    <Output Stmt>  ********************/
  static final public void OutputStmt() throws ParseException {
    String message;
    int result;
    jj_consume_token(OUTPUT);
    message = message();
    System.out.print(message);
    result = BoolExpression();
    System.out.println(ETU_TVL.getValueAsString(result));
  }

/********************    <MESSAGE>  ********************/
  static final public String message() throws ParseException {
    Token token;
    token = jj_consume_token(MESSAGE);
    {if (true) return token.toString().replace("'", "");};
    throw new Error("Missing return statement in function");
  }

/********************    <Bool Assignment Stmt>  ********************/
  static final public void BoolAssignmentStmt() throws ParseException {
    String name;
    int result;
    name = VariableName();
    jj_consume_token(EQUALS);
    result = BoolExpression();
    if(!ETU_TVL.containsDeclaredVariable(name)) {
        {if (true) throw new ParseException("EXCEPTION: Use of undeclared variable in the main section: \u005c""+ name +"\u005c"");}
    }

    ETU_TVL.setValue(name, result);
  }

/********************    <Bool Expression>  ********************/
  static final public int BoolExpression() throws ParseException {
    int parameter;
    int result;
    parameter = BoolTerm();
    result = BoolExpressionHelper(parameter);
    {if (true) return result;}
    throw new Error("Missing return statement in function");
  }

/********************    IT IS HELPER PRODUCT TO SOLVE LEFT RECURSION    ********************/
  static final public int BoolExpressionHelper(int parameter) throws ParseException {
    int temp;
    int result;
    int returnValue;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case OR:
      jj_consume_token(OR);
      temp = BoolTerm();
    if(parameter==ETU_TVL.INTEGER_TRUE || temp==ETU_TVL.INTEGER_TRUE)
        result = ETU_TVL.INTEGER_TRUE;
    else if(parameter==ETU_TVL.INTEGER_FALSE && temp==ETU_TVL.INTEGER_FALSE)
        result = ETU_TVL.INTEGER_FALSE;
    else
        result = ETU_TVL.INTEGER_UNKNOWN;
      returnValue = BoolExpressionHelper(result);
    {if (true) return returnValue;}
      break;
    default:
      jj_la1[6] = jj_gen;
      EPSILON();
    {if (true) return parameter;}
    }
    throw new Error("Missing return statement in function");
  }

/********************    <Bool Term>  ********************/
  static final public int BoolTerm() throws ParseException {
    int parameter;
    int result;
    parameter = BoolFactor();
    result = BoolTermHelper(parameter);
    {if (true) return result;}
    throw new Error("Missing return statement in function");
  }

/********************    IT IS HELPER PRODUCT TO SOLVE LEFT RECURSION    ********************/
  static final public int BoolTermHelper(int parameter) throws ParseException {
    int temp;
    int result;
    int returnValue;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case AND:
      jj_consume_token(AND);
      temp = BoolFactor();
    if(parameter==ETU_TVL.INTEGER_TRUE && temp==ETU_TVL.INTEGER_TRUE)
        result = ETU_TVL.INTEGER_TRUE;
    else if(parameter==ETU_TVL.INTEGER_FALSE || temp==ETU_TVL.INTEGER_FALSE)
        result = ETU_TVL.INTEGER_FALSE;
    else
        result = ETU_TVL.INTEGER_UNKNOWN;
      returnValue = BoolTermHelper(result);
    {if (true) return returnValue;}
      break;
    default:
      jj_la1[7] = jj_gen;
      EPSILON();
    {if (true) return parameter;}
    }
    throw new Error("Missing return statement in function");
  }

/********************    <Bool Factor>  ********************/
  static final public int BoolFactor() throws ParseException {
    int value;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case TRUE:
    case FALSE:
    case UNKNOWN:
    case LEFT_PARENTHESIS:
    case ID:
      value = BoolPrimary();
    {if (true) return value;}
      break;
    case NOT:
      jj_consume_token(NOT);
      value = BoolPrimary();
    if(value == ETU_TVL.INTEGER_TRUE)
        {if (true) return ETU_TVL.INTEGER_FALSE;}
    else if(value == ETU_TVL.INTEGER_FALSE)
        {if (true) return ETU_TVL.INTEGER_TRUE;}
    else
        {if (true) return ETU_TVL.INTEGER_UNKNOWN;}
      break;
    default:
      jj_la1[8] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

/********************    <Bool Primary>  ********************/
  static final public int BoolPrimary() throws ParseException {
    String name;
    int result;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case TRUE:
    case FALSE:
    case UNKNOWN:
      result = LogicalValue();
    {if (true) return result;}
      break;
    case ID:
      name = VariableName();
    {if (true) return ETU_TVL.getValue(name);}
      break;
    case LEFT_PARENTHESIS:
      jj_consume_token(LEFT_PARENTHESIS);
      result = BoolExpression();
      jj_consume_token(RIGHT_PARENTHESIS);
    {if (true) return result;}
      break;
    default:
      jj_la1[9] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

/********************    IT IS USED AS AN EPSILON  ********************/
  static final public void EPSILON() throws ParseException {
    System.out.print("");
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public ETU_TVLTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[10];
  static private int[] jj_la1_0;
  static {
      jj_la1_init_0();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x4000000,0x800000,0x4000000,0x1c000,0x4003000,0x4003000,0x80000,0x20000,0x415c000,0x411c000,};
   }

  /** Constructor with InputStream. */
  public ETU_TVL(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public ETU_TVL(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new ETU_TVLTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 10; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 10; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public ETU_TVL(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new ETU_TVLTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 10; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 10; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public ETU_TVL(ETU_TVLTokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 10; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(ETU_TVLTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 10; i++) jj_la1[i] = -1;
  }

  static private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[27];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 10; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 27; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

}
/********************          THIS CLASS IS USED TO HOLD DECLARED VARIABLES AND THEIR VALUES        ********************/
class Node {
    private String name;
    private int value;
    /*
       if "value" equals;
       2 = TRUE
       1 = FALSE
       0 = UNKNOWN
    */



    public Node(String nameP) {
        this.name = nameP;
        this.value = ETU_TVL.INTEGER_UNKNOWN;
    }

    public String getName() {
        return name;
    }
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
