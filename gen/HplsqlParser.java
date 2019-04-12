// Generated from D:/imp/IT/fourth_year/›’· À«‰Ì/compiler/CompilerProject/assets/Gramar\Hplsql.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HplsqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T_ACTION=5, T_ADD2=6, T_ALL=7, T_ALLOCATE=8, 
		T_ALTER=9, T_AND=10, T_ANSI_NULLS=11, T_ANSI_PADDING=12, T_VOID=13, T_AS=14, 
		T_ASC=15, T_ASSOCIATE=16, T_AT=17, T_AUTO_INCREMENT=18, T_AVG=19, T_BATCHSIZE=20, 
		T_BEGIN=21, T_BETWEEN=22, T_BIGINT=23, T_BINARY_DOUBLE=24, T_BINARY_FLOAT=25, 
		T_BINARY_INTEGER=26, T_BIT=27, T_BODY=28, T_BREAK=29, T_BY=30, T_BYTE=31, 
		T_CALL=32, T_CALLER=33, T_CASCADE=34, T_CASE=35, T_CASESPECIFIC=36, T_CAST=37, 
		T_CHAR=38, T_CHARACTER=39, T_CHARSET=40, T_CLIENT=41, T_CLOSE=42, T_CLUSTERED=43, 
		T_CMP=44, T_COLLECT=45, T_COLLECTION=46, T_COLUMN=47, T_COMMENT=48, T_CONSTANT=49, 
		T_COMMIT=50, T_COMPRESS=51, T_CONCAT=52, T_CONDITION=53, T_CONSTRAINT=54, 
		T_CONTINUE=55, T_COPY=56, T_COUNT=57, T_COUNT_BIG=58, T_CREATE=59, T_CREATION=60, 
		T_CREATOR=61, T_CS=62, T_CURRENT=63, T_CURRENT_SCHEMA=64, T_CURSOR=65, 
		T_DATABASE=66, T_DATA=67, T_DATE=68, T_DATETIME=69, T_DAY=70, T_DAYS=71, 
		T_DEC=72, T_DECIMAL=73, T_DECLARE=74, T_DEFAULT=75, T_DEFERRED=76, T_DEFINED=77, 
		T_DEFINER=78, T_DEFINITION=79, T_DELETE=80, T_DELIMITED=81, T_DELIMITER=82, 
		T_DESC=83, T_DESCRIBE=84, T_DIAGNOSTICS=85, T_DIR=86, T_DIRECTORY=87, 
		T_DISTINCT=88, T_DISTRIBUTE=89, T_DO=90, T_DOUBLE=91, T_DROP=92, T_DYNAMIC=93, 
		T_ELSE=94, T_ELSEIF=95, T_ELSIF=96, T_ENABLE=97, T_END=98, T_ENGINE=99, 
		T_ESCAPED=100, T_EXCEPT=101, T_EXEC=102, T_EXECUTE=103, T_EXCEPTION=104, 
		T_EXCLUSIVE=105, T_EXISTS=106, T_EXIT=107, T_FALLBACK=108, T_FALSE=109, 
		T_FETCH=110, T_FIELDS=111, T_FILE=112, T_FILES=113, T_FLOAT=114, T_REAL=115, 
		T_FOR=116, T_FOREIGN=117, T_FORMAT=118, T_FOUND=119, T_FROM=120, T_FULL=121, 
		T_FUNCTION=122, T_GET=123, T_GLOBAL=124, T_GO=125, T_GRANT=126, T_GROUP=127, 
		T_HANDLER=128, T_HASH=129, T_HAVING=130, T_HDFS=131, T_HIVE=132, T_HOST=133, 
		T_IDENTITY=134, T_IF=135, T_IGNORE=136, T_IMMEDIATE=137, T_IN=138, T_INCLUDE=139, 
		T_INDEX=140, T_INITRANS=141, T_INNER=142, T_INOUT=143, T_INSERT=144, T_INT=145, 
		T_INT2=146, T_INT4=147, T_INT8=148, T_INTEGER=149, T_INTERSECT=150, T_INTERVAL=151, 
		T_INTO=152, T_INVOKER=153, T_IS=154, T_ISOPEN=155, T_ITEMS=156, T_JOIN=157, 
		T_KEEP=158, T_KEY=159, T_KEYS=160, T_LANGUAGE=161, T_LEAVE=162, T_LEFT=163, 
		T_LIKE=164, T_LIMIT=165, T_LINES=166, T_LOCAL=167, T_LOCATION=168, T_LOCATOR=169, 
		T_LOCATORS=170, T_LOCKS=171, T_LOG=172, T_LOGGED=173, T_LOGGING=174, T_LOOP=175, 
		T_MAP=176, T_MATCHED=177, T_MAX=178, T_MAXTRANS=179, T_MERGE=180, T_MESSAGE_TEXT=181, 
		T_MICROSECOND=182, T_MICROSECONDS=183, T_MIN=184, T_MULTISET=185, T_NCHAR=186, 
		T_NEW=187, T_NVARCHAR=188, T_NO=189, T_NOCOUNT=190, T_NOCOMPRESS=191, 
		T_NOLOGGING=192, T_NONE=193, T_NOT=194, T_NOTFOUND=195, T_NULL=196, T_NUMERIC=197, 
		T_NUMBER=198, T_OBJECT=199, T_OFF=200, T_ON=201, T_ONLY=202, T_OPEN=203, 
		T_OR=204, T_ORDER=205, T_OUT=206, T_OUTER=207, T_OVER=208, T_OVERWRITE=209, 
		T_OWNER=210, T_PACKAGE=211, T_PARTITION=212, T_PCTFREE=213, T_PCTUSED=214, 
		T_PLS_INTEGER=215, T_PRECISION=216, T_PRESERVE=217, T_PRIMARY=218, T_PRINT=219, 
		T_PROC=220, T_PROCEDURE=221, T_QUALIFY=222, T_QUERY_BAND=223, T_QUIT=224, 
		T_QUOTED_IDENTIFIER=225, T_RAISE=226, T_REFERENCES=227, T_REGEXP=228, 
		T_REPLACE=229, T_RESIGNAL=230, T_RESTRICT=231, T_RESULT=232, T_RESULT_SET_LOCATOR=233, 
		T_RETURN=234, T_RETURNS=235, T_REVERSE=236, T_RIGHT=237, T_RLIKE=238, 
		T_ROLE=239, T_ROLLBACK=240, T_ROW=241, T_ROWS=242, T_ROWTYPE=243, T_ROW_COUNT=244, 
		T_RR=245, T_RS=246, T_PWD=247, T_TRIM=248, T_SCHEMA=249, T_SECOND=250, 
		T_SECONDS=251, T_SECURITY=252, T_SEGMENT=253, T_SEL=254, T_SELECT=255, 
		T_SET=256, T_SESSION=257, T_SESSIONS=258, T_SETS=259, T_SHARE=260, T_SIGNAL=261, 
		T_SIMPLE_DOUBLE=262, T_SIMPLE_FLOAT=263, T_SIMPLE_INTEGER=264, T_SMALLDATETIME=265, 
		T_SMALLINT=266, T_SQL=267, T_SQLEXCEPTION=268, T_SQLINSERT=269, T_SQLSTATE=270, 
		T_SQLWARNING=271, T_STATS=272, T_STATISTICS=273, T_STEP=274, T_STORAGE=275, 
		T_STORED=276, T_STRING=277, T_SUBDIR=278, T_SUBSTRING=279, T_SUM=280, 
		T_SUMMARY=281, T_SYS_REFCURSOR=282, T_TABLE=283, T_TABLESPACE=284, T_TEMPORARY=285, 
		T_TERMINATED=286, T_TEXTIMAGE_ON=287, T_THEN=288, T_TIMESTAMP=289, T_TINYINT=290, 
		T_TITLE=291, T_TO=292, T_TOP=293, T_TRANSACTION=294, T_TRUE=295, T_TRUNCATE=296, 
		T_TYPE=297, T_UNION=298, T_UNIQUE=299, T_UPDATE=300, T_UR=301, T_USE=302, 
		T_USING=303, T_VALUE=304, T_VALUES=305, T_VAR=306, T_VARCHAR=307, T_VARCHAR2=308, 
		T_VARYING=309, T_VOLATILE=310, T_WHEN=311, T_WHERE=312, T_WHILE=313, T_WITH=314, 
		T_WITHOUT=315, T_WORK=316, T_XACT_ABORT=317, T_XML=318, T_YES=319, T_EXTERNAL=320, 
		T_ACTIVITY_COUNT=321, T_CUME_DIST=322, T_CURRENT_DATE=323, T_CURRENT_TIMESTAMP=324, 
		T_CURRENT_USER=325, T_DENSE_RANK=326, T_FIRST_VALUE=327, T_LAG=328, T_LAST_VALUE=329, 
		T_LEAD=330, T_MAX_PART_STRING=331, T_MIN_PART_STRING=332, T_MAX_PART_INT=333, 
		T_MIN_PART_INT=334, T_MAX_PART_DATE=335, T_MIN_PART_DATE=336, T_PART_COUNT=337, 
		T_PART_LOC=338, T_RANK=339, T_ROW_NUMBER=340, T_STDEV=341, T_SYSDATE=342, 
		T_VARIANCE=343, T_USER=344, T_ADD=345, T_COLON=346, T_COMMA=347, T_PIPE=348, 
		T_DIV=349, T_DOT2=350, T_EQUAL=351, T_EQUAL2=352, T_NOTEQUAL=353, T_NOTEQUAL2=354, 
		T_GREATER=355, T_GREATEREQUAL=356, T_LESS=357, T_LESSEQUAL=358, T_MUL=359, 
		T_OPEN_B=360, T_OPEN_P=361, T_OPEN_SB=362, T_CLOSE_B=363, T_CLOSE_P=364, 
		T_CLOSE_SB=365, T_SEMICOLON=366, T_SUB=367, T_NEGATIV=368, T_BOOL=369, 
		T_WRITE=370, T_AND_cpp=371, L_NUMBER=372, L_ID=373, L_S_STRING=374, L_D_STRING=375, 
		L_INT=376, L_DEC=377, L_WS=378, L_M_COMMENT=379, L_S_COMMENT=380, L_FILE=381, 
		L_LABEL=382, L_THAL=383;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_begin_end_block = 2, RULE_block_b_end = 3, 
		RULE_single_block_stmt = 4, RULE_block_end = 5, RULE_begin_end_block_function = 6, 
		RULE_block_b_end_function = 7, RULE_write_stmt = 8, RULE_proc_block = 9, 
		RULE_block_return = 10, RULE_stmt = 11, RULE_semicolon_stmt = 12, RULE_declare_block_inplace = 13, 
		RULE_declare_stmt_item = 14, RULE_declare_var_item = 15, RULE_declare_condition_item = 16, 
		RULE_declare_cursor_item = 17, RULE_cursor_with_return = 18, RULE_cursor_without_return = 19, 
		RULE_declare_handler_item = 20, RULE_declare_temporary_table_item = 21, 
		RULE_create_table_stmt = 22, RULE_create_external_table_stmt = 23, RULE_create_local_temp_table_stmt = 24, 
		RULE_create_table_definition = 25, RULE_create_external_table_definition = 26, 
		RULE_create_external_table_columns = 27, RULE_create_external_table_columns_item = 28, 
		RULE_create_table_columns = 29, RULE_create_table_columns_item = 30, RULE_column_name = 31, 
		RULE_create_table_column_inline_cons = 32, RULE_create_table_column_cons = 33, 
		RULE_create_table_fk_action = 34, RULE_create_table_preoptions = 35, RULE_create_table_preoptions_item = 36, 
		RULE_create_table_preoptions_td_item = 37, RULE_create_table_options = 38, 
		RULE_location = 39, RULE_create_table_options_item = 40, RULE_create_table_options_ora_item = 41, 
		RULE_create_table_options_db2_item = 42, RULE_create_table_options_td_item = 43, 
		RULE_create_table_options_hive_item = 44, RULE_create_table_hive_row_format = 45, 
		RULE_create_table_hive_row_format_fields = 46, RULE_create_table_options_mssql_item = 47, 
		RULE_create_table_options_mysql_item = 48, RULE_dtype_len = 49, RULE_dtype_attr = 50, 
		RULE_dtype_default = 51, RULE_create_function_stmt = 52, RULE_create_function_return = 53, 
		RULE_create_package_stmt = 54, RULE_package_spec = 55, RULE_package_spec_item = 56, 
		RULE_arrays = 57, RULE_dtype = 58, RULE_cpp_stmt = 59, RULE_init_expression_cpp_stmt = 60, 
		RULE_declear_variable = 61, RULE_set_value = 62, RULE_parameters = 63, 
		RULE_parameter = 64, RULE_pre_creation = 65, RULE_create_function_cpp = 66, 
		RULE_assignment_cpp = 67, RULE_operators = 68, RULE_for_stmt_cpp = 69, 
		RULE_for_header = 70, RULE_for_begin_condition = 71, RULE_variable_name = 72, 
		RULE_compares = 73, RULE_if_stmt_c_plus_plus = 74, RULE_if_structure_c_plus_plus = 75, 
		RULE_else_if_structure_c_plus_plus = 76, RULE_else_structure_c_plus_plus = 77, 
		RULE_if_else_stmt_cpp = 78, RULE_bool_expr_binary_operator_c_plus = 79, 
		RULE_bool_expr_c_plus_plus = 80, RULE_bool_expr_logical_operator_c_plus = 81, 
		RULE_bool_expr_binary_c_plus = 82, RULE_bool_expr_atom_c_plus = 83, RULE_expr_cpp = 84, 
		RULE_create_package_body_stmt = 85, RULE_package_body = 86, RULE_package_body_item = 87, 
		RULE_create_procedure_stmt = 88, RULE_create_routine_params = 89, RULE_create_routine_param_item = 90, 
		RULE_create_routine_options = 91, RULE_create_routine_option = 92, RULE_if_stmt = 93, 
		RULE_if_plsql_stmt = 94, RULE_if_tsql_stmt = 95, RULE_if_bteq_stmt = 96, 
		RULE_elseif_block = 97, RULE_else_block = 98, RULE_create_index_stmt = 99, 
		RULE_create_index_col = 100, RULE_index_storage_clause = 101, RULE_index_mssql_storage_clause = 102, 
		RULE_for_cursor_stmt = 103, RULE_for_range_stmt = 104, RULE_label = 105, 
		RULE_select_stmt = 106, RULE_cte_select_stmt = 107, RULE_cte_select_stmt_item = 108, 
		RULE_cte_select_cols = 109, RULE_fullselect_stmt = 110, RULE_fullselect_stmt_item = 111, 
		RULE_fullselect_set_clause = 112, RULE_subselect_stmt = 113, RULE_select_list = 114, 
		RULE_select_list_set = 115, RULE_select_list_limit = 116, RULE_select_list_item = 117, 
		RULE_column = 118, RULE_tabname = 119, RULE_select_list_alias = 120, RULE_select_list_asterisk = 121, 
		RULE_into_clause = 122, RULE_from_clause = 123, RULE_from_table_clause = 124, 
		RULE_from_table_name_clause = 125, RULE_from_subselect_clause = 126, RULE_from_join_clause = 127, 
		RULE_from_join_type_clause = 128, RULE_from_table_values_clause = 129, 
		RULE_from_table_values_row = 130, RULE_from_alias_clause = 131, RULE_table_name = 132, 
		RULE_where_clause = 133, RULE_group_by_clause = 134, RULE_having_clause = 135, 
		RULE_qualify_clause = 136, RULE_order_by_clause = 137, RULE_select_options = 138, 
		RULE_select_options_item = 139, RULE_bool_expr = 140, RULE_bool_expr_atom = 141, 
		RULE_bool_expr_unary = 142, RULE_bool_expr_single_in = 143, RULE_bool_expr_multi_in = 144, 
		RULE_bool_expr_binary = 145, RULE_bool_expr_logical_operator = 146, RULE_bool_expr_binary_operator = 147, 
		RULE_expr = 148, RULE_expr_atom = 149, RULE_interval_item = 150, RULE_expr_concat = 151, 
		RULE_expr_concat_item = 152, RULE_expr_case = 153, RULE_expr_case_simple = 154, 
		RULE_expr_case_searched = 155, RULE_expr_cursor_attribute = 156, RULE_expr_agg_window_func = 157, 
		RULE_expr_func_all_distinct = 158, RULE_expr_func_over_clause = 159, RULE_expr_func_partition_by_clause = 160, 
		RULE_expr_spec_func = 161, RULE_expr_func = 162, RULE_expr_func_params = 163, 
		RULE_func_param = 164, RULE_date_literal = 165, RULE_timestamp_literal = 166, 
		RULE_ident = 167, RULE_string = 168, RULE_int_number = 169, RULE_dec_number = 170, 
		RULE_bool_literal = 171, RULE_null_const = 172, RULE_non_reserved_words = 173;
	public static final String[] ruleNames = {
		"program", "block", "begin_end_block", "block_b_end", "single_block_stmt", 
		"block_end", "begin_end_block_function", "block_b_end_function", "write_stmt", 
		"proc_block", "block_return", "stmt", "semicolon_stmt", "declare_block_inplace", 
		"declare_stmt_item", "declare_var_item", "declare_condition_item", "declare_cursor_item", 
		"cursor_with_return", "cursor_without_return", "declare_handler_item", 
		"declare_temporary_table_item", "create_table_stmt", "create_external_table_stmt", 
		"create_local_temp_table_stmt", "create_table_definition", "create_external_table_definition", 
		"create_external_table_columns", "create_external_table_columns_item", 
		"create_table_columns", "create_table_columns_item", "column_name", "create_table_column_inline_cons", 
		"create_table_column_cons", "create_table_fk_action", "create_table_preoptions", 
		"create_table_preoptions_item", "create_table_preoptions_td_item", "create_table_options", 
		"location", "create_table_options_item", "create_table_options_ora_item", 
		"create_table_options_db2_item", "create_table_options_td_item", "create_table_options_hive_item", 
		"create_table_hive_row_format", "create_table_hive_row_format_fields", 
		"create_table_options_mssql_item", "create_table_options_mysql_item", 
		"dtype_len", "dtype_attr", "dtype_default", "create_function_stmt", "create_function_return", 
		"create_package_stmt", "package_spec", "package_spec_item", "arrays", 
		"dtype", "cpp_stmt", "init_expression_cpp_stmt", "declear_variable", "set_value", 
		"parameters", "parameter", "pre_creation", "create_function_cpp", "assignment_cpp", 
		"operators", "for_stmt_cpp", "for_header", "for_begin_condition", "variable_name", 
		"compares", "if_stmt_c_plus_plus", "if_structure_c_plus_plus", "else_if_structure_c_plus_plus", 
		"else_structure_c_plus_plus", "if_else_stmt_cpp", "bool_expr_binary_operator_c_plus", 
		"bool_expr_c_plus_plus", "bool_expr_logical_operator_c_plus", "bool_expr_binary_c_plus", 
		"bool_expr_atom_c_plus", "expr_cpp", "create_package_body_stmt", "package_body", 
		"package_body_item", "create_procedure_stmt", "create_routine_params", 
		"create_routine_param_item", "create_routine_options", "create_routine_option", 
		"if_stmt", "if_plsql_stmt", "if_tsql_stmt", "if_bteq_stmt", "elseif_block", 
		"else_block", "create_index_stmt", "create_index_col", "index_storage_clause", 
		"index_mssql_storage_clause", "for_cursor_stmt", "for_range_stmt", "label", 
		"select_stmt", "cte_select_stmt", "cte_select_stmt_item", "cte_select_cols", 
		"fullselect_stmt", "fullselect_stmt_item", "fullselect_set_clause", "subselect_stmt", 
		"select_list", "select_list_set", "select_list_limit", "select_list_item", 
		"column", "tabname", "select_list_alias", "select_list_asterisk", "into_clause", 
		"from_clause", "from_table_clause", "from_table_name_clause", "from_subselect_clause", 
		"from_join_clause", "from_join_type_clause", "from_table_values_clause", 
		"from_table_values_row", "from_alias_clause", "table_name", "where_clause", 
		"group_by_clause", "having_clause", "qualify_clause", "order_by_clause", 
		"select_options", "select_options_item", "bool_expr", "bool_expr_atom", 
		"bool_expr_unary", "bool_expr_single_in", "bool_expr_multi_in", "bool_expr_binary", 
		"bool_expr_logical_operator", "bool_expr_binary_operator", "expr", "expr_atom", 
		"interval_item", "expr_concat", "expr_concat_item", "expr_case", "expr_case_simple", 
		"expr_case_searched", "expr_cursor_attribute", "expr_agg_window_func", 
		"expr_func_all_distinct", "expr_func_over_clause", "expr_func_partition_by_clause", 
		"expr_spec_func", "expr_func", "expr_func_params", "func_param", "date_literal", 
		"timestamp_literal", "ident", "string", "int_number", "dec_number", "bool_literal", 
		"null_const", "non_reserved_words"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'@'", "'#'", "'.'", "'%'", null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "'+'", "':'", 
		"','", "'||'", "'/'", "'..'", "'='", "'=='", "'<>'", "'!='", "'>'", "'>='", 
		"'<'", "'<='", "'*'", "'{'", "'('", "'['", "'}'", "')'", "']'", "';'", 
		"'-'", "'!'", null, null, "'&&'", null, null, null, null, null, null, 
		null, null, null, null, null, "'`'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "T_ACTION", "T_ADD2", "T_ALL", "T_ALLOCATE", 
		"T_ALTER", "T_AND", "T_ANSI_NULLS", "T_ANSI_PADDING", "T_VOID", "T_AS", 
		"T_ASC", "T_ASSOCIATE", "T_AT", "T_AUTO_INCREMENT", "T_AVG", "T_BATCHSIZE", 
		"T_BEGIN", "T_BETWEEN", "T_BIGINT", "T_BINARY_DOUBLE", "T_BINARY_FLOAT", 
		"T_BINARY_INTEGER", "T_BIT", "T_BODY", "T_BREAK", "T_BY", "T_BYTE", "T_CALL", 
		"T_CALLER", "T_CASCADE", "T_CASE", "T_CASESPECIFIC", "T_CAST", "T_CHAR", 
		"T_CHARACTER", "T_CHARSET", "T_CLIENT", "T_CLOSE", "T_CLUSTERED", "T_CMP", 
		"T_COLLECT", "T_COLLECTION", "T_COLUMN", "T_COMMENT", "T_CONSTANT", "T_COMMIT", 
		"T_COMPRESS", "T_CONCAT", "T_CONDITION", "T_CONSTRAINT", "T_CONTINUE", 
		"T_COPY", "T_COUNT", "T_COUNT_BIG", "T_CREATE", "T_CREATION", "T_CREATOR", 
		"T_CS", "T_CURRENT", "T_CURRENT_SCHEMA", "T_CURSOR", "T_DATABASE", "T_DATA", 
		"T_DATE", "T_DATETIME", "T_DAY", "T_DAYS", "T_DEC", "T_DECIMAL", "T_DECLARE", 
		"T_DEFAULT", "T_DEFERRED", "T_DEFINED", "T_DEFINER", "T_DEFINITION", "T_DELETE", 
		"T_DELIMITED", "T_DELIMITER", "T_DESC", "T_DESCRIBE", "T_DIAGNOSTICS", 
		"T_DIR", "T_DIRECTORY", "T_DISTINCT", "T_DISTRIBUTE", "T_DO", "T_DOUBLE", 
		"T_DROP", "T_DYNAMIC", "T_ELSE", "T_ELSEIF", "T_ELSIF", "T_ENABLE", "T_END", 
		"T_ENGINE", "T_ESCAPED", "T_EXCEPT", "T_EXEC", "T_EXECUTE", "T_EXCEPTION", 
		"T_EXCLUSIVE", "T_EXISTS", "T_EXIT", "T_FALLBACK", "T_FALSE", "T_FETCH", 
		"T_FIELDS", "T_FILE", "T_FILES", "T_FLOAT", "T_REAL", "T_FOR", "T_FOREIGN", 
		"T_FORMAT", "T_FOUND", "T_FROM", "T_FULL", "T_FUNCTION", "T_GET", "T_GLOBAL", 
		"T_GO", "T_GRANT", "T_GROUP", "T_HANDLER", "T_HASH", "T_HAVING", "T_HDFS", 
		"T_HIVE", "T_HOST", "T_IDENTITY", "T_IF", "T_IGNORE", "T_IMMEDIATE", "T_IN", 
		"T_INCLUDE", "T_INDEX", "T_INITRANS", "T_INNER", "T_INOUT", "T_INSERT", 
		"T_INT", "T_INT2", "T_INT4", "T_INT8", "T_INTEGER", "T_INTERSECT", "T_INTERVAL", 
		"T_INTO", "T_INVOKER", "T_IS", "T_ISOPEN", "T_ITEMS", "T_JOIN", "T_KEEP", 
		"T_KEY", "T_KEYS", "T_LANGUAGE", "T_LEAVE", "T_LEFT", "T_LIKE", "T_LIMIT", 
		"T_LINES", "T_LOCAL", "T_LOCATION", "T_LOCATOR", "T_LOCATORS", "T_LOCKS", 
		"T_LOG", "T_LOGGED", "T_LOGGING", "T_LOOP", "T_MAP", "T_MATCHED", "T_MAX", 
		"T_MAXTRANS", "T_MERGE", "T_MESSAGE_TEXT", "T_MICROSECOND", "T_MICROSECONDS", 
		"T_MIN", "T_MULTISET", "T_NCHAR", "T_NEW", "T_NVARCHAR", "T_NO", "T_NOCOUNT", 
		"T_NOCOMPRESS", "T_NOLOGGING", "T_NONE", "T_NOT", "T_NOTFOUND", "T_NULL", 
		"T_NUMERIC", "T_NUMBER", "T_OBJECT", "T_OFF", "T_ON", "T_ONLY", "T_OPEN", 
		"T_OR", "T_ORDER", "T_OUT", "T_OUTER", "T_OVER", "T_OVERWRITE", "T_OWNER", 
		"T_PACKAGE", "T_PARTITION", "T_PCTFREE", "T_PCTUSED", "T_PLS_INTEGER", 
		"T_PRECISION", "T_PRESERVE", "T_PRIMARY", "T_PRINT", "T_PROC", "T_PROCEDURE", 
		"T_QUALIFY", "T_QUERY_BAND", "T_QUIT", "T_QUOTED_IDENTIFIER", "T_RAISE", 
		"T_REFERENCES", "T_REGEXP", "T_REPLACE", "T_RESIGNAL", "T_RESTRICT", "T_RESULT", 
		"T_RESULT_SET_LOCATOR", "T_RETURN", "T_RETURNS", "T_REVERSE", "T_RIGHT", 
		"T_RLIKE", "T_ROLE", "T_ROLLBACK", "T_ROW", "T_ROWS", "T_ROWTYPE", "T_ROW_COUNT", 
		"T_RR", "T_RS", "T_PWD", "T_TRIM", "T_SCHEMA", "T_SECOND", "T_SECONDS", 
		"T_SECURITY", "T_SEGMENT", "T_SEL", "T_SELECT", "T_SET", "T_SESSION", 
		"T_SESSIONS", "T_SETS", "T_SHARE", "T_SIGNAL", "T_SIMPLE_DOUBLE", "T_SIMPLE_FLOAT", 
		"T_SIMPLE_INTEGER", "T_SMALLDATETIME", "T_SMALLINT", "T_SQL", "T_SQLEXCEPTION", 
		"T_SQLINSERT", "T_SQLSTATE", "T_SQLWARNING", "T_STATS", "T_STATISTICS", 
		"T_STEP", "T_STORAGE", "T_STORED", "T_STRING", "T_SUBDIR", "T_SUBSTRING", 
		"T_SUM", "T_SUMMARY", "T_SYS_REFCURSOR", "T_TABLE", "T_TABLESPACE", "T_TEMPORARY", 
		"T_TERMINATED", "T_TEXTIMAGE_ON", "T_THEN", "T_TIMESTAMP", "T_TINYINT", 
		"T_TITLE", "T_TO", "T_TOP", "T_TRANSACTION", "T_TRUE", "T_TRUNCATE", "T_TYPE", 
		"T_UNION", "T_UNIQUE", "T_UPDATE", "T_UR", "T_USE", "T_USING", "T_VALUE", 
		"T_VALUES", "T_VAR", "T_VARCHAR", "T_VARCHAR2", "T_VARYING", "T_VOLATILE", 
		"T_WHEN", "T_WHERE", "T_WHILE", "T_WITH", "T_WITHOUT", "T_WORK", "T_XACT_ABORT", 
		"T_XML", "T_YES", "T_EXTERNAL", "T_ACTIVITY_COUNT", "T_CUME_DIST", "T_CURRENT_DATE", 
		"T_CURRENT_TIMESTAMP", "T_CURRENT_USER", "T_DENSE_RANK", "T_FIRST_VALUE", 
		"T_LAG", "T_LAST_VALUE", "T_LEAD", "T_MAX_PART_STRING", "T_MIN_PART_STRING", 
		"T_MAX_PART_INT", "T_MIN_PART_INT", "T_MAX_PART_DATE", "T_MIN_PART_DATE", 
		"T_PART_COUNT", "T_PART_LOC", "T_RANK", "T_ROW_NUMBER", "T_STDEV", "T_SYSDATE", 
		"T_VARIANCE", "T_USER", "T_ADD", "T_COLON", "T_COMMA", "T_PIPE", "T_DIV", 
		"T_DOT2", "T_EQUAL", "T_EQUAL2", "T_NOTEQUAL", "T_NOTEQUAL2", "T_GREATER", 
		"T_GREATEREQUAL", "T_LESS", "T_LESSEQUAL", "T_MUL", "T_OPEN_B", "T_OPEN_P", 
		"T_OPEN_SB", "T_CLOSE_B", "T_CLOSE_P", "T_CLOSE_SB", "T_SEMICOLON", "T_SUB", 
		"T_NEGATIV", "T_BOOL", "T_WRITE", "T_AND_cpp", "L_NUMBER", "L_ID", "L_S_STRING", 
		"L_D_STRING", "L_INT", "L_DEC", "L_WS", "L_M_COMMENT", "L_S_COMMENT", 
		"L_FILE", "L_LABEL", "L_THAL"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Hplsql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HplsqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(HplsqlParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			block();
			setState(349);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<Begin_end_blockContext> begin_end_block() {
			return getRuleContexts(Begin_end_blockContext.class);
		}
		public Begin_end_blockContext begin_end_block(int i) {
			return getRuleContext(Begin_end_blockContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(353);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(351);
						begin_end_block();
						}
						break;
					case 2:
						{
						setState(352);
						stmt();
						}
						break;
					}
					}
					} 
				}
				setState(359);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Begin_end_blockContext extends ParserRuleContext {
		public TerminalNode T_BEGIN() { return getToken(HplsqlParser.T_BEGIN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Block_endContext block_end() {
			return getRuleContext(Block_endContext.class,0);
		}
		public TerminalNode T_OPEN_B() { return getToken(HplsqlParser.T_OPEN_B, 0); }
		public Block_b_endContext block_b_end() {
			return getRuleContext(Block_b_endContext.class,0);
		}
		public Begin_end_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin_end_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterBegin_end_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitBegin_end_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitBegin_end_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Begin_end_blockContext begin_end_block() throws RecognitionException {
		Begin_end_blockContext _localctx = new Begin_end_blockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_begin_end_block);
		try {
			setState(368);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				match(T_BEGIN);
				setState(361);
				block();
				setState(362);
				block_end();
				}
				break;
			case T_OPEN_B:
				enterOuterAlt(_localctx, 2);
				{
				setState(364);
				match(T_OPEN_B);
				setState(365);
				block();
				setState(366);
				block_b_end();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_b_endContext extends ParserRuleContext {
		public TerminalNode T_CLOSE_B() { return getToken(HplsqlParser.T_CLOSE_B, 0); }
		public Block_b_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_b_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterBlock_b_end(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitBlock_b_end(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitBlock_b_end(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_b_endContext block_b_end() throws RecognitionException {
		Block_b_endContext _localctx = new Block_b_endContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block_b_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			if (!(!_input.LT(2).getText().equalsIgnoreCase("TRANSACTION"))) throw new FailedPredicateException(this, "!_input.LT(2).getText().equalsIgnoreCase(\"TRANSACTION\")");
			setState(371);
			match(T_CLOSE_B);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Single_block_stmtContext extends ParserRuleContext {
		public TerminalNode T_BEGIN() { return getToken(HplsqlParser.T_BEGIN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Block_endContext block_end() {
			return getRuleContext(Block_endContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode T_SEMICOLON() { return getToken(HplsqlParser.T_SEMICOLON, 0); }
		public Single_block_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_block_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSingle_block_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSingle_block_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSingle_block_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_block_stmtContext single_block_stmt() throws RecognitionException {
		Single_block_stmtContext _localctx = new Single_block_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_single_block_stmt);
		try {
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(373);
				match(T_BEGIN);
				setState(374);
				block();
				setState(375);
				block_end();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(377);
				stmt();
				setState(379);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(378);
					match(T_SEMICOLON);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_endContext extends ParserRuleContext {
		public TerminalNode T_END() { return getToken(HplsqlParser.T_END, 0); }
		public Block_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterBlock_end(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitBlock_end(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitBlock_end(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_endContext block_end() throws RecognitionException {
		Block_endContext _localctx = new Block_endContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			if (!(!_input.LT(2).getText().equalsIgnoreCase("TRANSACTION"))) throw new FailedPredicateException(this, "!_input.LT(2).getText().equalsIgnoreCase(\"TRANSACTION\")");
			setState(384);
			match(T_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Begin_end_block_functionContext extends ParserRuleContext {
		public TerminalNode T_OPEN_B() { return getToken(HplsqlParser.T_OPEN_B, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Block_b_end_functionContext block_b_end_function() {
			return getRuleContext(Block_b_end_functionContext.class,0);
		}
		public Begin_end_block_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin_end_block_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterBegin_end_block_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitBegin_end_block_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitBegin_end_block_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Begin_end_block_functionContext begin_end_block_function() throws RecognitionException {
		Begin_end_block_functionContext _localctx = new Begin_end_block_functionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_begin_end_block_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(T_OPEN_B);
			setState(387);
			block();
			setState(388);
			block_b_end_function();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_b_end_functionContext extends ParserRuleContext {
		public Block_returnContext block_return() {
			return getRuleContext(Block_returnContext.class,0);
		}
		public TerminalNode T_CLOSE_B() { return getToken(HplsqlParser.T_CLOSE_B, 0); }
		public Block_b_end_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_b_end_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterBlock_b_end_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitBlock_b_end_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitBlock_b_end_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_b_end_functionContext block_b_end_function() throws RecognitionException {
		Block_b_end_functionContext _localctx = new Block_b_end_functionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block_b_end_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			if (!(!_input.LT(2).getText().equalsIgnoreCase("TRANSACTION"))) throw new FailedPredicateException(this, "!_input.LT(2).getText().equalsIgnoreCase(\"TRANSACTION\")");
			setState(391);
			block_return();
			setState(392);
			match(T_CLOSE_B);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Write_stmtContext extends ParserRuleContext {
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public TerminalNode T_SEMICOLON() { return getToken(HplsqlParser.T_SEMICOLON, 0); }
		public List<TerminalNode> T_ADD() { return getTokens(HplsqlParser.T_ADD); }
		public TerminalNode T_ADD(int i) {
			return getToken(HplsqlParser.T_ADD, i);
		}
		public TerminalNode T_WRITE() { return getToken(HplsqlParser.T_WRITE, 0); }
		public Write_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterWrite_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitWrite_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitWrite_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Write_stmtContext write_stmt() throws RecognitionException {
		Write_stmtContext _localctx = new Write_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_write_stmt);
		int _la;
		try {
			setState(421);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALLOCATE:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DELIMITER:
			case T_DESC:
			case T_DESCRIBE:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXEC:
			case T_EXECUTE:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FETCH:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FROM:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_GROUP:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HDFS:
			case T_HIVE:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INNER:
			case T_INOUT:
			case T_INSERT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INTO:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LEFT:
			case T_LIKE:
			case T_LIMIT:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_ORDER:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITH:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
			case L_ID:
			case L_S_STRING:
			case L_D_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				ident();
				setState(395);
				match(T_OPEN_P);
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_ADD2) | (1L << T_ALL) | (1L << T_ALLOCATE) | (1L << T_ALTER) | (1L << T_AND) | (1L << T_ANSI_NULLS) | (1L << T_ANSI_PADDING) | (1L << T_AS) | (1L << T_ASC) | (1L << T_ASSOCIATE) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BATCHSIZE) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CALLER) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLIENT) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECT) | (1L << T_COLLECTION) | (1L << T_COLUMN) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMMIT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COPY) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CREATION) | (1L << T_CREATOR) | (1L << T_CS) | (1L << T_CURRENT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_CURRENT_SCHEMA - 64)) | (1L << (T_CURSOR - 64)) | (1L << (T_DATABASE - 64)) | (1L << (T_DATA - 64)) | (1L << (T_DATE - 64)) | (1L << (T_DATETIME - 64)) | (1L << (T_DAY - 64)) | (1L << (T_DAYS - 64)) | (1L << (T_DEC - 64)) | (1L << (T_DECIMAL - 64)) | (1L << (T_DECLARE - 64)) | (1L << (T_DEFAULT - 64)) | (1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DELIMITER - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DESCRIBE - 64)) | (1L << (T_DIAGNOSTICS - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DIRECTORY - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DO - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DROP - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXEC - 64)) | (1L << (T_EXECUTE - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FETCH - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FILE - 64)) | (1L << (T_FILES - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GET - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)) | (1L << (T_GRANT - 64)) | (1L << (T_GROUP - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_HANDLER - 128)) | (1L << (T_HASH - 128)) | (1L << (T_HAVING - 128)) | (1L << (T_HDFS - 128)) | (1L << (T_HIVE - 128)) | (1L << (T_HOST - 128)) | (1L << (T_IDENTITY - 128)) | (1L << (T_IF - 128)) | (1L << (T_IGNORE - 128)) | (1L << (T_IMMEDIATE - 128)) | (1L << (T_IN - 128)) | (1L << (T_INCLUDE - 128)) | (1L << (T_INDEX - 128)) | (1L << (T_INITRANS - 128)) | (1L << (T_INNER - 128)) | (1L << (T_INOUT - 128)) | (1L << (T_INSERT - 128)) | (1L << (T_INT2 - 128)) | (1L << (T_INT4 - 128)) | (1L << (T_INT8 - 128)) | (1L << (T_INTEGER - 128)) | (1L << (T_INTERSECT - 128)) | (1L << (T_INTERVAL - 128)) | (1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCATOR - 128)) | (1L << (T_LOCATORS - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MATCHED - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MERGE - 128)) | (1L << (T_MESSAGE_TEXT - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NEW - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)) | (1L << (T_NOCOUNT - 128)) | (1L << (T_NOCOMPRESS - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_NOLOGGING - 192)) | (1L << (T_NONE - 192)) | (1L << (T_NOT - 192)) | (1L << (T_NOTFOUND - 192)) | (1L << (T_NUMERIC - 192)) | (1L << (T_NUMBER - 192)) | (1L << (T_OBJECT - 192)) | (1L << (T_OFF - 192)) | (1L << (T_ON - 192)) | (1L << (T_ONLY - 192)) | (1L << (T_OPEN - 192)) | (1L << (T_OR - 192)) | (1L << (T_ORDER - 192)) | (1L << (T_OUT - 192)) | (1L << (T_OUTER - 192)) | (1L << (T_OVER - 192)) | (1L << (T_OVERWRITE - 192)) | (1L << (T_OWNER - 192)) | (1L << (T_PACKAGE - 192)) | (1L << (T_PARTITION - 192)) | (1L << (T_PCTFREE - 192)) | (1L << (T_PCTUSED - 192)) | (1L << (T_PRECISION - 192)) | (1L << (T_PRESERVE - 192)) | (1L << (T_PRIMARY - 192)) | (1L << (T_PRINT - 192)) | (1L << (T_PROC - 192)) | (1L << (T_PROCEDURE - 192)) | (1L << (T_QUALIFY - 192)) | (1L << (T_QUERY_BAND - 192)) | (1L << (T_QUIT - 192)) | (1L << (T_QUOTED_IDENTIFIER - 192)) | (1L << (T_RAISE - 192)) | (1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESIGNAL - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROLE - 192)) | (1L << (T_ROLLBACK - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)) | (1L << (T_ROW_COUNT - 192)) | (1L << (T_RR - 192)) | (1L << (T_RS - 192)) | (1L << (T_PWD - 192)) | (1L << (T_TRIM - 192)) | (1L << (T_SCHEMA - 192)) | (1L << (T_SECOND - 192)) | (1L << (T_SECONDS - 192)) | (1L << (T_SECURITY - 192)) | (1L << (T_SEGMENT - 192)) | (1L << (T_SEL - 192)) | (1L << (T_SELECT - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_SET - 256)) | (1L << (T_SESSION - 256)) | (1L << (T_SESSIONS - 256)) | (1L << (T_SETS - 256)) | (1L << (T_SHARE - 256)) | (1L << (T_SIGNAL - 256)) | (1L << (T_SIMPLE_DOUBLE - 256)) | (1L << (T_SIMPLE_FLOAT - 256)) | (1L << (T_SMALLDATETIME - 256)) | (1L << (T_SMALLINT - 256)) | (1L << (T_SQL - 256)) | (1L << (T_SQLEXCEPTION - 256)) | (1L << (T_SQLINSERT - 256)) | (1L << (T_SQLSTATE - 256)) | (1L << (T_SQLWARNING - 256)) | (1L << (T_STATS - 256)) | (1L << (T_STATISTICS - 256)) | (1L << (T_STEP - 256)) | (1L << (T_STORAGE - 256)) | (1L << (T_STORED - 256)) | (1L << (T_SUBDIR - 256)) | (1L << (T_SUBSTRING - 256)) | (1L << (T_SUM - 256)) | (1L << (T_SUMMARY - 256)) | (1L << (T_SYS_REFCURSOR - 256)) | (1L << (T_TABLE - 256)) | (1L << (T_TABLESPACE - 256)) | (1L << (T_TEMPORARY - 256)) | (1L << (T_TERMINATED - 256)) | (1L << (T_TEXTIMAGE_ON - 256)) | (1L << (T_THEN - 256)) | (1L << (T_TIMESTAMP - 256)) | (1L << (T_TITLE - 256)) | (1L << (T_TO - 256)) | (1L << (T_TOP - 256)) | (1L << (T_TRANSACTION - 256)) | (1L << (T_TRUE - 256)) | (1L << (T_TRUNCATE - 256)) | (1L << (T_UNIQUE - 256)) | (1L << (T_UPDATE - 256)) | (1L << (T_UR - 256)) | (1L << (T_USE - 256)) | (1L << (T_USING - 256)) | (1L << (T_VALUE - 256)) | (1L << (T_VALUES - 256)) | (1L << (T_VAR - 256)) | (1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_VARYING - 256)) | (1L << (T_VOLATILE - 256)) | (1L << (T_WHILE - 256)) | (1L << (T_WITH - 256)) | (1L << (T_WITHOUT - 256)) | (1L << (T_WORK - 256)) | (1L << (T_XACT_ABORT - 256)) | (1L << (T_XML - 256)) | (1L << (T_YES - 256)))) != 0) || ((((_la - 321)) & ~0x3f) == 0 && ((1L << (_la - 321)) & ((1L << (T_ACTIVITY_COUNT - 321)) | (1L << (T_CUME_DIST - 321)) | (1L << (T_CURRENT_DATE - 321)) | (1L << (T_CURRENT_TIMESTAMP - 321)) | (1L << (T_CURRENT_USER - 321)) | (1L << (T_DENSE_RANK - 321)) | (1L << (T_FIRST_VALUE - 321)) | (1L << (T_LAG - 321)) | (1L << (T_LAST_VALUE - 321)) | (1L << (T_LEAD - 321)) | (1L << (T_PART_COUNT - 321)) | (1L << (T_PART_LOC - 321)) | (1L << (T_RANK - 321)) | (1L << (T_ROW_NUMBER - 321)) | (1L << (T_STDEV - 321)) | (1L << (T_SYSDATE - 321)) | (1L << (T_VARIANCE - 321)) | (1L << (T_USER - 321)) | (1L << (T_ADD - 321)) | (1L << (L_ID - 321)) | (1L << (L_S_STRING - 321)) | (1L << (L_D_STRING - 321)))) != 0)) {
					{
					{
					setState(397);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_ADD) {
						{
						setState(396);
						match(T_ADD);
						}
					}

					setState(399);
					ident();
					}
					}
					setState(404);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(405);
				match(T_CLOSE_P);
				setState(406);
				match(T_SEMICOLON);
				}
				break;
			case T_WRITE:
				enterOuterAlt(_localctx, 2);
				{
				setState(408);
				match(T_WRITE);
				setState(409);
				match(T_OPEN_P);
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_ADD2) | (1L << T_ALL) | (1L << T_ALLOCATE) | (1L << T_ALTER) | (1L << T_AND) | (1L << T_ANSI_NULLS) | (1L << T_ANSI_PADDING) | (1L << T_AS) | (1L << T_ASC) | (1L << T_ASSOCIATE) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BATCHSIZE) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CALLER) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLIENT) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECT) | (1L << T_COLLECTION) | (1L << T_COLUMN) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMMIT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COPY) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CREATION) | (1L << T_CREATOR) | (1L << T_CS) | (1L << T_CURRENT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_CURRENT_SCHEMA - 64)) | (1L << (T_CURSOR - 64)) | (1L << (T_DATABASE - 64)) | (1L << (T_DATA - 64)) | (1L << (T_DATE - 64)) | (1L << (T_DATETIME - 64)) | (1L << (T_DAY - 64)) | (1L << (T_DAYS - 64)) | (1L << (T_DEC - 64)) | (1L << (T_DECIMAL - 64)) | (1L << (T_DECLARE - 64)) | (1L << (T_DEFAULT - 64)) | (1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DELIMITER - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DESCRIBE - 64)) | (1L << (T_DIAGNOSTICS - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DIRECTORY - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DO - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DROP - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXEC - 64)) | (1L << (T_EXECUTE - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FETCH - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FILE - 64)) | (1L << (T_FILES - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GET - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)) | (1L << (T_GRANT - 64)) | (1L << (T_GROUP - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_HANDLER - 128)) | (1L << (T_HASH - 128)) | (1L << (T_HAVING - 128)) | (1L << (T_HDFS - 128)) | (1L << (T_HIVE - 128)) | (1L << (T_HOST - 128)) | (1L << (T_IDENTITY - 128)) | (1L << (T_IF - 128)) | (1L << (T_IGNORE - 128)) | (1L << (T_IMMEDIATE - 128)) | (1L << (T_IN - 128)) | (1L << (T_INCLUDE - 128)) | (1L << (T_INDEX - 128)) | (1L << (T_INITRANS - 128)) | (1L << (T_INNER - 128)) | (1L << (T_INOUT - 128)) | (1L << (T_INSERT - 128)) | (1L << (T_INT2 - 128)) | (1L << (T_INT4 - 128)) | (1L << (T_INT8 - 128)) | (1L << (T_INTEGER - 128)) | (1L << (T_INTERSECT - 128)) | (1L << (T_INTERVAL - 128)) | (1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCATOR - 128)) | (1L << (T_LOCATORS - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MATCHED - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MERGE - 128)) | (1L << (T_MESSAGE_TEXT - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NEW - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)) | (1L << (T_NOCOUNT - 128)) | (1L << (T_NOCOMPRESS - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_NOLOGGING - 192)) | (1L << (T_NONE - 192)) | (1L << (T_NOT - 192)) | (1L << (T_NOTFOUND - 192)) | (1L << (T_NUMERIC - 192)) | (1L << (T_NUMBER - 192)) | (1L << (T_OBJECT - 192)) | (1L << (T_OFF - 192)) | (1L << (T_ON - 192)) | (1L << (T_ONLY - 192)) | (1L << (T_OPEN - 192)) | (1L << (T_OR - 192)) | (1L << (T_ORDER - 192)) | (1L << (T_OUT - 192)) | (1L << (T_OUTER - 192)) | (1L << (T_OVER - 192)) | (1L << (T_OVERWRITE - 192)) | (1L << (T_OWNER - 192)) | (1L << (T_PACKAGE - 192)) | (1L << (T_PARTITION - 192)) | (1L << (T_PCTFREE - 192)) | (1L << (T_PCTUSED - 192)) | (1L << (T_PRECISION - 192)) | (1L << (T_PRESERVE - 192)) | (1L << (T_PRIMARY - 192)) | (1L << (T_PRINT - 192)) | (1L << (T_PROC - 192)) | (1L << (T_PROCEDURE - 192)) | (1L << (T_QUALIFY - 192)) | (1L << (T_QUERY_BAND - 192)) | (1L << (T_QUIT - 192)) | (1L << (T_QUOTED_IDENTIFIER - 192)) | (1L << (T_RAISE - 192)) | (1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESIGNAL - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROLE - 192)) | (1L << (T_ROLLBACK - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)) | (1L << (T_ROW_COUNT - 192)) | (1L << (T_RR - 192)) | (1L << (T_RS - 192)) | (1L << (T_PWD - 192)) | (1L << (T_TRIM - 192)) | (1L << (T_SCHEMA - 192)) | (1L << (T_SECOND - 192)) | (1L << (T_SECONDS - 192)) | (1L << (T_SECURITY - 192)) | (1L << (T_SEGMENT - 192)) | (1L << (T_SEL - 192)) | (1L << (T_SELECT - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_SET - 256)) | (1L << (T_SESSION - 256)) | (1L << (T_SESSIONS - 256)) | (1L << (T_SETS - 256)) | (1L << (T_SHARE - 256)) | (1L << (T_SIGNAL - 256)) | (1L << (T_SIMPLE_DOUBLE - 256)) | (1L << (T_SIMPLE_FLOAT - 256)) | (1L << (T_SMALLDATETIME - 256)) | (1L << (T_SMALLINT - 256)) | (1L << (T_SQL - 256)) | (1L << (T_SQLEXCEPTION - 256)) | (1L << (T_SQLINSERT - 256)) | (1L << (T_SQLSTATE - 256)) | (1L << (T_SQLWARNING - 256)) | (1L << (T_STATS - 256)) | (1L << (T_STATISTICS - 256)) | (1L << (T_STEP - 256)) | (1L << (T_STORAGE - 256)) | (1L << (T_STORED - 256)) | (1L << (T_SUBDIR - 256)) | (1L << (T_SUBSTRING - 256)) | (1L << (T_SUM - 256)) | (1L << (T_SUMMARY - 256)) | (1L << (T_SYS_REFCURSOR - 256)) | (1L << (T_TABLE - 256)) | (1L << (T_TABLESPACE - 256)) | (1L << (T_TEMPORARY - 256)) | (1L << (T_TERMINATED - 256)) | (1L << (T_TEXTIMAGE_ON - 256)) | (1L << (T_THEN - 256)) | (1L << (T_TIMESTAMP - 256)) | (1L << (T_TITLE - 256)) | (1L << (T_TO - 256)) | (1L << (T_TOP - 256)) | (1L << (T_TRANSACTION - 256)) | (1L << (T_TRUE - 256)) | (1L << (T_TRUNCATE - 256)) | (1L << (T_UNIQUE - 256)) | (1L << (T_UPDATE - 256)) | (1L << (T_UR - 256)) | (1L << (T_USE - 256)) | (1L << (T_USING - 256)) | (1L << (T_VALUE - 256)) | (1L << (T_VALUES - 256)) | (1L << (T_VAR - 256)) | (1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_VARYING - 256)) | (1L << (T_VOLATILE - 256)) | (1L << (T_WHILE - 256)) | (1L << (T_WITH - 256)) | (1L << (T_WITHOUT - 256)) | (1L << (T_WORK - 256)) | (1L << (T_XACT_ABORT - 256)) | (1L << (T_XML - 256)) | (1L << (T_YES - 256)))) != 0) || ((((_la - 321)) & ~0x3f) == 0 && ((1L << (_la - 321)) & ((1L << (T_ACTIVITY_COUNT - 321)) | (1L << (T_CUME_DIST - 321)) | (1L << (T_CURRENT_DATE - 321)) | (1L << (T_CURRENT_TIMESTAMP - 321)) | (1L << (T_CURRENT_USER - 321)) | (1L << (T_DENSE_RANK - 321)) | (1L << (T_FIRST_VALUE - 321)) | (1L << (T_LAG - 321)) | (1L << (T_LAST_VALUE - 321)) | (1L << (T_LEAD - 321)) | (1L << (T_PART_COUNT - 321)) | (1L << (T_PART_LOC - 321)) | (1L << (T_RANK - 321)) | (1L << (T_ROW_NUMBER - 321)) | (1L << (T_STDEV - 321)) | (1L << (T_SYSDATE - 321)) | (1L << (T_VARIANCE - 321)) | (1L << (T_USER - 321)) | (1L << (T_ADD - 321)) | (1L << (L_ID - 321)) | (1L << (L_S_STRING - 321)) | (1L << (L_D_STRING - 321)))) != 0)) {
					{
					{
					setState(411);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_ADD) {
						{
						setState(410);
						match(T_ADD);
						}
					}

					setState(413);
					ident();
					}
					}
					setState(418);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(419);
				match(T_CLOSE_P);
				setState(420);
				match(T_SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Proc_blockContext extends ParserRuleContext {
		public Begin_end_blockContext begin_end_block() {
			return getRuleContext(Begin_end_blockContext.class,0);
		}
		public Proc_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterProc_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitProc_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitProc_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Proc_blockContext proc_block() throws RecognitionException {
		Proc_blockContext _localctx = new Proc_blockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_proc_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			begin_end_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_returnContext extends ParserRuleContext {
		public TerminalNode T_RETURN() { return getToken(HplsqlParser.T_RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Semicolon_stmtContext semicolon_stmt() {
			return getRuleContext(Semicolon_stmtContext.class,0);
		}
		public Block_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterBlock_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitBlock_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitBlock_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_returnContext block_return() throws RecognitionException {
		Block_returnContext _localctx = new Block_returnContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_block_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			match(T_RETURN);
			setState(426);
			expr(0);
			setState(427);
			semicolon_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public Create_external_table_stmtContext create_external_table_stmt() {
			return getRuleContext(Create_external_table_stmtContext.class,0);
		}
		public Create_function_stmtContext create_function_stmt() {
			return getRuleContext(Create_function_stmtContext.class,0);
		}
		public Create_index_stmtContext create_index_stmt() {
			return getRuleContext(Create_index_stmtContext.class,0);
		}
		public Create_local_temp_table_stmtContext create_local_temp_table_stmt() {
			return getRuleContext(Create_local_temp_table_stmtContext.class,0);
		}
		public Create_package_stmtContext create_package_stmt() {
			return getRuleContext(Create_package_stmtContext.class,0);
		}
		public Create_package_body_stmtContext create_package_body_stmt() {
			return getRuleContext(Create_package_body_stmtContext.class,0);
		}
		public Create_procedure_stmtContext create_procedure_stmt() {
			return getRuleContext(Create_procedure_stmtContext.class,0);
		}
		public Create_table_stmtContext create_table_stmt() {
			return getRuleContext(Create_table_stmtContext.class,0);
		}
		public For_cursor_stmtContext for_cursor_stmt() {
			return getRuleContext(For_cursor_stmtContext.class,0);
		}
		public For_range_stmtContext for_range_stmt() {
			return getRuleContext(For_range_stmtContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Semicolon_stmtContext semicolon_stmt() {
			return getRuleContext(Semicolon_stmtContext.class,0);
		}
		public Create_function_cppContext create_function_cpp() {
			return getRuleContext(Create_function_cppContext.class,0);
		}
		public Cpp_stmtContext cpp_stmt() {
			return getRuleContext(Cpp_stmtContext.class,0);
		}
		public Write_stmtContext write_stmt() {
			return getRuleContext(Write_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_stmt);
		try {
			setState(445);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(429);
				create_external_table_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(430);
				create_function_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(431);
				create_index_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(432);
				create_local_temp_table_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(433);
				create_package_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(434);
				create_package_body_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(435);
				create_procedure_stmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(436);
				create_table_stmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(437);
				for_cursor_stmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(438);
				for_range_stmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(439);
				if_stmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(440);
				select_stmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(441);
				semicolon_stmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(442);
				create_function_cpp();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(443);
				cpp_stmt();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(444);
				write_stmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Semicolon_stmtContext extends ParserRuleContext {
		public TerminalNode T_SEMICOLON() { return getToken(HplsqlParser.T_SEMICOLON, 0); }
		public Semicolon_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semicolon_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSemicolon_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSemicolon_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSemicolon_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Semicolon_stmtContext semicolon_stmt() throws RecognitionException {
		Semicolon_stmtContext _localctx = new Semicolon_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_semicolon_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1 || _la==T_DIV || _la==T_SEMICOLON) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_block_inplaceContext extends ParserRuleContext {
		public List<Declare_stmt_itemContext> declare_stmt_item() {
			return getRuleContexts(Declare_stmt_itemContext.class);
		}
		public Declare_stmt_itemContext declare_stmt_item(int i) {
			return getRuleContext(Declare_stmt_itemContext.class,i);
		}
		public List<TerminalNode> T_SEMICOLON() { return getTokens(HplsqlParser.T_SEMICOLON); }
		public TerminalNode T_SEMICOLON(int i) {
			return getToken(HplsqlParser.T_SEMICOLON, i);
		}
		public Declare_block_inplaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_block_inplace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDeclare_block_inplace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDeclare_block_inplace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDeclare_block_inplace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_block_inplaceContext declare_block_inplace() throws RecognitionException {
		Declare_block_inplaceContext _localctx = new Declare_block_inplaceContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_declare_block_inplace);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			declare_stmt_item();
			setState(450);
			match(T_SEMICOLON);
			setState(456);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(451);
					declare_stmt_item();
					setState(452);
					match(T_SEMICOLON);
					}
					} 
				}
				setState(458);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_stmt_itemContext extends ParserRuleContext {
		public Declare_cursor_itemContext declare_cursor_item() {
			return getRuleContext(Declare_cursor_itemContext.class,0);
		}
		public Declare_condition_itemContext declare_condition_item() {
			return getRuleContext(Declare_condition_itemContext.class,0);
		}
		public Declare_handler_itemContext declare_handler_item() {
			return getRuleContext(Declare_handler_itemContext.class,0);
		}
		public Declare_var_itemContext declare_var_item() {
			return getRuleContext(Declare_var_itemContext.class,0);
		}
		public Declare_temporary_table_itemContext declare_temporary_table_item() {
			return getRuleContext(Declare_temporary_table_itemContext.class,0);
		}
		public Declare_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_stmt_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDeclare_stmt_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDeclare_stmt_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDeclare_stmt_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_stmt_itemContext declare_stmt_item() throws RecognitionException {
		Declare_stmt_itemContext _localctx = new Declare_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_declare_stmt_item);
		try {
			setState(464);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(459);
				declare_cursor_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(460);
				declare_condition_item();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(461);
				declare_handler_item();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(462);
				declare_var_item();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(463);
				declare_temporary_table_item();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_var_itemContext extends ParserRuleContext {
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public Dtype_lenContext dtype_len() {
			return getRuleContext(Dtype_lenContext.class,0);
		}
		public List<Dtype_attrContext> dtype_attr() {
			return getRuleContexts(Dtype_attrContext.class);
		}
		public Dtype_attrContext dtype_attr(int i) {
			return getRuleContext(Dtype_attrContext.class,i);
		}
		public Dtype_defaultContext dtype_default() {
			return getRuleContext(Dtype_defaultContext.class,0);
		}
		public TerminalNode T_CONSTANT() { return getToken(HplsqlParser.T_CONSTANT, 0); }
		public Declare_var_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_var_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDeclare_var_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDeclare_var_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDeclare_var_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_var_itemContext declare_var_item() throws RecognitionException {
		Declare_var_itemContext _localctx = new Declare_var_itemContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_declare_var_item);
		int _la;
		try {
			setState(501);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(466);
				ident();
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(467);
					match(T_COMMA);
					setState(468);
					ident();
					}
					}
					setState(473);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(474);
					match(T_AS);
					}
				}

				setState(477);
				dtype();
				setState(479);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(478);
					dtype_len();
					}
				}

				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_CASESPECIFIC) | (1L << T_CHARACTER) | (1L << T_CS))) != 0) || _la==T_NOT || _la==T_NULL) {
					{
					{
					setState(481);
					dtype_attr();
					}
					}
					setState(486);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(488);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_DEFAULT || ((((_la - 314)) & ~0x3f) == 0 && ((1L << (_la - 314)) & ((1L << (T_WITH - 314)) | (1L << (T_COLON - 314)) | (1L << (T_EQUAL - 314)))) != 0)) {
					{
					setState(487);
					dtype_default();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(490);
				ident();
				setState(491);
				match(T_CONSTANT);
				setState(493);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(492);
					match(T_AS);
					}
				}

				setState(495);
				dtype();
				setState(497);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(496);
					dtype_len();
					}
				}

				setState(499);
				dtype_default();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_condition_itemContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_CONDITION() { return getToken(HplsqlParser.T_CONDITION, 0); }
		public Declare_condition_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_condition_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDeclare_condition_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDeclare_condition_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDeclare_condition_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_condition_itemContext declare_condition_item() throws RecognitionException {
		Declare_condition_itemContext _localctx = new Declare_condition_itemContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_declare_condition_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			ident();
			setState(504);
			match(T_CONDITION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_cursor_itemContext extends ParserRuleContext {
		public TerminalNode T_IS() { return getToken(HplsqlParser.T_IS, 0); }
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public TerminalNode T_FOR() { return getToken(HplsqlParser.T_FOR, 0); }
		public TerminalNode T_CURSOR() { return getToken(HplsqlParser.T_CURSOR, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Cursor_with_returnContext cursor_with_return() {
			return getRuleContext(Cursor_with_returnContext.class,0);
		}
		public Cursor_without_returnContext cursor_without_return() {
			return getRuleContext(Cursor_without_returnContext.class,0);
		}
		public Declare_cursor_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_cursor_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDeclare_cursor_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDeclare_cursor_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDeclare_cursor_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_cursor_itemContext declare_cursor_item() throws RecognitionException {
		Declare_cursor_itemContext _localctx = new Declare_cursor_itemContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_declare_cursor_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(506);
				match(T_CURSOR);
				setState(507);
				ident();
				}
				break;
			case 2:
				{
				setState(508);
				ident();
				setState(509);
				match(T_CURSOR);
				}
				break;
			}
			setState(515);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_WITH:
				{
				setState(513);
				cursor_with_return();
				}
				break;
			case T_WITHOUT:
				{
				setState(514);
				cursor_without_return();
				}
				break;
			case T_AS:
			case T_FOR:
			case T_IS:
				break;
			default:
				break;
			}
			setState(517);
			_la = _input.LA(1);
			if ( !(_la==T_AS || _la==T_FOR || _la==T_IS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(520);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(518);
				select_stmt();
				}
				break;
			case 2:
				{
				setState(519);
				expr(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cursor_with_returnContext extends ParserRuleContext {
		public TerminalNode T_WITH() { return getToken(HplsqlParser.T_WITH, 0); }
		public TerminalNode T_RETURN() { return getToken(HplsqlParser.T_RETURN, 0); }
		public TerminalNode T_ONLY() { return getToken(HplsqlParser.T_ONLY, 0); }
		public TerminalNode T_TO() { return getToken(HplsqlParser.T_TO, 0); }
		public TerminalNode T_CALLER() { return getToken(HplsqlParser.T_CALLER, 0); }
		public TerminalNode T_CLIENT() { return getToken(HplsqlParser.T_CLIENT, 0); }
		public Cursor_with_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursor_with_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCursor_with_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCursor_with_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCursor_with_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cursor_with_returnContext cursor_with_return() throws RecognitionException {
		Cursor_with_returnContext _localctx = new Cursor_with_returnContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cursor_with_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			match(T_WITH);
			setState(523);
			match(T_RETURN);
			setState(525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ONLY) {
				{
				setState(524);
				match(T_ONLY);
				}
			}

			setState(529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_TO) {
				{
				setState(527);
				match(T_TO);
				setState(528);
				_la = _input.LA(1);
				if ( !(_la==T_CALLER || _la==T_CLIENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cursor_without_returnContext extends ParserRuleContext {
		public TerminalNode T_WITHOUT() { return getToken(HplsqlParser.T_WITHOUT, 0); }
		public TerminalNode T_RETURN() { return getToken(HplsqlParser.T_RETURN, 0); }
		public Cursor_without_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursor_without_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCursor_without_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCursor_without_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCursor_without_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cursor_without_returnContext cursor_without_return() throws RecognitionException {
		Cursor_without_returnContext _localctx = new Cursor_without_returnContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_cursor_without_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			match(T_WITHOUT);
			setState(532);
			match(T_RETURN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_handler_itemContext extends ParserRuleContext {
		public TerminalNode T_HANDLER() { return getToken(HplsqlParser.T_HANDLER, 0); }
		public TerminalNode T_FOR() { return getToken(HplsqlParser.T_FOR, 0); }
		public Single_block_stmtContext single_block_stmt() {
			return getRuleContext(Single_block_stmtContext.class,0);
		}
		public TerminalNode T_CONTINUE() { return getToken(HplsqlParser.T_CONTINUE, 0); }
		public TerminalNode T_EXIT() { return getToken(HplsqlParser.T_EXIT, 0); }
		public TerminalNode T_SQLEXCEPTION() { return getToken(HplsqlParser.T_SQLEXCEPTION, 0); }
		public TerminalNode T_SQLWARNING() { return getToken(HplsqlParser.T_SQLWARNING, 0); }
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public TerminalNode T_FOUND() { return getToken(HplsqlParser.T_FOUND, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Declare_handler_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_handler_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDeclare_handler_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDeclare_handler_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDeclare_handler_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_handler_itemContext declare_handler_item() throws RecognitionException {
		Declare_handler_itemContext _localctx = new Declare_handler_itemContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_declare_handler_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			_la = _input.LA(1);
			if ( !(_la==T_CONTINUE || _la==T_EXIT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(535);
			match(T_HANDLER);
			setState(536);
			match(T_FOR);
			setState(542);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(537);
				match(T_SQLEXCEPTION);
				}
				break;
			case 2:
				{
				setState(538);
				match(T_SQLWARNING);
				}
				break;
			case 3:
				{
				setState(539);
				match(T_NOT);
				setState(540);
				match(T_FOUND);
				}
				break;
			case 4:
				{
				setState(541);
				ident();
				}
				break;
			}
			setState(544);
			single_block_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_temporary_table_itemContext extends ParserRuleContext {
		public TerminalNode T_TEMPORARY() { return getToken(HplsqlParser.T_TEMPORARY, 0); }
		public TerminalNode T_TABLE() { return getToken(HplsqlParser.T_TABLE, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_table_definitionContext create_table_definition() {
			return getRuleContext(Create_table_definitionContext.class,0);
		}
		public TerminalNode T_GLOBAL() { return getToken(HplsqlParser.T_GLOBAL, 0); }
		public Create_table_preoptionsContext create_table_preoptions() {
			return getRuleContext(Create_table_preoptionsContext.class,0);
		}
		public Declare_temporary_table_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_temporary_table_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDeclare_temporary_table_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDeclare_temporary_table_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDeclare_temporary_table_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_temporary_table_itemContext declare_temporary_table_item() throws RecognitionException {
		Declare_temporary_table_itemContext _localctx = new Declare_temporary_table_itemContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_declare_temporary_table_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_GLOBAL) {
				{
				setState(546);
				match(T_GLOBAL);
				}
			}

			setState(549);
			match(T_TEMPORARY);
			setState(550);
			match(T_TABLE);
			setState(551);
			ident();
			setState(553);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ROW || _la==T_STORED || _la==T_COMMA) {
				{
				setState(552);
				create_table_preoptions();
				}
			}

			setState(555);
			create_table_definition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_stmtContext extends ParserRuleContext {
		public TerminalNode T_CREATE() { return getToken(HplsqlParser.T_CREATE, 0); }
		public TerminalNode T_TABLE() { return getToken(HplsqlParser.T_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Create_table_definitionContext create_table_definition() {
			return getRuleContext(Create_table_definitionContext.class,0);
		}
		public Create_table_preoptionsContext create_table_preoptions() {
			return getRuleContext(Create_table_preoptionsContext.class,0);
		}
		public Create_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_stmtContext create_table_stmt() throws RecognitionException {
		Create_table_stmtContext _localctx = new Create_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_create_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			match(T_CREATE);
			setState(558);
			match(T_TABLE);
			setState(559);
			table_name();
			setState(561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ROW || _la==T_STORED || _la==T_COMMA) {
				{
				setState(560);
				create_table_preoptions();
				}
			}

			setState(563);
			create_table_definition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_external_table_stmtContext extends ParserRuleContext {
		public TerminalNode T_CREATE() { return getToken(HplsqlParser.T_CREATE, 0); }
		public TerminalNode T_EXTERNAL() { return getToken(HplsqlParser.T_EXTERNAL, 0); }
		public TerminalNode T_TABLE() { return getToken(HplsqlParser.T_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Create_external_table_definitionContext create_external_table_definition() {
			return getRuleContext(Create_external_table_definitionContext.class,0);
		}
		public Create_table_preoptionsContext create_table_preoptions() {
			return getRuleContext(Create_table_preoptionsContext.class,0);
		}
		public Create_external_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_external_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_external_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_external_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_external_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_external_table_stmtContext create_external_table_stmt() throws RecognitionException {
		Create_external_table_stmtContext _localctx = new Create_external_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_create_external_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			match(T_CREATE);
			setState(566);
			match(T_EXTERNAL);
			setState(567);
			match(T_TABLE);
			setState(568);
			table_name();
			setState(570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ROW || _la==T_STORED || _la==T_COMMA) {
				{
				setState(569);
				create_table_preoptions();
				}
			}

			setState(572);
			create_external_table_definition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_local_temp_table_stmtContext extends ParserRuleContext {
		public TerminalNode T_CREATE() { return getToken(HplsqlParser.T_CREATE, 0); }
		public TerminalNode T_TABLE() { return getToken(HplsqlParser.T_TABLE, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_table_definitionContext create_table_definition() {
			return getRuleContext(Create_table_definitionContext.class,0);
		}
		public TerminalNode T_LOCAL() { return getToken(HplsqlParser.T_LOCAL, 0); }
		public TerminalNode T_TEMPORARY() { return getToken(HplsqlParser.T_TEMPORARY, 0); }
		public TerminalNode T_VOLATILE() { return getToken(HplsqlParser.T_VOLATILE, 0); }
		public Create_table_preoptionsContext create_table_preoptions() {
			return getRuleContext(Create_table_preoptionsContext.class,0);
		}
		public TerminalNode T_SET() { return getToken(HplsqlParser.T_SET, 0); }
		public TerminalNode T_MULTISET() { return getToken(HplsqlParser.T_MULTISET, 0); }
		public Create_local_temp_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_local_temp_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_local_temp_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_local_temp_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_local_temp_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_local_temp_table_stmtContext create_local_temp_table_stmt() throws RecognitionException {
		Create_local_temp_table_stmtContext _localctx = new Create_local_temp_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_create_local_temp_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			match(T_CREATE);
			setState(581);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LOCAL:
				{
				setState(575);
				match(T_LOCAL);
				setState(576);
				match(T_TEMPORARY);
				}
				break;
			case T_MULTISET:
			case T_SET:
			case T_VOLATILE:
				{
				setState(578);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_MULTISET || _la==T_SET) {
					{
					setState(577);
					_la = _input.LA(1);
					if ( !(_la==T_MULTISET || _la==T_SET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(580);
				match(T_VOLATILE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(583);
			match(T_TABLE);
			setState(584);
			ident();
			setState(586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ROW || _la==T_STORED || _la==T_COMMA) {
				{
				setState(585);
				create_table_preoptions();
				}
			}

			setState(588);
			create_table_definition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_definitionContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Create_table_columnsContext create_table_columns() {
			return getRuleContext(Create_table_columnsContext.class,0);
		}
		public Create_table_optionsContext create_table_options() {
			return getRuleContext(Create_table_optionsContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public Create_table_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_definitionContext create_table_definition() throws RecognitionException {
		Create_table_definitionContext _localctx = new Create_table_definitionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_create_table_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(591);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(590);
					match(T_AS);
					}
				}

				setState(593);
				match(T_OPEN_P);
				setState(594);
				select_stmt();
				setState(595);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(598);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(597);
					match(T_AS);
					}
				}

				setState(600);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(601);
				match(T_OPEN_P);
				setState(602);
				create_table_columns();
				setState(603);
				match(T_CLOSE_P);
				}
				break;
			}
			setState(608);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(607);
				create_table_options();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_external_table_definitionContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Create_table_optionsContext create_table_options() {
			return getRuleContext(Create_table_optionsContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public List<Create_external_table_columnsContext> create_external_table_columns() {
			return getRuleContexts(Create_external_table_columnsContext.class);
		}
		public Create_external_table_columnsContext create_external_table_columns(int i) {
			return getRuleContext(Create_external_table_columnsContext.class,i);
		}
		public Create_external_table_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_external_table_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_external_table_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_external_table_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_external_table_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_external_table_definitionContext create_external_table_definition() throws RecognitionException {
		Create_external_table_definitionContext _localctx = new Create_external_table_definitionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_create_external_table_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(611);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(610);
					match(T_AS);
					}
				}

				setState(613);
				match(T_OPEN_P);
				setState(614);
				select_stmt();
				setState(615);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(618);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(617);
					match(T_AS);
					}
				}

				setState(620);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(621);
				match(T_OPEN_P);
				setState(625);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_ADD2) | (1L << T_ALL) | (1L << T_ALLOCATE) | (1L << T_ALTER) | (1L << T_AND) | (1L << T_ANSI_NULLS) | (1L << T_ANSI_PADDING) | (1L << T_AS) | (1L << T_ASC) | (1L << T_ASSOCIATE) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BATCHSIZE) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CALLER) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLIENT) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECT) | (1L << T_COLLECTION) | (1L << T_COLUMN) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMMIT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COPY) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CREATION) | (1L << T_CREATOR) | (1L << T_CS) | (1L << T_CURRENT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_CURRENT_SCHEMA - 64)) | (1L << (T_CURSOR - 64)) | (1L << (T_DATABASE - 64)) | (1L << (T_DATA - 64)) | (1L << (T_DATE - 64)) | (1L << (T_DATETIME - 64)) | (1L << (T_DAY - 64)) | (1L << (T_DAYS - 64)) | (1L << (T_DEC - 64)) | (1L << (T_DECIMAL - 64)) | (1L << (T_DECLARE - 64)) | (1L << (T_DEFAULT - 64)) | (1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DELIMITER - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DESCRIBE - 64)) | (1L << (T_DIAGNOSTICS - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DIRECTORY - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DO - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DROP - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXEC - 64)) | (1L << (T_EXECUTE - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FETCH - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FILE - 64)) | (1L << (T_FILES - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GET - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)) | (1L << (T_GRANT - 64)) | (1L << (T_GROUP - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_HANDLER - 128)) | (1L << (T_HASH - 128)) | (1L << (T_HAVING - 128)) | (1L << (T_HDFS - 128)) | (1L << (T_HIVE - 128)) | (1L << (T_HOST - 128)) | (1L << (T_IDENTITY - 128)) | (1L << (T_IF - 128)) | (1L << (T_IGNORE - 128)) | (1L << (T_IMMEDIATE - 128)) | (1L << (T_IN - 128)) | (1L << (T_INCLUDE - 128)) | (1L << (T_INDEX - 128)) | (1L << (T_INITRANS - 128)) | (1L << (T_INNER - 128)) | (1L << (T_INOUT - 128)) | (1L << (T_INSERT - 128)) | (1L << (T_INT2 - 128)) | (1L << (T_INT4 - 128)) | (1L << (T_INT8 - 128)) | (1L << (T_INTEGER - 128)) | (1L << (T_INTERSECT - 128)) | (1L << (T_INTERVAL - 128)) | (1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCATOR - 128)) | (1L << (T_LOCATORS - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MATCHED - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MERGE - 128)) | (1L << (T_MESSAGE_TEXT - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NEW - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)) | (1L << (T_NOCOUNT - 128)) | (1L << (T_NOCOMPRESS - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_NOLOGGING - 192)) | (1L << (T_NONE - 192)) | (1L << (T_NOT - 192)) | (1L << (T_NOTFOUND - 192)) | (1L << (T_NUMERIC - 192)) | (1L << (T_NUMBER - 192)) | (1L << (T_OBJECT - 192)) | (1L << (T_OFF - 192)) | (1L << (T_ON - 192)) | (1L << (T_ONLY - 192)) | (1L << (T_OPEN - 192)) | (1L << (T_OR - 192)) | (1L << (T_ORDER - 192)) | (1L << (T_OUT - 192)) | (1L << (T_OUTER - 192)) | (1L << (T_OVER - 192)) | (1L << (T_OVERWRITE - 192)) | (1L << (T_OWNER - 192)) | (1L << (T_PACKAGE - 192)) | (1L << (T_PARTITION - 192)) | (1L << (T_PCTFREE - 192)) | (1L << (T_PCTUSED - 192)) | (1L << (T_PRECISION - 192)) | (1L << (T_PRESERVE - 192)) | (1L << (T_PRIMARY - 192)) | (1L << (T_PRINT - 192)) | (1L << (T_PROC - 192)) | (1L << (T_PROCEDURE - 192)) | (1L << (T_QUALIFY - 192)) | (1L << (T_QUERY_BAND - 192)) | (1L << (T_QUIT - 192)) | (1L << (T_QUOTED_IDENTIFIER - 192)) | (1L << (T_RAISE - 192)) | (1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESIGNAL - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROLE - 192)) | (1L << (T_ROLLBACK - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)) | (1L << (T_ROW_COUNT - 192)) | (1L << (T_RR - 192)) | (1L << (T_RS - 192)) | (1L << (T_PWD - 192)) | (1L << (T_TRIM - 192)) | (1L << (T_SCHEMA - 192)) | (1L << (T_SECOND - 192)) | (1L << (T_SECONDS - 192)) | (1L << (T_SECURITY - 192)) | (1L << (T_SEGMENT - 192)) | (1L << (T_SEL - 192)) | (1L << (T_SELECT - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_SET - 256)) | (1L << (T_SESSION - 256)) | (1L << (T_SESSIONS - 256)) | (1L << (T_SETS - 256)) | (1L << (T_SHARE - 256)) | (1L << (T_SIGNAL - 256)) | (1L << (T_SIMPLE_DOUBLE - 256)) | (1L << (T_SIMPLE_FLOAT - 256)) | (1L << (T_SMALLDATETIME - 256)) | (1L << (T_SMALLINT - 256)) | (1L << (T_SQL - 256)) | (1L << (T_SQLEXCEPTION - 256)) | (1L << (T_SQLINSERT - 256)) | (1L << (T_SQLSTATE - 256)) | (1L << (T_SQLWARNING - 256)) | (1L << (T_STATS - 256)) | (1L << (T_STATISTICS - 256)) | (1L << (T_STEP - 256)) | (1L << (T_STORAGE - 256)) | (1L << (T_STORED - 256)) | (1L << (T_SUBDIR - 256)) | (1L << (T_SUBSTRING - 256)) | (1L << (T_SUM - 256)) | (1L << (T_SUMMARY - 256)) | (1L << (T_SYS_REFCURSOR - 256)) | (1L << (T_TABLE - 256)) | (1L << (T_TABLESPACE - 256)) | (1L << (T_TEMPORARY - 256)) | (1L << (T_TERMINATED - 256)) | (1L << (T_TEXTIMAGE_ON - 256)) | (1L << (T_THEN - 256)) | (1L << (T_TIMESTAMP - 256)) | (1L << (T_TITLE - 256)) | (1L << (T_TO - 256)) | (1L << (T_TOP - 256)) | (1L << (T_TRANSACTION - 256)) | (1L << (T_TRUE - 256)) | (1L << (T_TRUNCATE - 256)) | (1L << (T_UNIQUE - 256)) | (1L << (T_UPDATE - 256)) | (1L << (T_UR - 256)) | (1L << (T_USE - 256)) | (1L << (T_USING - 256)) | (1L << (T_VALUE - 256)) | (1L << (T_VALUES - 256)) | (1L << (T_VAR - 256)) | (1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_VARYING - 256)) | (1L << (T_VOLATILE - 256)) | (1L << (T_WHILE - 256)) | (1L << (T_WITH - 256)) | (1L << (T_WITHOUT - 256)) | (1L << (T_WORK - 256)) | (1L << (T_XACT_ABORT - 256)) | (1L << (T_XML - 256)) | (1L << (T_YES - 256)))) != 0) || ((((_la - 321)) & ~0x3f) == 0 && ((1L << (_la - 321)) & ((1L << (T_ACTIVITY_COUNT - 321)) | (1L << (T_CUME_DIST - 321)) | (1L << (T_CURRENT_DATE - 321)) | (1L << (T_CURRENT_TIMESTAMP - 321)) | (1L << (T_CURRENT_USER - 321)) | (1L << (T_DENSE_RANK - 321)) | (1L << (T_FIRST_VALUE - 321)) | (1L << (T_LAG - 321)) | (1L << (T_LAST_VALUE - 321)) | (1L << (T_LEAD - 321)) | (1L << (T_PART_COUNT - 321)) | (1L << (T_PART_LOC - 321)) | (1L << (T_RANK - 321)) | (1L << (T_ROW_NUMBER - 321)) | (1L << (T_STDEV - 321)) | (1L << (T_SYSDATE - 321)) | (1L << (T_VARIANCE - 321)) | (1L << (T_USER - 321)) | (1L << (T_COMMA - 321)) | (1L << (L_ID - 321)) | (1L << (L_S_STRING - 321)) | (1L << (L_D_STRING - 321)))) != 0)) {
					{
					{
					setState(622);
					create_external_table_columns();
					}
					}
					setState(627);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(628);
				match(T_CLOSE_P);
				}
				break;
			}
			setState(632);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(631);
				create_table_options();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_external_table_columnsContext extends ParserRuleContext {
		public Create_external_table_columns_itemContext create_external_table_columns_item() {
			return getRuleContext(Create_external_table_columns_itemContext.class,0);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public List<TerminalNode> T_COMMENT() { return getTokens(HplsqlParser.T_COMMENT); }
		public TerminalNode T_COMMENT(int i) {
			return getToken(HplsqlParser.T_COMMENT, i);
		}
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public Create_external_table_columnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_external_table_columns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_external_table_columns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_external_table_columns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_external_table_columns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_external_table_columnsContext create_external_table_columns() throws RecognitionException {
		Create_external_table_columnsContext _localctx = new Create_external_table_columnsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_create_external_table_columns);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(634);
				match(T_COMMA);
				}
				}
				setState(639);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(640);
			create_external_table_columns_item();
			setState(645);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(641);
					match(T_COMMENT);
					setState(642);
					string();
					}
					} 
				}
				setState(647);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_external_table_columns_itemContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public Create_external_table_columns_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_external_table_columns_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_external_table_columns_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_external_table_columns_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_external_table_columns_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_external_table_columns_itemContext create_external_table_columns_item() throws RecognitionException {
		Create_external_table_columns_itemContext _localctx = new Create_external_table_columns_itemContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_create_external_table_columns_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			column_name();
			setState(649);
			dtype();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_columnsContext extends ParserRuleContext {
		public List<Create_table_columns_itemContext> create_table_columns_item() {
			return getRuleContexts(Create_table_columns_itemContext.class);
		}
		public Create_table_columns_itemContext create_table_columns_item(int i) {
			return getRuleContext(Create_table_columns_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Create_table_columnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_columns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_columns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_columns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_columns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_columnsContext create_table_columns() throws RecognitionException {
		Create_table_columnsContext _localctx = new Create_table_columnsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_create_table_columns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			create_table_columns_item();
			setState(656);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(652);
				match(T_COMMA);
				setState(653);
				create_table_columns_item();
				}
				}
				setState(658);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_columns_itemContext extends ParserRuleContext {
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Create_table_column_consContext create_table_column_cons() {
			return getRuleContext(Create_table_column_consContext.class,0);
		}
		public TerminalNode T_CONSTRAINT() { return getToken(HplsqlParser.T_CONSTRAINT, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_table_columns_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_columns_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_columns_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_columns_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_columns_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_columns_itemContext create_table_columns_item() throws RecognitionException {
		Create_table_columns_itemContext _localctx = new Create_table_columns_itemContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_create_table_columns_item);
		int _la;
		try {
			setState(667);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_BIGINT:
			case T_DOUBLE:
			case T_FLOAT:
			case T_REAL:
			case T_INT:
			case T_STRING:
			case T_VAR:
			case T_BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(659);
				dtype();
				setState(660);
				column_name();
				}
				break;
			case T_CONSTRAINT:
			case T_FOREIGN:
			case T_PRIMARY:
				enterOuterAlt(_localctx, 2);
				{
				setState(664);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_CONSTRAINT) {
					{
					setState(662);
					match(T_CONSTRAINT);
					setState(663);
					ident();
					}
				}

				setState(666);
				create_table_column_cons();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_nameContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitColumn_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_column_inline_consContext extends ParserRuleContext {
		public Dtype_defaultContext dtype_default() {
			return getRuleContext(Dtype_defaultContext.class,0);
		}
		public TerminalNode T_NULL() { return getToken(HplsqlParser.T_NULL, 0); }
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public TerminalNode T_PRIMARY() { return getToken(HplsqlParser.T_PRIMARY, 0); }
		public TerminalNode T_KEY() { return getToken(HplsqlParser.T_KEY, 0); }
		public TerminalNode T_UNIQUE() { return getToken(HplsqlParser.T_UNIQUE, 0); }
		public TerminalNode T_REFERENCES() { return getToken(HplsqlParser.T_REFERENCES, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<Create_table_fk_actionContext> create_table_fk_action() {
			return getRuleContexts(Create_table_fk_actionContext.class);
		}
		public Create_table_fk_actionContext create_table_fk_action(int i) {
			return getRuleContext(Create_table_fk_actionContext.class,i);
		}
		public TerminalNode T_IDENTITY() { return getToken(HplsqlParser.T_IDENTITY, 0); }
		public List<TerminalNode> L_INT() { return getTokens(HplsqlParser.L_INT); }
		public TerminalNode L_INT(int i) {
			return getToken(HplsqlParser.L_INT, i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public TerminalNode T_AUTO_INCREMENT() { return getToken(HplsqlParser.T_AUTO_INCREMENT, 0); }
		public TerminalNode T_ENABLE() { return getToken(HplsqlParser.T_ENABLE, 0); }
		public Create_table_column_inline_consContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_column_inline_cons; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_column_inline_cons(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_column_inline_cons(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_column_inline_cons(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_column_inline_consContext create_table_column_inline_cons() throws RecognitionException {
		Create_table_column_inline_consContext _localctx = new Create_table_column_inline_consContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_create_table_column_inline_cons);
		int _la;
		try {
			setState(703);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_DEFAULT:
			case T_WITH:
			case T_COLON:
			case T_EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(671);
				dtype_default();
				}
				break;
			case T_NOT:
			case T_NULL:
				enterOuterAlt(_localctx, 2);
				{
				setState(673);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(672);
					match(T_NOT);
					}
				}

				setState(675);
				match(T_NULL);
				}
				break;
			case T_PRIMARY:
				enterOuterAlt(_localctx, 3);
				{
				setState(676);
				match(T_PRIMARY);
				setState(677);
				match(T_KEY);
				}
				break;
			case T_UNIQUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(678);
				match(T_UNIQUE);
				}
				break;
			case T_REFERENCES:
				enterOuterAlt(_localctx, 5);
				{
				setState(679);
				match(T_REFERENCES);
				setState(680);
				table_name();
				setState(681);
				match(T_OPEN_P);
				setState(682);
				ident();
				setState(683);
				match(T_CLOSE_P);
				setState(687);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_ON) {
					{
					{
					setState(684);
					create_table_fk_action();
					}
					}
					setState(689);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T_IDENTITY:
				enterOuterAlt(_localctx, 6);
				{
				setState(690);
				match(T_IDENTITY);
				setState(691);
				match(T_OPEN_P);
				setState(692);
				match(L_INT);
				setState(697);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(693);
					match(T_COMMA);
					setState(694);
					match(L_INT);
					}
					}
					setState(699);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(700);
				match(T_CLOSE_P);
				}
				break;
			case T_AUTO_INCREMENT:
				enterOuterAlt(_localctx, 7);
				{
				setState(701);
				match(T_AUTO_INCREMENT);
				}
				break;
			case T_ENABLE:
				enterOuterAlt(_localctx, 8);
				{
				setState(702);
				match(T_ENABLE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_column_consContext extends ParserRuleContext {
		public TerminalNode T_PRIMARY() { return getToken(HplsqlParser.T_PRIMARY, 0); }
		public TerminalNode T_KEY() { return getToken(HplsqlParser.T_KEY, 0); }
		public List<TerminalNode> T_OPEN_P() { return getTokens(HplsqlParser.T_OPEN_P); }
		public TerminalNode T_OPEN_P(int i) {
			return getToken(HplsqlParser.T_OPEN_P, i);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> T_CLOSE_P() { return getTokens(HplsqlParser.T_CLOSE_P); }
		public TerminalNode T_CLOSE_P(int i) {
			return getToken(HplsqlParser.T_CLOSE_P, i);
		}
		public TerminalNode T_CLUSTERED() { return getToken(HplsqlParser.T_CLUSTERED, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public TerminalNode T_ENABLE() { return getToken(HplsqlParser.T_ENABLE, 0); }
		public Index_storage_clauseContext index_storage_clause() {
			return getRuleContext(Index_storage_clauseContext.class,0);
		}
		public List<TerminalNode> T_ASC() { return getTokens(HplsqlParser.T_ASC); }
		public TerminalNode T_ASC(int i) {
			return getToken(HplsqlParser.T_ASC, i);
		}
		public List<TerminalNode> T_DESC() { return getTokens(HplsqlParser.T_DESC); }
		public TerminalNode T_DESC(int i) {
			return getToken(HplsqlParser.T_DESC, i);
		}
		public TerminalNode T_FOREIGN() { return getToken(HplsqlParser.T_FOREIGN, 0); }
		public TerminalNode T_REFERENCES() { return getToken(HplsqlParser.T_REFERENCES, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<Create_table_fk_actionContext> create_table_fk_action() {
			return getRuleContexts(Create_table_fk_actionContext.class);
		}
		public Create_table_fk_actionContext create_table_fk_action(int i) {
			return getRuleContext(Create_table_fk_actionContext.class,i);
		}
		public Create_table_column_consContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_column_cons; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_column_cons(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_column_cons(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_column_cons(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_column_consContext create_table_column_cons() throws RecognitionException {
		Create_table_column_consContext _localctx = new Create_table_column_consContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_create_table_column_cons);
		int _la;
		try {
			setState(762);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(705);
				match(T_PRIMARY);
				setState(706);
				match(T_KEY);
				setState(708);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_CLUSTERED) {
					{
					setState(707);
					match(T_CLUSTERED);
					}
				}

				setState(710);
				match(T_OPEN_P);
				setState(711);
				ident();
				setState(713);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ASC || _la==T_DESC) {
					{
					setState(712);
					_la = _input.LA(1);
					if ( !(_la==T_ASC || _la==T_DESC) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(722);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(715);
					match(T_COMMA);
					setState(716);
					ident();
					setState(718);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_ASC || _la==T_DESC) {
						{
						setState(717);
						_la = _input.LA(1);
						if ( !(_la==T_ASC || _la==T_DESC) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					}
					}
					setState(724);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(725);
				match(T_CLOSE_P);
				setState(727);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ENABLE) {
					{
					setState(726);
					match(T_ENABLE);
					}
				}

				setState(730);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_WITH) {
					{
					setState(729);
					index_storage_clause();
					}
				}

				}
				break;
			case T_FOREIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(732);
				match(T_FOREIGN);
				setState(733);
				match(T_KEY);
				setState(734);
				match(T_OPEN_P);
				setState(735);
				ident();
				setState(740);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(736);
					match(T_COMMA);
					setState(737);
					ident();
					}
					}
					setState(742);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(743);
				match(T_CLOSE_P);
				setState(744);
				match(T_REFERENCES);
				setState(745);
				table_name();
				setState(746);
				match(T_OPEN_P);
				setState(747);
				ident();
				setState(752);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(748);
					match(T_COMMA);
					setState(749);
					ident();
					}
					}
					setState(754);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(755);
				match(T_CLOSE_P);
				setState(759);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_ON) {
					{
					{
					setState(756);
					create_table_fk_action();
					}
					}
					setState(761);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_fk_actionContext extends ParserRuleContext {
		public TerminalNode T_ON() { return getToken(HplsqlParser.T_ON, 0); }
		public TerminalNode T_UPDATE() { return getToken(HplsqlParser.T_UPDATE, 0); }
		public TerminalNode T_DELETE() { return getToken(HplsqlParser.T_DELETE, 0); }
		public TerminalNode T_NO() { return getToken(HplsqlParser.T_NO, 0); }
		public TerminalNode T_ACTION() { return getToken(HplsqlParser.T_ACTION, 0); }
		public TerminalNode T_RESTRICT() { return getToken(HplsqlParser.T_RESTRICT, 0); }
		public TerminalNode T_SET() { return getToken(HplsqlParser.T_SET, 0); }
		public TerminalNode T_NULL() { return getToken(HplsqlParser.T_NULL, 0); }
		public TerminalNode T_DEFAULT() { return getToken(HplsqlParser.T_DEFAULT, 0); }
		public TerminalNode T_CASCADE() { return getToken(HplsqlParser.T_CASCADE, 0); }
		public Create_table_fk_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_fk_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_fk_action(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_fk_action(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_fk_action(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_fk_actionContext create_table_fk_action() throws RecognitionException {
		Create_table_fk_actionContext _localctx = new Create_table_fk_actionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_create_table_fk_action);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(764);
			match(T_ON);
			setState(765);
			_la = _input.LA(1);
			if ( !(_la==T_DELETE || _la==T_UPDATE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(774);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(766);
				match(T_NO);
				setState(767);
				match(T_ACTION);
				}
				break;
			case 2:
				{
				setState(768);
				match(T_RESTRICT);
				}
				break;
			case 3:
				{
				setState(769);
				match(T_SET);
				setState(770);
				match(T_NULL);
				}
				break;
			case 4:
				{
				setState(771);
				match(T_SET);
				setState(772);
				match(T_DEFAULT);
				}
				break;
			case 5:
				{
				setState(773);
				match(T_CASCADE);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_preoptionsContext extends ParserRuleContext {
		public List<Create_table_preoptions_itemContext> create_table_preoptions_item() {
			return getRuleContexts(Create_table_preoptions_itemContext.class);
		}
		public Create_table_preoptions_itemContext create_table_preoptions_item(int i) {
			return getRuleContext(Create_table_preoptions_itemContext.class,i);
		}
		public Create_table_preoptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_preoptions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_preoptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_preoptions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_preoptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_preoptionsContext create_table_preoptions() throws RecognitionException {
		Create_table_preoptionsContext _localctx = new Create_table_preoptionsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_create_table_preoptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(776);
				create_table_preoptions_item();
				}
				}
				setState(779); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_ROW || _la==T_STORED || _la==T_COMMA );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_preoptions_itemContext extends ParserRuleContext {
		public TerminalNode T_COMMA() { return getToken(HplsqlParser.T_COMMA, 0); }
		public Create_table_preoptions_td_itemContext create_table_preoptions_td_item() {
			return getRuleContext(Create_table_preoptions_td_itemContext.class,0);
		}
		public Create_table_options_hive_itemContext create_table_options_hive_item() {
			return getRuleContext(Create_table_options_hive_itemContext.class,0);
		}
		public Create_table_preoptions_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_preoptions_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_preoptions_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_preoptions_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_preoptions_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_preoptions_itemContext create_table_preoptions_item() throws RecognitionException {
		Create_table_preoptions_itemContext _localctx = new Create_table_preoptions_itemContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_create_table_preoptions_item);
		try {
			setState(784);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(781);
				match(T_COMMA);
				setState(782);
				create_table_preoptions_td_item();
				}
				break;
			case T_ROW:
			case T_STORED:
				enterOuterAlt(_localctx, 2);
				{
				setState(783);
				create_table_options_hive_item();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_preoptions_td_itemContext extends ParserRuleContext {
		public TerminalNode T_LOG() { return getToken(HplsqlParser.T_LOG, 0); }
		public TerminalNode T_FALLBACK() { return getToken(HplsqlParser.T_FALLBACK, 0); }
		public TerminalNode T_NO() { return getToken(HplsqlParser.T_NO, 0); }
		public Create_table_preoptions_td_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_preoptions_td_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_preoptions_td_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_preoptions_td_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_preoptions_td_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_preoptions_td_itemContext create_table_preoptions_td_item() throws RecognitionException {
		Create_table_preoptions_td_itemContext _localctx = new Create_table_preoptions_td_itemContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_create_table_preoptions_td_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(787);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_NO) {
				{
				setState(786);
				match(T_NO);
				}
			}

			setState(789);
			_la = _input.LA(1);
			if ( !(_la==T_FALLBACK || _la==T_LOG) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_optionsContext extends ParserRuleContext {
		public List<Create_table_options_itemContext> create_table_options_item() {
			return getRuleContexts(Create_table_options_itemContext.class);
		}
		public Create_table_options_itemContext create_table_options_item(int i) {
			return getRuleContext(Create_table_options_itemContext.class,i);
		}
		public Create_table_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_options(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_options(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_optionsContext create_table_options() throws RecognitionException {
		Create_table_optionsContext _localctx = new Create_table_optionsContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_create_table_options);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(792); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(791);
					create_table_options_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(794); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocationContext extends ParserRuleContext {
		public TerminalNode T_LOCATION() { return getToken(HplsqlParser.T_LOCATION, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitLocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_location);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			match(T_LOCATION);
			setState(797);
			string();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_options_itemContext extends ParserRuleContext {
		public TerminalNode T_ON() { return getToken(HplsqlParser.T_ON, 0); }
		public TerminalNode T_COMMIT() { return getToken(HplsqlParser.T_COMMIT, 0); }
		public TerminalNode T_ROWS() { return getToken(HplsqlParser.T_ROWS, 0); }
		public TerminalNode T_DELETE() { return getToken(HplsqlParser.T_DELETE, 0); }
		public TerminalNode T_PRESERVE() { return getToken(HplsqlParser.T_PRESERVE, 0); }
		public TerminalNode T_COMMENT() { return getToken(HplsqlParser.T_COMMENT, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Create_table_options_ora_itemContext create_table_options_ora_item() {
			return getRuleContext(Create_table_options_ora_itemContext.class,0);
		}
		public Create_table_options_db2_itemContext create_table_options_db2_item() {
			return getRuleContext(Create_table_options_db2_itemContext.class,0);
		}
		public Create_table_options_td_itemContext create_table_options_td_item() {
			return getRuleContext(Create_table_options_td_itemContext.class,0);
		}
		public Create_table_options_hive_itemContext create_table_options_hive_item() {
			return getRuleContext(Create_table_options_hive_itemContext.class,0);
		}
		public Create_table_options_mssql_itemContext create_table_options_mssql_item() {
			return getRuleContext(Create_table_options_mssql_itemContext.class,0);
		}
		public Create_table_options_mysql_itemContext create_table_options_mysql_item() {
			return getRuleContext(Create_table_options_mysql_itemContext.class,0);
		}
		public Create_table_options_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_options_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_options_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_options_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_itemContext create_table_options_item() throws RecognitionException {
		Create_table_options_itemContext _localctx = new Create_table_options_itemContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_create_table_options_item);
		int _la;
		try {
			setState(811);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(799);
				match(T_ON);
				setState(800);
				match(T_COMMIT);
				setState(801);
				_la = _input.LA(1);
				if ( !(_la==T_DELETE || _la==T_PRESERVE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(802);
				match(T_ROWS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(803);
				match(T_COMMENT);
				setState(804);
				string();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(805);
				create_table_options_ora_item();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(806);
				create_table_options_db2_item();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(807);
				create_table_options_td_item();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(808);
				create_table_options_hive_item();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(809);
				create_table_options_mssql_item();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(810);
				create_table_options_mysql_item();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_options_ora_itemContext extends ParserRuleContext {
		public TerminalNode T_SEGMENT() { return getToken(HplsqlParser.T_SEGMENT, 0); }
		public TerminalNode T_CREATION() { return getToken(HplsqlParser.T_CREATION, 0); }
		public TerminalNode T_IMMEDIATE() { return getToken(HplsqlParser.T_IMMEDIATE, 0); }
		public TerminalNode T_DEFERRED() { return getToken(HplsqlParser.T_DEFERRED, 0); }
		public List<TerminalNode> L_INT() { return getTokens(HplsqlParser.L_INT); }
		public TerminalNode L_INT(int i) {
			return getToken(HplsqlParser.L_INT, i);
		}
		public TerminalNode T_PCTFREE() { return getToken(HplsqlParser.T_PCTFREE, 0); }
		public TerminalNode T_PCTUSED() { return getToken(HplsqlParser.T_PCTUSED, 0); }
		public TerminalNode T_INITRANS() { return getToken(HplsqlParser.T_INITRANS, 0); }
		public TerminalNode T_MAXTRANS() { return getToken(HplsqlParser.T_MAXTRANS, 0); }
		public TerminalNode T_NOCOMPRESS() { return getToken(HplsqlParser.T_NOCOMPRESS, 0); }
		public TerminalNode T_LOGGING() { return getToken(HplsqlParser.T_LOGGING, 0); }
		public TerminalNode T_NOLOGGING() { return getToken(HplsqlParser.T_NOLOGGING, 0); }
		public TerminalNode T_STORAGE() { return getToken(HplsqlParser.T_STORAGE, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_TABLESPACE() { return getToken(HplsqlParser.T_TABLESPACE, 0); }
		public Create_table_options_ora_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_ora_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_options_ora_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_options_ora_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_options_ora_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_ora_itemContext create_table_options_ora_item() throws RecognitionException {
		Create_table_options_ora_itemContext _localctx = new Create_table_options_ora_itemContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_create_table_options_ora_item);
		int _la;
		try {
			setState(831);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SEGMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(813);
				match(T_SEGMENT);
				setState(814);
				match(T_CREATION);
				setState(815);
				_la = _input.LA(1);
				if ( !(_la==T_DEFERRED || _la==T_IMMEDIATE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T_INITRANS:
			case T_MAXTRANS:
			case T_PCTFREE:
			case T_PCTUSED:
				enterOuterAlt(_localctx, 2);
				{
				setState(816);
				_la = _input.LA(1);
				if ( !(_la==T_INITRANS || _la==T_MAXTRANS || _la==T_PCTFREE || _la==T_PCTUSED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(817);
				match(L_INT);
				}
				break;
			case T_NOCOMPRESS:
				enterOuterAlt(_localctx, 3);
				{
				setState(818);
				match(T_NOCOMPRESS);
				}
				break;
			case T_LOGGING:
			case T_NOLOGGING:
				enterOuterAlt(_localctx, 4);
				{
				setState(819);
				_la = _input.LA(1);
				if ( !(_la==T_LOGGING || _la==T_NOLOGGING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T_STORAGE:
				enterOuterAlt(_localctx, 5);
				{
				setState(820);
				match(T_STORAGE);
				setState(821);
				match(T_OPEN_P);
				setState(824); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(824);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T_ACTION:
					case T_ADD2:
					case T_ALL:
					case T_ALLOCATE:
					case T_ALTER:
					case T_AND:
					case T_ANSI_NULLS:
					case T_ANSI_PADDING:
					case T_AS:
					case T_ASC:
					case T_ASSOCIATE:
					case T_AT:
					case T_AUTO_INCREMENT:
					case T_AVG:
					case T_BATCHSIZE:
					case T_BEGIN:
					case T_BETWEEN:
					case T_BIGINT:
					case T_BINARY_DOUBLE:
					case T_BINARY_FLOAT:
					case T_BIT:
					case T_BODY:
					case T_BREAK:
					case T_BY:
					case T_BYTE:
					case T_CALL:
					case T_CALLER:
					case T_CASCADE:
					case T_CASE:
					case T_CASESPECIFIC:
					case T_CAST:
					case T_CHAR:
					case T_CHARACTER:
					case T_CHARSET:
					case T_CLIENT:
					case T_CLOSE:
					case T_CLUSTERED:
					case T_CMP:
					case T_COLLECT:
					case T_COLLECTION:
					case T_COLUMN:
					case T_COMMENT:
					case T_CONSTANT:
					case T_COMMIT:
					case T_COMPRESS:
					case T_CONCAT:
					case T_CONDITION:
					case T_CONSTRAINT:
					case T_CONTINUE:
					case T_COPY:
					case T_COUNT:
					case T_COUNT_BIG:
					case T_CREATE:
					case T_CREATION:
					case T_CREATOR:
					case T_CS:
					case T_CURRENT:
					case T_CURRENT_SCHEMA:
					case T_CURSOR:
					case T_DATABASE:
					case T_DATA:
					case T_DATE:
					case T_DATETIME:
					case T_DAY:
					case T_DAYS:
					case T_DEC:
					case T_DECIMAL:
					case T_DECLARE:
					case T_DEFAULT:
					case T_DEFERRED:
					case T_DEFINED:
					case T_DEFINER:
					case T_DEFINITION:
					case T_DELETE:
					case T_DELIMITED:
					case T_DELIMITER:
					case T_DESC:
					case T_DESCRIBE:
					case T_DIAGNOSTICS:
					case T_DIR:
					case T_DIRECTORY:
					case T_DISTINCT:
					case T_DISTRIBUTE:
					case T_DO:
					case T_DOUBLE:
					case T_DROP:
					case T_DYNAMIC:
					case T_ENABLE:
					case T_ENGINE:
					case T_ESCAPED:
					case T_EXCEPT:
					case T_EXEC:
					case T_EXECUTE:
					case T_EXCEPTION:
					case T_EXCLUSIVE:
					case T_EXISTS:
					case T_EXIT:
					case T_FALLBACK:
					case T_FALSE:
					case T_FETCH:
					case T_FIELDS:
					case T_FILE:
					case T_FILES:
					case T_FLOAT:
					case T_FOR:
					case T_FOREIGN:
					case T_FORMAT:
					case T_FOUND:
					case T_FROM:
					case T_FULL:
					case T_FUNCTION:
					case T_GET:
					case T_GLOBAL:
					case T_GO:
					case T_GRANT:
					case T_GROUP:
					case T_HANDLER:
					case T_HASH:
					case T_HAVING:
					case T_HDFS:
					case T_HIVE:
					case T_HOST:
					case T_IDENTITY:
					case T_IF:
					case T_IGNORE:
					case T_IMMEDIATE:
					case T_IN:
					case T_INCLUDE:
					case T_INDEX:
					case T_INITRANS:
					case T_INNER:
					case T_INOUT:
					case T_INSERT:
					case T_INT2:
					case T_INT4:
					case T_INT8:
					case T_INTEGER:
					case T_INTERSECT:
					case T_INTERVAL:
					case T_INTO:
					case T_INVOKER:
					case T_IS:
					case T_ISOPEN:
					case T_ITEMS:
					case T_JOIN:
					case T_KEEP:
					case T_KEY:
					case T_KEYS:
					case T_LANGUAGE:
					case T_LEAVE:
					case T_LEFT:
					case T_LIKE:
					case T_LIMIT:
					case T_LINES:
					case T_LOCAL:
					case T_LOCATION:
					case T_LOCATOR:
					case T_LOCATORS:
					case T_LOCKS:
					case T_LOG:
					case T_LOGGED:
					case T_LOGGING:
					case T_LOOP:
					case T_MAP:
					case T_MATCHED:
					case T_MAX:
					case T_MAXTRANS:
					case T_MERGE:
					case T_MESSAGE_TEXT:
					case T_MICROSECOND:
					case T_MICROSECONDS:
					case T_MIN:
					case T_MULTISET:
					case T_NCHAR:
					case T_NEW:
					case T_NVARCHAR:
					case T_NO:
					case T_NOCOUNT:
					case T_NOCOMPRESS:
					case T_NOLOGGING:
					case T_NONE:
					case T_NOT:
					case T_NOTFOUND:
					case T_NUMERIC:
					case T_NUMBER:
					case T_OBJECT:
					case T_OFF:
					case T_ON:
					case T_ONLY:
					case T_OPEN:
					case T_OR:
					case T_ORDER:
					case T_OUT:
					case T_OUTER:
					case T_OVER:
					case T_OVERWRITE:
					case T_OWNER:
					case T_PACKAGE:
					case T_PARTITION:
					case T_PCTFREE:
					case T_PCTUSED:
					case T_PRECISION:
					case T_PRESERVE:
					case T_PRIMARY:
					case T_PRINT:
					case T_PROC:
					case T_PROCEDURE:
					case T_QUALIFY:
					case T_QUERY_BAND:
					case T_QUIT:
					case T_QUOTED_IDENTIFIER:
					case T_RAISE:
					case T_REFERENCES:
					case T_REGEXP:
					case T_REPLACE:
					case T_RESIGNAL:
					case T_RESTRICT:
					case T_RESULT:
					case T_RESULT_SET_LOCATOR:
					case T_RETURN:
					case T_RETURNS:
					case T_REVERSE:
					case T_RIGHT:
					case T_RLIKE:
					case T_ROLE:
					case T_ROLLBACK:
					case T_ROW:
					case T_ROWS:
					case T_ROW_COUNT:
					case T_RR:
					case T_RS:
					case T_PWD:
					case T_TRIM:
					case T_SCHEMA:
					case T_SECOND:
					case T_SECONDS:
					case T_SECURITY:
					case T_SEGMENT:
					case T_SEL:
					case T_SELECT:
					case T_SET:
					case T_SESSION:
					case T_SESSIONS:
					case T_SETS:
					case T_SHARE:
					case T_SIGNAL:
					case T_SIMPLE_DOUBLE:
					case T_SIMPLE_FLOAT:
					case T_SMALLDATETIME:
					case T_SMALLINT:
					case T_SQL:
					case T_SQLEXCEPTION:
					case T_SQLINSERT:
					case T_SQLSTATE:
					case T_SQLWARNING:
					case T_STATS:
					case T_STATISTICS:
					case T_STEP:
					case T_STORAGE:
					case T_STORED:
					case T_SUBDIR:
					case T_SUBSTRING:
					case T_SUM:
					case T_SUMMARY:
					case T_SYS_REFCURSOR:
					case T_TABLE:
					case T_TABLESPACE:
					case T_TEMPORARY:
					case T_TERMINATED:
					case T_TEXTIMAGE_ON:
					case T_THEN:
					case T_TIMESTAMP:
					case T_TITLE:
					case T_TO:
					case T_TOP:
					case T_TRANSACTION:
					case T_TRUE:
					case T_TRUNCATE:
					case T_UNIQUE:
					case T_UPDATE:
					case T_UR:
					case T_USE:
					case T_USING:
					case T_VALUE:
					case T_VALUES:
					case T_VAR:
					case T_VARCHAR:
					case T_VARCHAR2:
					case T_VARYING:
					case T_VOLATILE:
					case T_WHILE:
					case T_WITH:
					case T_WITHOUT:
					case T_WORK:
					case T_XACT_ABORT:
					case T_XML:
					case T_YES:
					case T_ACTIVITY_COUNT:
					case T_CUME_DIST:
					case T_CURRENT_DATE:
					case T_CURRENT_TIMESTAMP:
					case T_CURRENT_USER:
					case T_DENSE_RANK:
					case T_FIRST_VALUE:
					case T_LAG:
					case T_LAST_VALUE:
					case T_LEAD:
					case T_PART_COUNT:
					case T_PART_LOC:
					case T_RANK:
					case T_ROW_NUMBER:
					case T_STDEV:
					case T_SYSDATE:
					case T_VARIANCE:
					case T_USER:
					case L_ID:
					case L_S_STRING:
					case L_D_STRING:
						{
						setState(822);
						ident();
						}
						break;
					case L_INT:
						{
						setState(823);
						match(L_INT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(826); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_ADD2) | (1L << T_ALL) | (1L << T_ALLOCATE) | (1L << T_ALTER) | (1L << T_AND) | (1L << T_ANSI_NULLS) | (1L << T_ANSI_PADDING) | (1L << T_AS) | (1L << T_ASC) | (1L << T_ASSOCIATE) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BATCHSIZE) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CALLER) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLIENT) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECT) | (1L << T_COLLECTION) | (1L << T_COLUMN) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMMIT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COPY) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CREATION) | (1L << T_CREATOR) | (1L << T_CS) | (1L << T_CURRENT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_CURRENT_SCHEMA - 64)) | (1L << (T_CURSOR - 64)) | (1L << (T_DATABASE - 64)) | (1L << (T_DATA - 64)) | (1L << (T_DATE - 64)) | (1L << (T_DATETIME - 64)) | (1L << (T_DAY - 64)) | (1L << (T_DAYS - 64)) | (1L << (T_DEC - 64)) | (1L << (T_DECIMAL - 64)) | (1L << (T_DECLARE - 64)) | (1L << (T_DEFAULT - 64)) | (1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DELIMITER - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DESCRIBE - 64)) | (1L << (T_DIAGNOSTICS - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DIRECTORY - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DO - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DROP - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXEC - 64)) | (1L << (T_EXECUTE - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FETCH - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FILE - 64)) | (1L << (T_FILES - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GET - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)) | (1L << (T_GRANT - 64)) | (1L << (T_GROUP - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_HANDLER - 128)) | (1L << (T_HASH - 128)) | (1L << (T_HAVING - 128)) | (1L << (T_HDFS - 128)) | (1L << (T_HIVE - 128)) | (1L << (T_HOST - 128)) | (1L << (T_IDENTITY - 128)) | (1L << (T_IF - 128)) | (1L << (T_IGNORE - 128)) | (1L << (T_IMMEDIATE - 128)) | (1L << (T_IN - 128)) | (1L << (T_INCLUDE - 128)) | (1L << (T_INDEX - 128)) | (1L << (T_INITRANS - 128)) | (1L << (T_INNER - 128)) | (1L << (T_INOUT - 128)) | (1L << (T_INSERT - 128)) | (1L << (T_INT2 - 128)) | (1L << (T_INT4 - 128)) | (1L << (T_INT8 - 128)) | (1L << (T_INTEGER - 128)) | (1L << (T_INTERSECT - 128)) | (1L << (T_INTERVAL - 128)) | (1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCATOR - 128)) | (1L << (T_LOCATORS - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MATCHED - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MERGE - 128)) | (1L << (T_MESSAGE_TEXT - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NEW - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)) | (1L << (T_NOCOUNT - 128)) | (1L << (T_NOCOMPRESS - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_NOLOGGING - 192)) | (1L << (T_NONE - 192)) | (1L << (T_NOT - 192)) | (1L << (T_NOTFOUND - 192)) | (1L << (T_NUMERIC - 192)) | (1L << (T_NUMBER - 192)) | (1L << (T_OBJECT - 192)) | (1L << (T_OFF - 192)) | (1L << (T_ON - 192)) | (1L << (T_ONLY - 192)) | (1L << (T_OPEN - 192)) | (1L << (T_OR - 192)) | (1L << (T_ORDER - 192)) | (1L << (T_OUT - 192)) | (1L << (T_OUTER - 192)) | (1L << (T_OVER - 192)) | (1L << (T_OVERWRITE - 192)) | (1L << (T_OWNER - 192)) | (1L << (T_PACKAGE - 192)) | (1L << (T_PARTITION - 192)) | (1L << (T_PCTFREE - 192)) | (1L << (T_PCTUSED - 192)) | (1L << (T_PRECISION - 192)) | (1L << (T_PRESERVE - 192)) | (1L << (T_PRIMARY - 192)) | (1L << (T_PRINT - 192)) | (1L << (T_PROC - 192)) | (1L << (T_PROCEDURE - 192)) | (1L << (T_QUALIFY - 192)) | (1L << (T_QUERY_BAND - 192)) | (1L << (T_QUIT - 192)) | (1L << (T_QUOTED_IDENTIFIER - 192)) | (1L << (T_RAISE - 192)) | (1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESIGNAL - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROLE - 192)) | (1L << (T_ROLLBACK - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)) | (1L << (T_ROW_COUNT - 192)) | (1L << (T_RR - 192)) | (1L << (T_RS - 192)) | (1L << (T_PWD - 192)) | (1L << (T_TRIM - 192)) | (1L << (T_SCHEMA - 192)) | (1L << (T_SECOND - 192)) | (1L << (T_SECONDS - 192)) | (1L << (T_SECURITY - 192)) | (1L << (T_SEGMENT - 192)) | (1L << (T_SEL - 192)) | (1L << (T_SELECT - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_SET - 256)) | (1L << (T_SESSION - 256)) | (1L << (T_SESSIONS - 256)) | (1L << (T_SETS - 256)) | (1L << (T_SHARE - 256)) | (1L << (T_SIGNAL - 256)) | (1L << (T_SIMPLE_DOUBLE - 256)) | (1L << (T_SIMPLE_FLOAT - 256)) | (1L << (T_SMALLDATETIME - 256)) | (1L << (T_SMALLINT - 256)) | (1L << (T_SQL - 256)) | (1L << (T_SQLEXCEPTION - 256)) | (1L << (T_SQLINSERT - 256)) | (1L << (T_SQLSTATE - 256)) | (1L << (T_SQLWARNING - 256)) | (1L << (T_STATS - 256)) | (1L << (T_STATISTICS - 256)) | (1L << (T_STEP - 256)) | (1L << (T_STORAGE - 256)) | (1L << (T_STORED - 256)) | (1L << (T_SUBDIR - 256)) | (1L << (T_SUBSTRING - 256)) | (1L << (T_SUM - 256)) | (1L << (T_SUMMARY - 256)) | (1L << (T_SYS_REFCURSOR - 256)) | (1L << (T_TABLE - 256)) | (1L << (T_TABLESPACE - 256)) | (1L << (T_TEMPORARY - 256)) | (1L << (T_TERMINATED - 256)) | (1L << (T_TEXTIMAGE_ON - 256)) | (1L << (T_THEN - 256)) | (1L << (T_TIMESTAMP - 256)) | (1L << (T_TITLE - 256)) | (1L << (T_TO - 256)) | (1L << (T_TOP - 256)) | (1L << (T_TRANSACTION - 256)) | (1L << (T_TRUE - 256)) | (1L << (T_TRUNCATE - 256)) | (1L << (T_UNIQUE - 256)) | (1L << (T_UPDATE - 256)) | (1L << (T_UR - 256)) | (1L << (T_USE - 256)) | (1L << (T_USING - 256)) | (1L << (T_VALUE - 256)) | (1L << (T_VALUES - 256)) | (1L << (T_VAR - 256)) | (1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_VARYING - 256)) | (1L << (T_VOLATILE - 256)) | (1L << (T_WHILE - 256)) | (1L << (T_WITH - 256)) | (1L << (T_WITHOUT - 256)) | (1L << (T_WORK - 256)) | (1L << (T_XACT_ABORT - 256)) | (1L << (T_XML - 256)) | (1L << (T_YES - 256)))) != 0) || ((((_la - 321)) & ~0x3f) == 0 && ((1L << (_la - 321)) & ((1L << (T_ACTIVITY_COUNT - 321)) | (1L << (T_CUME_DIST - 321)) | (1L << (T_CURRENT_DATE - 321)) | (1L << (T_CURRENT_TIMESTAMP - 321)) | (1L << (T_CURRENT_USER - 321)) | (1L << (T_DENSE_RANK - 321)) | (1L << (T_FIRST_VALUE - 321)) | (1L << (T_LAG - 321)) | (1L << (T_LAST_VALUE - 321)) | (1L << (T_LEAD - 321)) | (1L << (T_PART_COUNT - 321)) | (1L << (T_PART_LOC - 321)) | (1L << (T_RANK - 321)) | (1L << (T_ROW_NUMBER - 321)) | (1L << (T_STDEV - 321)) | (1L << (T_SYSDATE - 321)) | (1L << (T_VARIANCE - 321)) | (1L << (T_USER - 321)) | (1L << (L_ID - 321)) | (1L << (L_S_STRING - 321)) | (1L << (L_D_STRING - 321)) | (1L << (L_INT - 321)))) != 0) );
				setState(828);
				match(T_CLOSE_P);
				}
				break;
			case T_TABLESPACE:
				enterOuterAlt(_localctx, 6);
				{
				setState(829);
				match(T_TABLESPACE);
				setState(830);
				ident();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_options_db2_itemContext extends ParserRuleContext {
		public TerminalNode T_IN() { return getToken(HplsqlParser.T_IN, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_INDEX() { return getToken(HplsqlParser.T_INDEX, 0); }
		public TerminalNode T_WITH() { return getToken(HplsqlParser.T_WITH, 0); }
		public TerminalNode T_REPLACE() { return getToken(HplsqlParser.T_REPLACE, 0); }
		public TerminalNode T_DISTRIBUTE() { return getToken(HplsqlParser.T_DISTRIBUTE, 0); }
		public TerminalNode T_BY() { return getToken(HplsqlParser.T_BY, 0); }
		public TerminalNode T_HASH() { return getToken(HplsqlParser.T_HASH, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public TerminalNode T_LOGGED() { return getToken(HplsqlParser.T_LOGGED, 0); }
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public TerminalNode T_COMPRESS() { return getToken(HplsqlParser.T_COMPRESS, 0); }
		public TerminalNode T_YES() { return getToken(HplsqlParser.T_YES, 0); }
		public TerminalNode T_NO() { return getToken(HplsqlParser.T_NO, 0); }
		public TerminalNode T_DEFINITION() { return getToken(HplsqlParser.T_DEFINITION, 0); }
		public TerminalNode T_ONLY() { return getToken(HplsqlParser.T_ONLY, 0); }
		public TerminalNode T_RESTRICT() { return getToken(HplsqlParser.T_RESTRICT, 0); }
		public TerminalNode T_ON() { return getToken(HplsqlParser.T_ON, 0); }
		public TerminalNode T_DROP() { return getToken(HplsqlParser.T_DROP, 0); }
		public Create_table_options_db2_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_db2_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_options_db2_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_options_db2_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_options_db2_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_db2_itemContext create_table_options_db2_item() throws RecognitionException {
		Create_table_options_db2_itemContext _localctx = new Create_table_options_db2_itemContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_create_table_options_db2_item);
		int _la;
		try {
			setState(866);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(834);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_INDEX) {
					{
					setState(833);
					match(T_INDEX);
					}
				}

				setState(836);
				match(T_IN);
				setState(837);
				ident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(838);
				match(T_WITH);
				setState(839);
				match(T_REPLACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(840);
				match(T_DISTRIBUTE);
				setState(841);
				match(T_BY);
				setState(842);
				match(T_HASH);
				setState(843);
				match(T_OPEN_P);
				setState(844);
				ident();
				setState(849);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(845);
					match(T_COMMA);
					setState(846);
					ident();
					}
					}
					setState(851);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(852);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(855);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(854);
					match(T_NOT);
					}
				}

				setState(857);
				match(T_LOGGED);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(858);
				match(T_COMPRESS);
				setState(859);
				_la = _input.LA(1);
				if ( !(_la==T_NO || _la==T_YES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(860);
				match(T_DEFINITION);
				setState(861);
				match(T_ONLY);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(862);
				match(T_WITH);
				setState(863);
				match(T_RESTRICT);
				setState(864);
				match(T_ON);
				setState(865);
				match(T_DROP);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_options_td_itemContext extends ParserRuleContext {
		public TerminalNode T_PRIMARY() { return getToken(HplsqlParser.T_PRIMARY, 0); }
		public TerminalNode T_INDEX() { return getToken(HplsqlParser.T_INDEX, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public TerminalNode T_UNIQUE() { return getToken(HplsqlParser.T_UNIQUE, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public TerminalNode T_WITH() { return getToken(HplsqlParser.T_WITH, 0); }
		public TerminalNode T_DATA() { return getToken(HplsqlParser.T_DATA, 0); }
		public Create_table_options_td_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_td_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_options_td_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_options_td_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_options_td_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_td_itemContext create_table_options_td_item() throws RecognitionException {
		Create_table_options_td_itemContext _localctx = new Create_table_options_td_itemContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_create_table_options_td_item);
		int _la;
		try {
			setState(886);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_PRIMARY:
			case T_UNIQUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(869);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_UNIQUE) {
					{
					setState(868);
					match(T_UNIQUE);
					}
				}

				setState(871);
				match(T_PRIMARY);
				setState(872);
				match(T_INDEX);
				setState(873);
				match(T_OPEN_P);
				setState(874);
				ident();
				setState(879);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(875);
					match(T_COMMA);
					setState(876);
					ident();
					}
					}
					setState(881);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(882);
				match(T_CLOSE_P);
				}
				break;
			case T_WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(884);
				match(T_WITH);
				setState(885);
				match(T_DATA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_options_hive_itemContext extends ParserRuleContext {
		public Create_table_hive_row_formatContext create_table_hive_row_format() {
			return getRuleContext(Create_table_hive_row_formatContext.class,0);
		}
		public TerminalNode T_STORED() { return getToken(HplsqlParser.T_STORED, 0); }
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_table_options_hive_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_hive_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_options_hive_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_options_hive_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_options_hive_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_hive_itemContext create_table_options_hive_item() throws RecognitionException {
		Create_table_options_hive_itemContext _localctx = new Create_table_options_hive_itemContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_create_table_options_hive_item);
		try {
			setState(894);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ROW:
				enterOuterAlt(_localctx, 1);
				{
				setState(888);
				create_table_hive_row_format();
				}
				break;
			case T_STORED:
				enterOuterAlt(_localctx, 2);
				{
				setState(889);
				match(T_STORED);
				setState(890);
				match(T_AS);
				setState(891);
				ident();
				setState(892);
				create_table_hive_row_format();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_hive_row_formatContext extends ParserRuleContext {
		public TerminalNode T_ROW() { return getToken(HplsqlParser.T_ROW, 0); }
		public TerminalNode T_FORMAT() { return getToken(HplsqlParser.T_FORMAT, 0); }
		public TerminalNode T_DELIMITED() { return getToken(HplsqlParser.T_DELIMITED, 0); }
		public List<Create_table_hive_row_format_fieldsContext> create_table_hive_row_format_fields() {
			return getRuleContexts(Create_table_hive_row_format_fieldsContext.class);
		}
		public Create_table_hive_row_format_fieldsContext create_table_hive_row_format_fields(int i) {
			return getRuleContext(Create_table_hive_row_format_fieldsContext.class,i);
		}
		public Create_table_hive_row_formatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_hive_row_format; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_hive_row_format(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_hive_row_format(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_hive_row_format(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_hive_row_formatContext create_table_hive_row_format() throws RecognitionException {
		Create_table_hive_row_formatContext _localctx = new Create_table_hive_row_formatContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_create_table_hive_row_format);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(896);
			match(T_ROW);
			setState(897);
			match(T_FORMAT);
			setState(898);
			match(T_DELIMITED);
			setState(902);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(899);
					create_table_hive_row_format_fields();
					}
					} 
				}
				setState(904);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_hive_row_format_fieldsContext extends ParserRuleContext {
		public TerminalNode T_FIELDS() { return getToken(HplsqlParser.T_FIELDS, 0); }
		public TerminalNode T_TERMINATED() { return getToken(HplsqlParser.T_TERMINATED, 0); }
		public List<TerminalNode> T_BY() { return getTokens(HplsqlParser.T_BY); }
		public TerminalNode T_BY(int i) {
			return getToken(HplsqlParser.T_BY, i);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public TerminalNode T_ESCAPED() { return getToken(HplsqlParser.T_ESCAPED, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_COLLECTION() { return getToken(HplsqlParser.T_COLLECTION, 0); }
		public TerminalNode T_ITEMS() { return getToken(HplsqlParser.T_ITEMS, 0); }
		public TerminalNode T_MAP() { return getToken(HplsqlParser.T_MAP, 0); }
		public TerminalNode T_KEYS() { return getToken(HplsqlParser.T_KEYS, 0); }
		public TerminalNode T_LINES() { return getToken(HplsqlParser.T_LINES, 0); }
		public TerminalNode T_NULL() { return getToken(HplsqlParser.T_NULL, 0); }
		public TerminalNode T_DEFINED() { return getToken(HplsqlParser.T_DEFINED, 0); }
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public Create_table_hive_row_format_fieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_hive_row_format_fields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_hive_row_format_fields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_hive_row_format_fields(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_hive_row_format_fields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_hive_row_format_fieldsContext create_table_hive_row_format_fields() throws RecognitionException {
		Create_table_hive_row_format_fieldsContext _localctx = new Create_table_hive_row_format_fieldsContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_create_table_hive_row_format_fields);
		try {
			setState(933);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_FIELDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(905);
				match(T_FIELDS);
				setState(906);
				match(T_TERMINATED);
				setState(907);
				match(T_BY);
				setState(908);
				ident();
				setState(909);
				location();
				setState(913);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
				case 1:
					{
					setState(910);
					match(T_ESCAPED);
					setState(911);
					match(T_BY);
					setState(912);
					expr(0);
					}
					break;
				}
				}
				break;
			case T_COLLECTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(915);
				match(T_COLLECTION);
				setState(916);
				match(T_ITEMS);
				setState(917);
				match(T_TERMINATED);
				setState(918);
				match(T_BY);
				setState(919);
				expr(0);
				}
				break;
			case T_MAP:
				enterOuterAlt(_localctx, 3);
				{
				setState(920);
				match(T_MAP);
				setState(921);
				match(T_KEYS);
				setState(922);
				match(T_TERMINATED);
				setState(923);
				match(T_BY);
				setState(924);
				expr(0);
				}
				break;
			case T_LINES:
				enterOuterAlt(_localctx, 4);
				{
				setState(925);
				match(T_LINES);
				setState(926);
				match(T_TERMINATED);
				setState(927);
				match(T_BY);
				setState(928);
				expr(0);
				}
				break;
			case T_NULL:
				enterOuterAlt(_localctx, 5);
				{
				setState(929);
				match(T_NULL);
				setState(930);
				match(T_DEFINED);
				setState(931);
				match(T_AS);
				setState(932);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_options_mssql_itemContext extends ParserRuleContext {
		public TerminalNode T_ON() { return getToken(HplsqlParser.T_ON, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_TEXTIMAGE_ON() { return getToken(HplsqlParser.T_TEXTIMAGE_ON, 0); }
		public Create_table_options_mssql_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_mssql_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_options_mssql_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_options_mssql_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_options_mssql_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_mssql_itemContext create_table_options_mssql_item() throws RecognitionException {
		Create_table_options_mssql_itemContext _localctx = new Create_table_options_mssql_itemContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_create_table_options_mssql_item);
		try {
			setState(939);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(935);
				match(T_ON);
				setState(936);
				ident();
				}
				break;
			case T_TEXTIMAGE_ON:
				enterOuterAlt(_localctx, 2);
				{
				setState(937);
				match(T_TEXTIMAGE_ON);
				setState(938);
				ident();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_options_mysql_itemContext extends ParserRuleContext {
		public TerminalNode T_AUTO_INCREMENT() { return getToken(HplsqlParser.T_AUTO_INCREMENT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(HplsqlParser.T_EQUAL, 0); }
		public TerminalNode T_COMMENT() { return getToken(HplsqlParser.T_COMMENT, 0); }
		public TerminalNode T_CHARACTER() { return getToken(HplsqlParser.T_CHARACTER, 0); }
		public TerminalNode T_SET() { return getToken(HplsqlParser.T_SET, 0); }
		public TerminalNode T_CHARSET() { return getToken(HplsqlParser.T_CHARSET, 0); }
		public TerminalNode T_DEFAULT() { return getToken(HplsqlParser.T_DEFAULT, 0); }
		public TerminalNode T_ENGINE() { return getToken(HplsqlParser.T_ENGINE, 0); }
		public Create_table_options_mysql_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_mysql_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_options_mysql_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_options_mysql_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_options_mysql_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_mysql_itemContext create_table_options_mysql_item() throws RecognitionException {
		Create_table_options_mysql_itemContext _localctx = new Create_table_options_mysql_itemContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_create_table_options_mysql_item);
		int _la;
		try {
			setState(968);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AUTO_INCREMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(941);
				match(T_AUTO_INCREMENT);
				setState(943);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(942);
					match(T_EQUAL);
					}
				}

				setState(945);
				expr(0);
				}
				break;
			case T_COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(946);
				match(T_COMMENT);
				setState(948);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(947);
					match(T_EQUAL);
					}
				}

				setState(950);
				expr(0);
				}
				break;
			case T_CHARACTER:
			case T_CHARSET:
			case T_DEFAULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(952);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_DEFAULT) {
					{
					setState(951);
					match(T_DEFAULT);
					}
				}

				setState(957);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_CHARACTER:
					{
					setState(954);
					match(T_CHARACTER);
					setState(955);
					match(T_SET);
					}
					break;
				case T_CHARSET:
					{
					setState(956);
					match(T_CHARSET);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(960);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(959);
					match(T_EQUAL);
					}
				}

				setState(962);
				expr(0);
				}
				break;
			case T_ENGINE:
				enterOuterAlt(_localctx, 4);
				{
				setState(963);
				match(T_ENGINE);
				setState(965);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(964);
					match(T_EQUAL);
					}
				}

				setState(967);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dtype_lenContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> L_INT() { return getTokens(HplsqlParser.L_INT); }
		public TerminalNode L_INT(int i) {
			return getToken(HplsqlParser.L_INT, i);
		}
		public TerminalNode T_MAX() { return getToken(HplsqlParser.T_MAX, 0); }
		public TerminalNode T_COMMA() { return getToken(HplsqlParser.T_COMMA, 0); }
		public TerminalNode T_CHAR() { return getToken(HplsqlParser.T_CHAR, 0); }
		public TerminalNode T_BYTE() { return getToken(HplsqlParser.T_BYTE, 0); }
		public Dtype_lenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtype_len; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDtype_len(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDtype_len(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDtype_len(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dtype_lenContext dtype_len() throws RecognitionException {
		Dtype_lenContext _localctx = new Dtype_lenContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_dtype_len);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(970);
			match(T_OPEN_P);
			setState(971);
			_la = _input.LA(1);
			if ( !(_la==T_MAX || _la==L_INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(973);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_BYTE || _la==T_CHAR) {
				{
				setState(972);
				_la = _input.LA(1);
				if ( !(_la==T_BYTE || _la==T_CHAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(977);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_COMMA) {
				{
				setState(975);
				match(T_COMMA);
				setState(976);
				match(L_INT);
				}
			}

			setState(979);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dtype_attrContext extends ParserRuleContext {
		public TerminalNode T_NULL() { return getToken(HplsqlParser.T_NULL, 0); }
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public TerminalNode T_CHARACTER() { return getToken(HplsqlParser.T_CHARACTER, 0); }
		public TerminalNode T_SET() { return getToken(HplsqlParser.T_SET, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_CASESPECIFIC() { return getToken(HplsqlParser.T_CASESPECIFIC, 0); }
		public TerminalNode T_CS() { return getToken(HplsqlParser.T_CS, 0); }
		public Dtype_attrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtype_attr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDtype_attr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDtype_attr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDtype_attr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dtype_attrContext dtype_attr() throws RecognitionException {
		Dtype_attrContext _localctx = new Dtype_attrContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_dtype_attr);
		int _la;
		try {
			setState(992);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(982);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(981);
					match(T_NOT);
					}
				}

				setState(984);
				match(T_NULL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(985);
				match(T_CHARACTER);
				setState(986);
				match(T_SET);
				setState(987);
				ident();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(989);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(988);
					match(T_NOT);
					}
				}

				setState(991);
				_la = _input.LA(1);
				if ( !(_la==T_CASESPECIFIC || _la==T_CS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dtype_defaultContext extends ParserRuleContext {
		public TerminalNode T_EQUAL() { return getToken(HplsqlParser.T_EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_COLON() { return getToken(HplsqlParser.T_COLON, 0); }
		public TerminalNode T_DEFAULT() { return getToken(HplsqlParser.T_DEFAULT, 0); }
		public TerminalNode T_WITH() { return getToken(HplsqlParser.T_WITH, 0); }
		public Dtype_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtype_default; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDtype_default(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDtype_default(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDtype_default(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dtype_defaultContext dtype_default() throws RecognitionException {
		Dtype_defaultContext _localctx = new Dtype_defaultContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_dtype_default);
		int _la;
		try {
			setState(1006);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COLON:
			case T_EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(995);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COLON) {
					{
					setState(994);
					match(T_COLON);
					}
				}

				setState(997);
				match(T_EQUAL);
				setState(998);
				expr(0);
				}
				break;
			case T_DEFAULT:
			case T_WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(1000);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_WITH) {
					{
					setState(999);
					match(T_WITH);
					}
				}

				setState(1002);
				match(T_DEFAULT);
				setState(1004);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
				case 1:
					{
					setState(1003);
					expr(0);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_function_stmtContext extends ParserRuleContext {
		public TerminalNode T_CREATE() { return getToken(HplsqlParser.T_CREATE, 0); }
		public TerminalNode T_FUNCTION() { return getToken(HplsqlParser.T_FUNCTION, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_function_returnContext create_function_return() {
			return getRuleContext(Create_function_returnContext.class,0);
		}
		public Single_block_stmtContext single_block_stmt() {
			return getRuleContext(Single_block_stmtContext.class,0);
		}
		public Create_routine_paramsContext create_routine_params() {
			return getRuleContext(Create_routine_paramsContext.class,0);
		}
		public Declare_block_inplaceContext declare_block_inplace() {
			return getRuleContext(Declare_block_inplaceContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public TerminalNode T_IS() { return getToken(HplsqlParser.T_IS, 0); }
		public Create_function_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_function_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_function_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_function_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_function_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_function_stmtContext create_function_stmt() throws RecognitionException {
		Create_function_stmtContext _localctx = new Create_function_stmtContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_create_function_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1008);
			match(T_CREATE);
			setState(1009);
			match(T_FUNCTION);
			setState(1010);
			ident();
			setState(1012);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(1011);
				create_routine_params();
				}
				break;
			}
			setState(1014);
			create_function_return();
			setState(1016);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(1015);
				_la = _input.LA(1);
				if ( !(_la==T_AS || _la==T_IS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1019);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(1018);
				declare_block_inplace();
				}
				break;
			}
			setState(1021);
			single_block_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_function_returnContext extends ParserRuleContext {
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public TerminalNode T_RETURN() { return getToken(HplsqlParser.T_RETURN, 0); }
		public TerminalNode T_RETURNS() { return getToken(HplsqlParser.T_RETURNS, 0); }
		public Dtype_lenContext dtype_len() {
			return getRuleContext(Dtype_lenContext.class,0);
		}
		public Create_function_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_function_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_function_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_function_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_function_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_function_returnContext create_function_return() throws RecognitionException {
		Create_function_returnContext _localctx = new Create_function_returnContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_create_function_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1023);
			_la = _input.LA(1);
			if ( !(_la==T_RETURN || _la==T_RETURNS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1024);
			dtype();
			setState(1026);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(1025);
				dtype_len();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_package_stmtContext extends ParserRuleContext {
		public TerminalNode T_CREATE() { return getToken(HplsqlParser.T_CREATE, 0); }
		public TerminalNode T_PACKAGE() { return getToken(HplsqlParser.T_PACKAGE, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public Package_specContext package_spec() {
			return getRuleContext(Package_specContext.class,0);
		}
		public TerminalNode T_END() { return getToken(HplsqlParser.T_END, 0); }
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public TerminalNode T_IS() { return getToken(HplsqlParser.T_IS, 0); }
		public TerminalNode T_SEMICOLON() { return getToken(HplsqlParser.T_SEMICOLON, 0); }
		public Create_package_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_package_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_package_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_package_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_package_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_package_stmtContext create_package_stmt() throws RecognitionException {
		Create_package_stmtContext _localctx = new Create_package_stmtContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_create_package_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1028);
			match(T_CREATE);
			setState(1029);
			match(T_PACKAGE);
			setState(1030);
			ident();
			setState(1031);
			_la = _input.LA(1);
			if ( !(_la==T_AS || _la==T_IS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1032);
			package_spec();
			setState(1033);
			match(T_END);
			setState(1037);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				{
				setState(1034);
				ident();
				setState(1035);
				match(T_SEMICOLON);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Package_specContext extends ParserRuleContext {
		public List<Package_spec_itemContext> package_spec_item() {
			return getRuleContexts(Package_spec_itemContext.class);
		}
		public Package_spec_itemContext package_spec_item(int i) {
			return getRuleContext(Package_spec_itemContext.class,i);
		}
		public List<TerminalNode> T_SEMICOLON() { return getTokens(HplsqlParser.T_SEMICOLON); }
		public TerminalNode T_SEMICOLON(int i) {
			return getToken(HplsqlParser.T_SEMICOLON, i);
		}
		public Package_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterPackage_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitPackage_spec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitPackage_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_specContext package_spec() throws RecognitionException {
		Package_specContext _localctx = new Package_specContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_package_spec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1039);
			package_spec_item();
			setState(1040);
			match(T_SEMICOLON);
			setState(1046);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_ADD2) | (1L << T_ALL) | (1L << T_ALLOCATE) | (1L << T_ALTER) | (1L << T_AND) | (1L << T_ANSI_NULLS) | (1L << T_ANSI_PADDING) | (1L << T_AS) | (1L << T_ASC) | (1L << T_ASSOCIATE) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BATCHSIZE) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CALLER) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLIENT) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECT) | (1L << T_COLLECTION) | (1L << T_COLUMN) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMMIT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COPY) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CREATION) | (1L << T_CREATOR) | (1L << T_CS) | (1L << T_CURRENT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_CURRENT_SCHEMA - 64)) | (1L << (T_CURSOR - 64)) | (1L << (T_DATABASE - 64)) | (1L << (T_DATA - 64)) | (1L << (T_DATE - 64)) | (1L << (T_DATETIME - 64)) | (1L << (T_DAY - 64)) | (1L << (T_DAYS - 64)) | (1L << (T_DEC - 64)) | (1L << (T_DECIMAL - 64)) | (1L << (T_DECLARE - 64)) | (1L << (T_DEFAULT - 64)) | (1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DELIMITER - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DESCRIBE - 64)) | (1L << (T_DIAGNOSTICS - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DIRECTORY - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DO - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DROP - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXEC - 64)) | (1L << (T_EXECUTE - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FETCH - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FILE - 64)) | (1L << (T_FILES - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GET - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)) | (1L << (T_GRANT - 64)) | (1L << (T_GROUP - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_HANDLER - 128)) | (1L << (T_HASH - 128)) | (1L << (T_HAVING - 128)) | (1L << (T_HDFS - 128)) | (1L << (T_HIVE - 128)) | (1L << (T_HOST - 128)) | (1L << (T_IDENTITY - 128)) | (1L << (T_IF - 128)) | (1L << (T_IGNORE - 128)) | (1L << (T_IMMEDIATE - 128)) | (1L << (T_IN - 128)) | (1L << (T_INCLUDE - 128)) | (1L << (T_INDEX - 128)) | (1L << (T_INITRANS - 128)) | (1L << (T_INNER - 128)) | (1L << (T_INOUT - 128)) | (1L << (T_INSERT - 128)) | (1L << (T_INT2 - 128)) | (1L << (T_INT4 - 128)) | (1L << (T_INT8 - 128)) | (1L << (T_INTEGER - 128)) | (1L << (T_INTERSECT - 128)) | (1L << (T_INTERVAL - 128)) | (1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCATOR - 128)) | (1L << (T_LOCATORS - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MATCHED - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MERGE - 128)) | (1L << (T_MESSAGE_TEXT - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NEW - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)) | (1L << (T_NOCOUNT - 128)) | (1L << (T_NOCOMPRESS - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_NOLOGGING - 192)) | (1L << (T_NONE - 192)) | (1L << (T_NOT - 192)) | (1L << (T_NOTFOUND - 192)) | (1L << (T_NUMERIC - 192)) | (1L << (T_NUMBER - 192)) | (1L << (T_OBJECT - 192)) | (1L << (T_OFF - 192)) | (1L << (T_ON - 192)) | (1L << (T_ONLY - 192)) | (1L << (T_OPEN - 192)) | (1L << (T_OR - 192)) | (1L << (T_ORDER - 192)) | (1L << (T_OUT - 192)) | (1L << (T_OUTER - 192)) | (1L << (T_OVER - 192)) | (1L << (T_OVERWRITE - 192)) | (1L << (T_OWNER - 192)) | (1L << (T_PACKAGE - 192)) | (1L << (T_PARTITION - 192)) | (1L << (T_PCTFREE - 192)) | (1L << (T_PCTUSED - 192)) | (1L << (T_PRECISION - 192)) | (1L << (T_PRESERVE - 192)) | (1L << (T_PRIMARY - 192)) | (1L << (T_PRINT - 192)) | (1L << (T_PROC - 192)) | (1L << (T_PROCEDURE - 192)) | (1L << (T_QUALIFY - 192)) | (1L << (T_QUERY_BAND - 192)) | (1L << (T_QUIT - 192)) | (1L << (T_QUOTED_IDENTIFIER - 192)) | (1L << (T_RAISE - 192)) | (1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESIGNAL - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROLE - 192)) | (1L << (T_ROLLBACK - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)) | (1L << (T_ROW_COUNT - 192)) | (1L << (T_RR - 192)) | (1L << (T_RS - 192)) | (1L << (T_PWD - 192)) | (1L << (T_TRIM - 192)) | (1L << (T_SCHEMA - 192)) | (1L << (T_SECOND - 192)) | (1L << (T_SECONDS - 192)) | (1L << (T_SECURITY - 192)) | (1L << (T_SEGMENT - 192)) | (1L << (T_SEL - 192)) | (1L << (T_SELECT - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_SET - 256)) | (1L << (T_SESSION - 256)) | (1L << (T_SESSIONS - 256)) | (1L << (T_SETS - 256)) | (1L << (T_SHARE - 256)) | (1L << (T_SIGNAL - 256)) | (1L << (T_SIMPLE_DOUBLE - 256)) | (1L << (T_SIMPLE_FLOAT - 256)) | (1L << (T_SMALLDATETIME - 256)) | (1L << (T_SMALLINT - 256)) | (1L << (T_SQL - 256)) | (1L << (T_SQLEXCEPTION - 256)) | (1L << (T_SQLINSERT - 256)) | (1L << (T_SQLSTATE - 256)) | (1L << (T_SQLWARNING - 256)) | (1L << (T_STATS - 256)) | (1L << (T_STATISTICS - 256)) | (1L << (T_STEP - 256)) | (1L << (T_STORAGE - 256)) | (1L << (T_STORED - 256)) | (1L << (T_SUBDIR - 256)) | (1L << (T_SUBSTRING - 256)) | (1L << (T_SUM - 256)) | (1L << (T_SUMMARY - 256)) | (1L << (T_SYS_REFCURSOR - 256)) | (1L << (T_TABLE - 256)) | (1L << (T_TABLESPACE - 256)) | (1L << (T_TEMPORARY - 256)) | (1L << (T_TERMINATED - 256)) | (1L << (T_TEXTIMAGE_ON - 256)) | (1L << (T_THEN - 256)) | (1L << (T_TIMESTAMP - 256)) | (1L << (T_TITLE - 256)) | (1L << (T_TO - 256)) | (1L << (T_TOP - 256)) | (1L << (T_TRANSACTION - 256)) | (1L << (T_TRUE - 256)) | (1L << (T_TRUNCATE - 256)) | (1L << (T_UNIQUE - 256)) | (1L << (T_UPDATE - 256)) | (1L << (T_UR - 256)) | (1L << (T_USE - 256)) | (1L << (T_USING - 256)) | (1L << (T_VALUE - 256)) | (1L << (T_VALUES - 256)) | (1L << (T_VAR - 256)) | (1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_VARYING - 256)) | (1L << (T_VOLATILE - 256)) | (1L << (T_WHILE - 256)) | (1L << (T_WITH - 256)) | (1L << (T_WITHOUT - 256)) | (1L << (T_WORK - 256)) | (1L << (T_XACT_ABORT - 256)) | (1L << (T_XML - 256)) | (1L << (T_YES - 256)))) != 0) || ((((_la - 321)) & ~0x3f) == 0 && ((1L << (_la - 321)) & ((1L << (T_ACTIVITY_COUNT - 321)) | (1L << (T_CUME_DIST - 321)) | (1L << (T_CURRENT_DATE - 321)) | (1L << (T_CURRENT_TIMESTAMP - 321)) | (1L << (T_CURRENT_USER - 321)) | (1L << (T_DENSE_RANK - 321)) | (1L << (T_FIRST_VALUE - 321)) | (1L << (T_LAG - 321)) | (1L << (T_LAST_VALUE - 321)) | (1L << (T_LEAD - 321)) | (1L << (T_PART_COUNT - 321)) | (1L << (T_PART_LOC - 321)) | (1L << (T_RANK - 321)) | (1L << (T_ROW_NUMBER - 321)) | (1L << (T_STDEV - 321)) | (1L << (T_SYSDATE - 321)) | (1L << (T_VARIANCE - 321)) | (1L << (T_USER - 321)) | (1L << (L_ID - 321)) | (1L << (L_S_STRING - 321)) | (1L << (L_D_STRING - 321)))) != 0)) {
				{
				{
				setState(1041);
				package_spec_item();
				setState(1042);
				match(T_SEMICOLON);
				}
				}
				setState(1048);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Package_spec_itemContext extends ParserRuleContext {
		public Declare_stmt_itemContext declare_stmt_item() {
			return getRuleContext(Declare_stmt_itemContext.class,0);
		}
		public TerminalNode T_FUNCTION() { return getToken(HplsqlParser.T_FUNCTION, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_function_returnContext create_function_return() {
			return getRuleContext(Create_function_returnContext.class,0);
		}
		public Create_routine_paramsContext create_routine_params() {
			return getRuleContext(Create_routine_paramsContext.class,0);
		}
		public TerminalNode T_PROCEDURE() { return getToken(HplsqlParser.T_PROCEDURE, 0); }
		public TerminalNode T_PROC() { return getToken(HplsqlParser.T_PROC, 0); }
		public Package_spec_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_spec_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterPackage_spec_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitPackage_spec_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitPackage_spec_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_spec_itemContext package_spec_item() throws RecognitionException {
		Package_spec_itemContext _localctx = new Package_spec_itemContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_package_spec_item);
		int _la;
		try {
			setState(1062);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1049);
				declare_stmt_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1050);
				match(T_FUNCTION);
				setState(1051);
				ident();
				setState(1053);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
				case 1:
					{
					setState(1052);
					create_routine_params();
					}
					break;
				}
				setState(1055);
				create_function_return();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1057);
				_la = _input.LA(1);
				if ( !(_la==T_PROC || _la==T_PROCEDURE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1058);
				ident();
				setState(1060);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(1059);
					create_routine_params();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArraysContext extends ParserRuleContext {
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_OPEN_SB() { return getToken(HplsqlParser.T_OPEN_SB, 0); }
		public TerminalNode T_CLOSE_SB() { return getToken(HplsqlParser.T_CLOSE_SB, 0); }
		public TerminalNode T_EQUAL() { return getToken(HplsqlParser.T_EQUAL, 0); }
		public TerminalNode T_SEMICOLON() { return getToken(HplsqlParser.T_SEMICOLON, 0); }
		public ArraysContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrays; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterArrays(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitArrays(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitArrays(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArraysContext arrays() throws RecognitionException {
		ArraysContext _localctx = new ArraysContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_arrays);
		try {
			setState(1084);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1064);
				dtype();
				setState(1065);
				ident();
				setState(1066);
				match(T_OPEN_SB);
				setState(1067);
				match(T_CLOSE_SB);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1069);
				dtype();
				setState(1070);
				ident();
				setState(1071);
				match(T_OPEN_SB);
				setState(1072);
				ident();
				setState(1073);
				match(T_CLOSE_SB);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1075);
				dtype();
				setState(1076);
				ident();
				setState(1077);
				match(T_EQUAL);
				setState(1078);
				ident();
				setState(1079);
				match(T_OPEN_SB);
				setState(1080);
				ident();
				setState(1081);
				match(T_CLOSE_SB);
				setState(1082);
				match(T_SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DtypeContext extends ParserRuleContext {
		public TerminalNode T_INT() { return getToken(HplsqlParser.T_INT, 0); }
		public TerminalNode T_STRING() { return getToken(HplsqlParser.T_STRING, 0); }
		public TerminalNode T_VAR() { return getToken(HplsqlParser.T_VAR, 0); }
		public TerminalNode T_REAL() { return getToken(HplsqlParser.T_REAL, 0); }
		public TerminalNode T_BOOL() { return getToken(HplsqlParser.T_BOOL, 0); }
		public TerminalNode T_FLOAT() { return getToken(HplsqlParser.T_FLOAT, 0); }
		public TerminalNode T_DOUBLE() { return getToken(HplsqlParser.T_DOUBLE, 0); }
		public TerminalNode T_BIGINT() { return getToken(HplsqlParser.T_BIGINT, 0); }
		public DtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDtype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DtypeContext dtype() throws RecognitionException {
		DtypeContext _localctx = new DtypeContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_dtype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1086);
			_la = _input.LA(1);
			if ( !(_la==T_BIGINT || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (T_DOUBLE - 91)) | (1L << (T_FLOAT - 91)) | (1L << (T_REAL - 91)) | (1L << (T_INT - 91)))) != 0) || _la==T_STRING || _la==T_VAR || _la==T_BOOL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cpp_stmtContext extends ParserRuleContext {
		public Init_expression_cpp_stmtContext init_expression_cpp_stmt() {
			return getRuleContext(Init_expression_cpp_stmtContext.class,0);
		}
		public TerminalNode T_SEMICOLON() { return getToken(HplsqlParser.T_SEMICOLON, 0); }
		public Assignment_cppContext assignment_cpp() {
			return getRuleContext(Assignment_cppContext.class,0);
		}
		public For_stmt_cppContext for_stmt_cpp() {
			return getRuleContext(For_stmt_cppContext.class,0);
		}
		public If_else_stmt_cppContext if_else_stmt_cpp() {
			return getRuleContext(If_else_stmt_cppContext.class,0);
		}
		public ArraysContext arrays() {
			return getRuleContext(ArraysContext.class,0);
		}
		public OperatorsContext operators() {
			return getRuleContext(OperatorsContext.class,0);
		}
		public Cpp_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cpp_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCpp_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCpp_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCpp_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cpp_stmtContext cpp_stmt() throws RecognitionException {
		Cpp_stmtContext _localctx = new Cpp_stmtContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_cpp_stmt);
		try {
			setState(1098);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1088);
				init_expression_cpp_stmt();
				setState(1089);
				match(T_SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1091);
				assignment_cpp();
				setState(1092);
				match(T_SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1094);
				for_stmt_cpp();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1095);
				if_else_stmt_cpp();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1096);
				arrays();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1097);
				operators();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Init_expression_cpp_stmtContext extends ParserRuleContext {
		public Declear_variableContext declear_variable() {
			return getRuleContext(Declear_variableContext.class,0);
		}
		public Set_valueContext set_value() {
			return getRuleContext(Set_valueContext.class,0);
		}
		public Init_expression_cpp_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_expression_cpp_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterInit_expression_cpp_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitInit_expression_cpp_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitInit_expression_cpp_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Init_expression_cpp_stmtContext init_expression_cpp_stmt() throws RecognitionException {
		Init_expression_cpp_stmtContext _localctx = new Init_expression_cpp_stmtContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_init_expression_cpp_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1100);
			declear_variable();
			setState(1102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_EQUAL) {
				{
				setState(1101);
				set_value();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declear_variableContext extends ParserRuleContext {
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Declear_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declear_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDeclear_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDeclear_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDeclear_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declear_variableContext declear_variable() throws RecognitionException {
		Declear_variableContext _localctx = new Declear_variableContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_declear_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1104);
			dtype();
			setState(1105);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_valueContext extends ParserRuleContext {
		public TerminalNode T_EQUAL() { return getToken(HplsqlParser.T_EQUAL, 0); }
		public Expr_cppContext expr_cpp() {
			return getRuleContext(Expr_cppContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public Set_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSet_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSet_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSet_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_valueContext set_value() throws RecognitionException {
		Set_valueContext _localctx = new Set_valueContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_set_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1107);
			match(T_EQUAL);
			setState(1110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				{
				setState(1108);
				expr_cpp(0);
				}
				break;
			case 2:
				{
				setState(1109);
				stmt();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametersContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1112);
			parameter();
			setState(1117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1113);
				match(T_COMMA);
				setState(1114);
				parameter();
				}
				}
				setState(1119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Set_valueContext set_value() {
			return getRuleContext(Set_valueContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1120);
			dtype();
			setState(1121);
			ident();
			setState(1123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_EQUAL) {
				{
				setState(1122);
				set_value();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pre_creationContext extends ParserRuleContext {
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public Variable_nameContext variable_name() {
			return getRuleContext(Variable_nameContext.class,0);
		}
		public Pre_creationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_creation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterPre_creation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitPre_creation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitPre_creation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pre_creationContext pre_creation() throws RecognitionException {
		Pre_creationContext _localctx = new Pre_creationContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_pre_creation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1125);
			dtype();
			setState(1126);
			variable_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_function_cppContext extends ParserRuleContext {
		public Pre_creationContext pre_creation() {
			return getRuleContext(Pre_creationContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Begin_end_block_functionContext begin_end_block_function() {
			return getRuleContext(Begin_end_block_functionContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode T_VOID() { return getToken(HplsqlParser.T_VOID, 0); }
		public Variable_nameContext variable_name() {
			return getRuleContext(Variable_nameContext.class,0);
		}
		public Begin_end_blockContext begin_end_block() {
			return getRuleContext(Begin_end_blockContext.class,0);
		}
		public Create_function_cppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_function_cpp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_function_cpp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_function_cpp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_function_cpp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_function_cppContext create_function_cpp() throws RecognitionException {
		Create_function_cppContext _localctx = new Create_function_cppContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_create_function_cpp);
		int _la;
		try {
			setState(1145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_BIGINT:
			case T_DOUBLE:
			case T_FLOAT:
			case T_REAL:
			case T_INT:
			case T_STRING:
			case T_VAR:
			case T_BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1128);
				pre_creation();
				setState(1129);
				match(T_OPEN_P);
				setState(1131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_BIGINT || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (T_DOUBLE - 91)) | (1L << (T_FLOAT - 91)) | (1L << (T_REAL - 91)) | (1L << (T_INT - 91)))) != 0) || _la==T_STRING || _la==T_VAR || _la==T_BOOL) {
					{
					setState(1130);
					parameters();
					}
				}

				setState(1133);
				match(T_CLOSE_P);
				setState(1134);
				begin_end_block_function();
				}
				break;
			case T_VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(1136);
				match(T_VOID);
				setState(1137);
				variable_name();
				setState(1138);
				match(T_OPEN_P);
				setState(1140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_BIGINT || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (T_DOUBLE - 91)) | (1L << (T_FLOAT - 91)) | (1L << (T_REAL - 91)) | (1L << (T_INT - 91)))) != 0) || _la==T_STRING || _la==T_VAR || _la==T_BOOL) {
					{
					setState(1139);
					parameters();
					}
				}

				setState(1142);
				match(T_CLOSE_P);
				setState(1143);
				begin_end_block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_cppContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(HplsqlParser.T_EQUAL, 0); }
		public Expr_cppContext expr_cpp() {
			return getRuleContext(Expr_cppContext.class,0);
		}
		public Assignment_cppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_cpp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterAssignment_cpp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitAssignment_cpp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitAssignment_cpp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_cppContext assignment_cpp() throws RecognitionException {
		Assignment_cppContext _localctx = new Assignment_cppContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_assignment_cpp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1147);
			ident();
			setState(1148);
			match(T_EQUAL);
			setState(1149);
			expr_cpp(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorsContext extends ParserRuleContext {
		public List<Variable_nameContext> variable_name() {
			return getRuleContexts(Variable_nameContext.class);
		}
		public Variable_nameContext variable_name(int i) {
			return getRuleContext(Variable_nameContext.class,i);
		}
		public List<TerminalNode> T_ADD() { return getTokens(HplsqlParser.T_ADD); }
		public TerminalNode T_ADD(int i) {
			return getToken(HplsqlParser.T_ADD, i);
		}
		public List<TerminalNode> T_SUB() { return getTokens(HplsqlParser.T_SUB); }
		public TerminalNode T_SUB(int i) {
			return getToken(HplsqlParser.T_SUB, i);
		}
		public TerminalNode T_EQUAL() { return getToken(HplsqlParser.T_EQUAL, 0); }
		public TerminalNode T_MUL() { return getToken(HplsqlParser.T_MUL, 0); }
		public TerminalNode T_DIV() { return getToken(HplsqlParser.T_DIV, 0); }
		public OperatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterOperators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitOperators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitOperators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorsContext operators() throws RecognitionException {
		OperatorsContext _localctx = new OperatorsContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_operators);
		try {
			setState(1179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1151);
				variable_name();
				setState(1152);
				match(T_ADD);
				setState(1153);
				match(T_ADD);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1155);
				variable_name();
				setState(1156);
				match(T_SUB);
				setState(1157);
				match(T_SUB);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1159);
				variable_name();
				setState(1160);
				match(T_ADD);
				setState(1161);
				match(T_EQUAL);
				setState(1162);
				variable_name();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1164);
				variable_name();
				setState(1165);
				match(T_SUB);
				setState(1166);
				match(T_EQUAL);
				setState(1167);
				variable_name();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1169);
				variable_name();
				setState(1170);
				match(T_MUL);
				setState(1171);
				match(T_EQUAL);
				setState(1172);
				variable_name();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1174);
				variable_name();
				setState(1175);
				match(T_DIV);
				setState(1176);
				match(T_EQUAL);
				setState(1177);
				variable_name();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_stmt_cppContext extends ParserRuleContext {
		public TerminalNode T_FOR() { return getToken(HplsqlParser.T_FOR, 0); }
		public For_headerContext for_header() {
			return getRuleContext(For_headerContext.class,0);
		}
		public Begin_end_blockContext begin_end_block() {
			return getRuleContext(Begin_end_blockContext.class,0);
		}
		public For_stmt_cppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stmt_cpp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFor_stmt_cpp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFor_stmt_cpp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFor_stmt_cpp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_stmt_cppContext for_stmt_cpp() throws RecognitionException {
		For_stmt_cppContext _localctx = new For_stmt_cppContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_for_stmt_cpp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1181);
			match(T_FOR);
			setState(1182);
			for_header();
			setState(1183);
			begin_end_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_headerContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public List<TerminalNode> T_SEMICOLON() { return getTokens(HplsqlParser.T_SEMICOLON); }
		public TerminalNode T_SEMICOLON(int i) {
			return getToken(HplsqlParser.T_SEMICOLON, i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<For_begin_conditionContext> for_begin_condition() {
			return getRuleContexts(For_begin_conditionContext.class);
		}
		public For_begin_conditionContext for_begin_condition(int i) {
			return getRuleContext(For_begin_conditionContext.class,i);
		}
		public List<Variable_nameContext> variable_name() {
			return getRuleContexts(Variable_nameContext.class);
		}
		public Variable_nameContext variable_name(int i) {
			return getRuleContext(Variable_nameContext.class,i);
		}
		public List<ComparesContext> compares() {
			return getRuleContexts(ComparesContext.class);
		}
		public ComparesContext compares(int i) {
			return getRuleContext(ComparesContext.class,i);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<OperatorsContext> operators() {
			return getRuleContexts(OperatorsContext.class);
		}
		public OperatorsContext operators(int i) {
			return getRuleContext(OperatorsContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public List<TerminalNode> T_COUNT() { return getTokens(HplsqlParser.T_COUNT); }
		public TerminalNode T_COUNT(int i) {
			return getToken(HplsqlParser.T_COUNT, i);
		}
		public List<TerminalNode> T_AND_cpp() { return getTokens(HplsqlParser.T_AND_cpp); }
		public TerminalNode T_AND_cpp(int i) {
			return getToken(HplsqlParser.T_AND_cpp, i);
		}
		public List<TerminalNode> T_PIPE() { return getTokens(HplsqlParser.T_PIPE); }
		public TerminalNode T_PIPE(int i) {
			return getToken(HplsqlParser.T_PIPE, i);
		}
		public For_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFor_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFor_header(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFor_header(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_headerContext for_header() throws RecognitionException {
		For_headerContext _localctx = new For_headerContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_for_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1185);
			match(T_OPEN_P);
			setState(1194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_ADD2) | (1L << T_ALL) | (1L << T_ALLOCATE) | (1L << T_ALTER) | (1L << T_AND) | (1L << T_ANSI_NULLS) | (1L << T_ANSI_PADDING) | (1L << T_AS) | (1L << T_ASC) | (1L << T_ASSOCIATE) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BATCHSIZE) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CALLER) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLIENT) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECT) | (1L << T_COLLECTION) | (1L << T_COLUMN) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMMIT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COPY) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CREATION) | (1L << T_CREATOR) | (1L << T_CS) | (1L << T_CURRENT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_CURRENT_SCHEMA - 64)) | (1L << (T_CURSOR - 64)) | (1L << (T_DATABASE - 64)) | (1L << (T_DATA - 64)) | (1L << (T_DATE - 64)) | (1L << (T_DATETIME - 64)) | (1L << (T_DAY - 64)) | (1L << (T_DAYS - 64)) | (1L << (T_DEC - 64)) | (1L << (T_DECIMAL - 64)) | (1L << (T_DECLARE - 64)) | (1L << (T_DEFAULT - 64)) | (1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DELIMITER - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DESCRIBE - 64)) | (1L << (T_DIAGNOSTICS - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DIRECTORY - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DO - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DROP - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXEC - 64)) | (1L << (T_EXECUTE - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FETCH - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FILE - 64)) | (1L << (T_FILES - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_REAL - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GET - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)) | (1L << (T_GRANT - 64)) | (1L << (T_GROUP - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_HANDLER - 128)) | (1L << (T_HASH - 128)) | (1L << (T_HAVING - 128)) | (1L << (T_HDFS - 128)) | (1L << (T_HIVE - 128)) | (1L << (T_HOST - 128)) | (1L << (T_IDENTITY - 128)) | (1L << (T_IF - 128)) | (1L << (T_IGNORE - 128)) | (1L << (T_IMMEDIATE - 128)) | (1L << (T_IN - 128)) | (1L << (T_INCLUDE - 128)) | (1L << (T_INDEX - 128)) | (1L << (T_INITRANS - 128)) | (1L << (T_INNER - 128)) | (1L << (T_INOUT - 128)) | (1L << (T_INSERT - 128)) | (1L << (T_INT - 128)) | (1L << (T_INT2 - 128)) | (1L << (T_INT4 - 128)) | (1L << (T_INT8 - 128)) | (1L << (T_INTEGER - 128)) | (1L << (T_INTERSECT - 128)) | (1L << (T_INTERVAL - 128)) | (1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCATOR - 128)) | (1L << (T_LOCATORS - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MATCHED - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MERGE - 128)) | (1L << (T_MESSAGE_TEXT - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NEW - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)) | (1L << (T_NOCOUNT - 128)) | (1L << (T_NOCOMPRESS - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_NOLOGGING - 192)) | (1L << (T_NONE - 192)) | (1L << (T_NOT - 192)) | (1L << (T_NOTFOUND - 192)) | (1L << (T_NUMERIC - 192)) | (1L << (T_NUMBER - 192)) | (1L << (T_OBJECT - 192)) | (1L << (T_OFF - 192)) | (1L << (T_ON - 192)) | (1L << (T_ONLY - 192)) | (1L << (T_OPEN - 192)) | (1L << (T_OR - 192)) | (1L << (T_ORDER - 192)) | (1L << (T_OUT - 192)) | (1L << (T_OUTER - 192)) | (1L << (T_OVER - 192)) | (1L << (T_OVERWRITE - 192)) | (1L << (T_OWNER - 192)) | (1L << (T_PACKAGE - 192)) | (1L << (T_PARTITION - 192)) | (1L << (T_PCTFREE - 192)) | (1L << (T_PCTUSED - 192)) | (1L << (T_PRECISION - 192)) | (1L << (T_PRESERVE - 192)) | (1L << (T_PRIMARY - 192)) | (1L << (T_PRINT - 192)) | (1L << (T_PROC - 192)) | (1L << (T_PROCEDURE - 192)) | (1L << (T_QUALIFY - 192)) | (1L << (T_QUERY_BAND - 192)) | (1L << (T_QUIT - 192)) | (1L << (T_QUOTED_IDENTIFIER - 192)) | (1L << (T_RAISE - 192)) | (1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESIGNAL - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROLE - 192)) | (1L << (T_ROLLBACK - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)) | (1L << (T_ROW_COUNT - 192)) | (1L << (T_RR - 192)) | (1L << (T_RS - 192)) | (1L << (T_PWD - 192)) | (1L << (T_TRIM - 192)) | (1L << (T_SCHEMA - 192)) | (1L << (T_SECOND - 192)) | (1L << (T_SECONDS - 192)) | (1L << (T_SECURITY - 192)) | (1L << (T_SEGMENT - 192)) | (1L << (T_SEL - 192)) | (1L << (T_SELECT - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_SET - 256)) | (1L << (T_SESSION - 256)) | (1L << (T_SESSIONS - 256)) | (1L << (T_SETS - 256)) | (1L << (T_SHARE - 256)) | (1L << (T_SIGNAL - 256)) | (1L << (T_SIMPLE_DOUBLE - 256)) | (1L << (T_SIMPLE_FLOAT - 256)) | (1L << (T_SMALLDATETIME - 256)) | (1L << (T_SMALLINT - 256)) | (1L << (T_SQL - 256)) | (1L << (T_SQLEXCEPTION - 256)) | (1L << (T_SQLINSERT - 256)) | (1L << (T_SQLSTATE - 256)) | (1L << (T_SQLWARNING - 256)) | (1L << (T_STATS - 256)) | (1L << (T_STATISTICS - 256)) | (1L << (T_STEP - 256)) | (1L << (T_STORAGE - 256)) | (1L << (T_STORED - 256)) | (1L << (T_STRING - 256)) | (1L << (T_SUBDIR - 256)) | (1L << (T_SUBSTRING - 256)) | (1L << (T_SUM - 256)) | (1L << (T_SUMMARY - 256)) | (1L << (T_SYS_REFCURSOR - 256)) | (1L << (T_TABLE - 256)) | (1L << (T_TABLESPACE - 256)) | (1L << (T_TEMPORARY - 256)) | (1L << (T_TERMINATED - 256)) | (1L << (T_TEXTIMAGE_ON - 256)) | (1L << (T_THEN - 256)) | (1L << (T_TIMESTAMP - 256)) | (1L << (T_TITLE - 256)) | (1L << (T_TO - 256)) | (1L << (T_TOP - 256)) | (1L << (T_TRANSACTION - 256)) | (1L << (T_TRUE - 256)) | (1L << (T_TRUNCATE - 256)) | (1L << (T_UNIQUE - 256)) | (1L << (T_UPDATE - 256)) | (1L << (T_UR - 256)) | (1L << (T_USE - 256)) | (1L << (T_USING - 256)) | (1L << (T_VALUE - 256)) | (1L << (T_VALUES - 256)) | (1L << (T_VAR - 256)) | (1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_VARYING - 256)) | (1L << (T_VOLATILE - 256)) | (1L << (T_WHILE - 256)) | (1L << (T_WITH - 256)) | (1L << (T_WITHOUT - 256)) | (1L << (T_WORK - 256)) | (1L << (T_XACT_ABORT - 256)) | (1L << (T_XML - 256)) | (1L << (T_YES - 256)))) != 0) || ((((_la - 321)) & ~0x3f) == 0 && ((1L << (_la - 321)) & ((1L << (T_ACTIVITY_COUNT - 321)) | (1L << (T_CUME_DIST - 321)) | (1L << (T_CURRENT_DATE - 321)) | (1L << (T_CURRENT_TIMESTAMP - 321)) | (1L << (T_CURRENT_USER - 321)) | (1L << (T_DENSE_RANK - 321)) | (1L << (T_FIRST_VALUE - 321)) | (1L << (T_LAG - 321)) | (1L << (T_LAST_VALUE - 321)) | (1L << (T_LEAD - 321)) | (1L << (T_PART_COUNT - 321)) | (1L << (T_PART_LOC - 321)) | (1L << (T_RANK - 321)) | (1L << (T_ROW_NUMBER - 321)) | (1L << (T_STDEV - 321)) | (1L << (T_SYSDATE - 321)) | (1L << (T_VARIANCE - 321)) | (1L << (T_USER - 321)) | (1L << (T_BOOL - 321)) | (1L << (L_ID - 321)) | (1L << (L_S_STRING - 321)) | (1L << (L_D_STRING - 321)))) != 0)) {
				{
				setState(1186);
				for_begin_condition();
				setState(1191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1187);
					match(T_COMMA);
					setState(1188);
					for_begin_condition();
					}
					}
					setState(1193);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1196);
			match(T_SEMICOLON);
			setState(1211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_ADD2) | (1L << T_ALL) | (1L << T_ALLOCATE) | (1L << T_ALTER) | (1L << T_AND) | (1L << T_ANSI_NULLS) | (1L << T_ANSI_PADDING) | (1L << T_AS) | (1L << T_ASC) | (1L << T_ASSOCIATE) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BATCHSIZE) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CALLER) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLIENT) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECT) | (1L << T_COLLECTION) | (1L << T_COLUMN) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMMIT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COPY) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CREATION) | (1L << T_CREATOR) | (1L << T_CS) | (1L << T_CURRENT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_CURRENT_SCHEMA - 64)) | (1L << (T_CURSOR - 64)) | (1L << (T_DATABASE - 64)) | (1L << (T_DATA - 64)) | (1L << (T_DATE - 64)) | (1L << (T_DATETIME - 64)) | (1L << (T_DAY - 64)) | (1L << (T_DAYS - 64)) | (1L << (T_DEC - 64)) | (1L << (T_DECIMAL - 64)) | (1L << (T_DECLARE - 64)) | (1L << (T_DEFAULT - 64)) | (1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DELIMITER - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DESCRIBE - 64)) | (1L << (T_DIAGNOSTICS - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DIRECTORY - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DO - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DROP - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXEC - 64)) | (1L << (T_EXECUTE - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FETCH - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FILE - 64)) | (1L << (T_FILES - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GET - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)) | (1L << (T_GRANT - 64)) | (1L << (T_GROUP - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_HANDLER - 128)) | (1L << (T_HASH - 128)) | (1L << (T_HAVING - 128)) | (1L << (T_HDFS - 128)) | (1L << (T_HIVE - 128)) | (1L << (T_HOST - 128)) | (1L << (T_IDENTITY - 128)) | (1L << (T_IF - 128)) | (1L << (T_IGNORE - 128)) | (1L << (T_IMMEDIATE - 128)) | (1L << (T_IN - 128)) | (1L << (T_INCLUDE - 128)) | (1L << (T_INDEX - 128)) | (1L << (T_INITRANS - 128)) | (1L << (T_INNER - 128)) | (1L << (T_INOUT - 128)) | (1L << (T_INSERT - 128)) | (1L << (T_INT2 - 128)) | (1L << (T_INT4 - 128)) | (1L << (T_INT8 - 128)) | (1L << (T_INTEGER - 128)) | (1L << (T_INTERSECT - 128)) | (1L << (T_INTERVAL - 128)) | (1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCATOR - 128)) | (1L << (T_LOCATORS - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MATCHED - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MERGE - 128)) | (1L << (T_MESSAGE_TEXT - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NEW - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)) | (1L << (T_NOCOUNT - 128)) | (1L << (T_NOCOMPRESS - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_NOLOGGING - 192)) | (1L << (T_NONE - 192)) | (1L << (T_NOT - 192)) | (1L << (T_NOTFOUND - 192)) | (1L << (T_NUMERIC - 192)) | (1L << (T_NUMBER - 192)) | (1L << (T_OBJECT - 192)) | (1L << (T_OFF - 192)) | (1L << (T_ON - 192)) | (1L << (T_ONLY - 192)) | (1L << (T_OPEN - 192)) | (1L << (T_OR - 192)) | (1L << (T_ORDER - 192)) | (1L << (T_OUT - 192)) | (1L << (T_OUTER - 192)) | (1L << (T_OVER - 192)) | (1L << (T_OVERWRITE - 192)) | (1L << (T_OWNER - 192)) | (1L << (T_PACKAGE - 192)) | (1L << (T_PARTITION - 192)) | (1L << (T_PCTFREE - 192)) | (1L << (T_PCTUSED - 192)) | (1L << (T_PRECISION - 192)) | (1L << (T_PRESERVE - 192)) | (1L << (T_PRIMARY - 192)) | (1L << (T_PRINT - 192)) | (1L << (T_PROC - 192)) | (1L << (T_PROCEDURE - 192)) | (1L << (T_QUALIFY - 192)) | (1L << (T_QUERY_BAND - 192)) | (1L << (T_QUIT - 192)) | (1L << (T_QUOTED_IDENTIFIER - 192)) | (1L << (T_RAISE - 192)) | (1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESIGNAL - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROLE - 192)) | (1L << (T_ROLLBACK - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)) | (1L << (T_ROW_COUNT - 192)) | (1L << (T_RR - 192)) | (1L << (T_RS - 192)) | (1L << (T_PWD - 192)) | (1L << (T_TRIM - 192)) | (1L << (T_SCHEMA - 192)) | (1L << (T_SECOND - 192)) | (1L << (T_SECONDS - 192)) | (1L << (T_SECURITY - 192)) | (1L << (T_SEGMENT - 192)) | (1L << (T_SEL - 192)) | (1L << (T_SELECT - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_SET - 256)) | (1L << (T_SESSION - 256)) | (1L << (T_SESSIONS - 256)) | (1L << (T_SETS - 256)) | (1L << (T_SHARE - 256)) | (1L << (T_SIGNAL - 256)) | (1L << (T_SIMPLE_DOUBLE - 256)) | (1L << (T_SIMPLE_FLOAT - 256)) | (1L << (T_SMALLDATETIME - 256)) | (1L << (T_SMALLINT - 256)) | (1L << (T_SQL - 256)) | (1L << (T_SQLEXCEPTION - 256)) | (1L << (T_SQLINSERT - 256)) | (1L << (T_SQLSTATE - 256)) | (1L << (T_SQLWARNING - 256)) | (1L << (T_STATS - 256)) | (1L << (T_STATISTICS - 256)) | (1L << (T_STEP - 256)) | (1L << (T_STORAGE - 256)) | (1L << (T_STORED - 256)) | (1L << (T_SUBDIR - 256)) | (1L << (T_SUBSTRING - 256)) | (1L << (T_SUM - 256)) | (1L << (T_SUMMARY - 256)) | (1L << (T_SYS_REFCURSOR - 256)) | (1L << (T_TABLE - 256)) | (1L << (T_TABLESPACE - 256)) | (1L << (T_TEMPORARY - 256)) | (1L << (T_TERMINATED - 256)) | (1L << (T_TEXTIMAGE_ON - 256)) | (1L << (T_THEN - 256)) | (1L << (T_TIMESTAMP - 256)) | (1L << (T_TITLE - 256)) | (1L << (T_TO - 256)) | (1L << (T_TOP - 256)) | (1L << (T_TRANSACTION - 256)) | (1L << (T_TRUE - 256)) | (1L << (T_TRUNCATE - 256)) | (1L << (T_UNIQUE - 256)) | (1L << (T_UPDATE - 256)) | (1L << (T_UR - 256)) | (1L << (T_USE - 256)) | (1L << (T_USING - 256)) | (1L << (T_VALUE - 256)) | (1L << (T_VALUES - 256)) | (1L << (T_VAR - 256)) | (1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_VARYING - 256)) | (1L << (T_VOLATILE - 256)) | (1L << (T_WHILE - 256)) | (1L << (T_WITH - 256)) | (1L << (T_WITHOUT - 256)) | (1L << (T_WORK - 256)) | (1L << (T_XACT_ABORT - 256)) | (1L << (T_XML - 256)) | (1L << (T_YES - 256)))) != 0) || ((((_la - 321)) & ~0x3f) == 0 && ((1L << (_la - 321)) & ((1L << (T_ACTIVITY_COUNT - 321)) | (1L << (T_CUME_DIST - 321)) | (1L << (T_CURRENT_DATE - 321)) | (1L << (T_CURRENT_TIMESTAMP - 321)) | (1L << (T_CURRENT_USER - 321)) | (1L << (T_DENSE_RANK - 321)) | (1L << (T_FIRST_VALUE - 321)) | (1L << (T_LAG - 321)) | (1L << (T_LAST_VALUE - 321)) | (1L << (T_LEAD - 321)) | (1L << (T_PART_COUNT - 321)) | (1L << (T_PART_LOC - 321)) | (1L << (T_RANK - 321)) | (1L << (T_ROW_NUMBER - 321)) | (1L << (T_STDEV - 321)) | (1L << (T_SYSDATE - 321)) | (1L << (T_VARIANCE - 321)) | (1L << (T_USER - 321)) | (1L << (L_ID - 321)) | (1L << (L_S_STRING - 321)) | (1L << (L_D_STRING - 321)))) != 0)) {
				{
				setState(1197);
				variable_name();
				setState(1198);
				compares();
				setState(1199);
				ident();
				setState(1208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 347)) & ~0x3f) == 0 && ((1L << (_la - 347)) & ((1L << (T_COMMA - 347)) | (1L << (T_PIPE - 347)) | (1L << (T_AND_cpp - 347)))) != 0)) {
					{
					{
					setState(1200);
					_la = _input.LA(1);
					if ( !(((((_la - 347)) & ~0x3f) == 0 && ((1L << (_la - 347)) & ((1L << (T_COMMA - 347)) | (1L << (T_PIPE - 347)) | (1L << (T_AND_cpp - 347)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1201);
					variable_name();
					setState(1202);
					compares();
					setState(1203);
					ident();
					setState(1204);
					match(T_COUNT);
					}
					}
					setState(1210);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1213);
			match(T_SEMICOLON);
			setState(1222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_ADD2) | (1L << T_ALL) | (1L << T_ALLOCATE) | (1L << T_ALTER) | (1L << T_AND) | (1L << T_ANSI_NULLS) | (1L << T_ANSI_PADDING) | (1L << T_AS) | (1L << T_ASC) | (1L << T_ASSOCIATE) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BATCHSIZE) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CALLER) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLIENT) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECT) | (1L << T_COLLECTION) | (1L << T_COLUMN) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMMIT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COPY) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CREATION) | (1L << T_CREATOR) | (1L << T_CS) | (1L << T_CURRENT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_CURRENT_SCHEMA - 64)) | (1L << (T_CURSOR - 64)) | (1L << (T_DATABASE - 64)) | (1L << (T_DATA - 64)) | (1L << (T_DATE - 64)) | (1L << (T_DATETIME - 64)) | (1L << (T_DAY - 64)) | (1L << (T_DAYS - 64)) | (1L << (T_DEC - 64)) | (1L << (T_DECIMAL - 64)) | (1L << (T_DECLARE - 64)) | (1L << (T_DEFAULT - 64)) | (1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DELIMITER - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DESCRIBE - 64)) | (1L << (T_DIAGNOSTICS - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DIRECTORY - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DO - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DROP - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXEC - 64)) | (1L << (T_EXECUTE - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FETCH - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FILE - 64)) | (1L << (T_FILES - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GET - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)) | (1L << (T_GRANT - 64)) | (1L << (T_GROUP - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_HANDLER - 128)) | (1L << (T_HASH - 128)) | (1L << (T_HAVING - 128)) | (1L << (T_HDFS - 128)) | (1L << (T_HIVE - 128)) | (1L << (T_HOST - 128)) | (1L << (T_IDENTITY - 128)) | (1L << (T_IF - 128)) | (1L << (T_IGNORE - 128)) | (1L << (T_IMMEDIATE - 128)) | (1L << (T_IN - 128)) | (1L << (T_INCLUDE - 128)) | (1L << (T_INDEX - 128)) | (1L << (T_INITRANS - 128)) | (1L << (T_INNER - 128)) | (1L << (T_INOUT - 128)) | (1L << (T_INSERT - 128)) | (1L << (T_INT2 - 128)) | (1L << (T_INT4 - 128)) | (1L << (T_INT8 - 128)) | (1L << (T_INTEGER - 128)) | (1L << (T_INTERSECT - 128)) | (1L << (T_INTERVAL - 128)) | (1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCATOR - 128)) | (1L << (T_LOCATORS - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MATCHED - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MERGE - 128)) | (1L << (T_MESSAGE_TEXT - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NEW - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)) | (1L << (T_NOCOUNT - 128)) | (1L << (T_NOCOMPRESS - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_NOLOGGING - 192)) | (1L << (T_NONE - 192)) | (1L << (T_NOT - 192)) | (1L << (T_NOTFOUND - 192)) | (1L << (T_NUMERIC - 192)) | (1L << (T_NUMBER - 192)) | (1L << (T_OBJECT - 192)) | (1L << (T_OFF - 192)) | (1L << (T_ON - 192)) | (1L << (T_ONLY - 192)) | (1L << (T_OPEN - 192)) | (1L << (T_OR - 192)) | (1L << (T_ORDER - 192)) | (1L << (T_OUT - 192)) | (1L << (T_OUTER - 192)) | (1L << (T_OVER - 192)) | (1L << (T_OVERWRITE - 192)) | (1L << (T_OWNER - 192)) | (1L << (T_PACKAGE - 192)) | (1L << (T_PARTITION - 192)) | (1L << (T_PCTFREE - 192)) | (1L << (T_PCTUSED - 192)) | (1L << (T_PRECISION - 192)) | (1L << (T_PRESERVE - 192)) | (1L << (T_PRIMARY - 192)) | (1L << (T_PRINT - 192)) | (1L << (T_PROC - 192)) | (1L << (T_PROCEDURE - 192)) | (1L << (T_QUALIFY - 192)) | (1L << (T_QUERY_BAND - 192)) | (1L << (T_QUIT - 192)) | (1L << (T_QUOTED_IDENTIFIER - 192)) | (1L << (T_RAISE - 192)) | (1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESIGNAL - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROLE - 192)) | (1L << (T_ROLLBACK - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)) | (1L << (T_ROW_COUNT - 192)) | (1L << (T_RR - 192)) | (1L << (T_RS - 192)) | (1L << (T_PWD - 192)) | (1L << (T_TRIM - 192)) | (1L << (T_SCHEMA - 192)) | (1L << (T_SECOND - 192)) | (1L << (T_SECONDS - 192)) | (1L << (T_SECURITY - 192)) | (1L << (T_SEGMENT - 192)) | (1L << (T_SEL - 192)) | (1L << (T_SELECT - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_SET - 256)) | (1L << (T_SESSION - 256)) | (1L << (T_SESSIONS - 256)) | (1L << (T_SETS - 256)) | (1L << (T_SHARE - 256)) | (1L << (T_SIGNAL - 256)) | (1L << (T_SIMPLE_DOUBLE - 256)) | (1L << (T_SIMPLE_FLOAT - 256)) | (1L << (T_SMALLDATETIME - 256)) | (1L << (T_SMALLINT - 256)) | (1L << (T_SQL - 256)) | (1L << (T_SQLEXCEPTION - 256)) | (1L << (T_SQLINSERT - 256)) | (1L << (T_SQLSTATE - 256)) | (1L << (T_SQLWARNING - 256)) | (1L << (T_STATS - 256)) | (1L << (T_STATISTICS - 256)) | (1L << (T_STEP - 256)) | (1L << (T_STORAGE - 256)) | (1L << (T_STORED - 256)) | (1L << (T_SUBDIR - 256)) | (1L << (T_SUBSTRING - 256)) | (1L << (T_SUM - 256)) | (1L << (T_SUMMARY - 256)) | (1L << (T_SYS_REFCURSOR - 256)) | (1L << (T_TABLE - 256)) | (1L << (T_TABLESPACE - 256)) | (1L << (T_TEMPORARY - 256)) | (1L << (T_TERMINATED - 256)) | (1L << (T_TEXTIMAGE_ON - 256)) | (1L << (T_THEN - 256)) | (1L << (T_TIMESTAMP - 256)) | (1L << (T_TITLE - 256)) | (1L << (T_TO - 256)) | (1L << (T_TOP - 256)) | (1L << (T_TRANSACTION - 256)) | (1L << (T_TRUE - 256)) | (1L << (T_TRUNCATE - 256)) | (1L << (T_UNIQUE - 256)) | (1L << (T_UPDATE - 256)) | (1L << (T_UR - 256)) | (1L << (T_USE - 256)) | (1L << (T_USING - 256)) | (1L << (T_VALUE - 256)) | (1L << (T_VALUES - 256)) | (1L << (T_VAR - 256)) | (1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_VARYING - 256)) | (1L << (T_VOLATILE - 256)) | (1L << (T_WHILE - 256)) | (1L << (T_WITH - 256)) | (1L << (T_WITHOUT - 256)) | (1L << (T_WORK - 256)) | (1L << (T_XACT_ABORT - 256)) | (1L << (T_XML - 256)) | (1L << (T_YES - 256)))) != 0) || ((((_la - 321)) & ~0x3f) == 0 && ((1L << (_la - 321)) & ((1L << (T_ACTIVITY_COUNT - 321)) | (1L << (T_CUME_DIST - 321)) | (1L << (T_CURRENT_DATE - 321)) | (1L << (T_CURRENT_TIMESTAMP - 321)) | (1L << (T_CURRENT_USER - 321)) | (1L << (T_DENSE_RANK - 321)) | (1L << (T_FIRST_VALUE - 321)) | (1L << (T_LAG - 321)) | (1L << (T_LAST_VALUE - 321)) | (1L << (T_LEAD - 321)) | (1L << (T_PART_COUNT - 321)) | (1L << (T_PART_LOC - 321)) | (1L << (T_RANK - 321)) | (1L << (T_ROW_NUMBER - 321)) | (1L << (T_STDEV - 321)) | (1L << (T_SYSDATE - 321)) | (1L << (T_VARIANCE - 321)) | (1L << (T_USER - 321)) | (1L << (L_ID - 321)) | (1L << (L_S_STRING - 321)) | (1L << (L_D_STRING - 321)))) != 0)) {
				{
				setState(1214);
				operators();
				setState(1219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1215);
					match(T_COMMA);
					setState(1216);
					operators();
					}
					}
					setState(1221);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1224);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_begin_conditionContext extends ParserRuleContext {
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Set_valueContext set_value() {
			return getRuleContext(Set_valueContext.class,0);
		}
		public Assignment_cppContext assignment_cpp() {
			return getRuleContext(Assignment_cppContext.class,0);
		}
		public For_begin_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_begin_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFor_begin_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFor_begin_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFor_begin_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_begin_conditionContext for_begin_condition() throws RecognitionException {
		For_begin_conditionContext _localctx = new For_begin_conditionContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_for_begin_condition);
		int _la;
		try {
			setState(1232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1226);
				dtype();
				setState(1227);
				ident();
				setState(1229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(1228);
					set_value();
					}
				}

				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1231);
				assignment_cpp();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_nameContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Variable_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterVariable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitVariable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitVariable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_nameContext variable_name() throws RecognitionException {
		Variable_nameContext _localctx = new Variable_nameContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_variable_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1234);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparesContext extends ParserRuleContext {
		public TerminalNode T_GREATER() { return getToken(HplsqlParser.T_GREATER, 0); }
		public TerminalNode T_GREATEREQUAL() { return getToken(HplsqlParser.T_GREATEREQUAL, 0); }
		public TerminalNode T_EQUAL() { return getToken(HplsqlParser.T_EQUAL, 0); }
		public TerminalNode T_LESS() { return getToken(HplsqlParser.T_LESS, 0); }
		public TerminalNode T_LESSEQUAL() { return getToken(HplsqlParser.T_LESSEQUAL, 0); }
		public ComparesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compares; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCompares(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCompares(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCompares(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparesContext compares() throws RecognitionException {
		ComparesContext _localctx = new ComparesContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_compares);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1236);
			_la = _input.LA(1);
			if ( !(((((_la - 351)) & ~0x3f) == 0 && ((1L << (_la - 351)) & ((1L << (T_EQUAL - 351)) | (1L << (T_GREATER - 351)) | (1L << (T_GREATEREQUAL - 351)) | (1L << (T_LESS - 351)) | (1L << (T_LESSEQUAL - 351)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_stmt_c_plus_plusContext extends ParserRuleContext {
		public TerminalNode T_IF() { return getToken(HplsqlParser.T_IF, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public Bool_expr_c_plus_plusContext bool_expr_c_plus_plus() {
			return getRuleContext(Bool_expr_c_plus_plusContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public If_stmt_c_plus_plusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt_c_plus_plus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterIf_stmt_c_plus_plus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitIf_stmt_c_plus_plus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitIf_stmt_c_plus_plus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmt_c_plus_plusContext if_stmt_c_plus_plus() throws RecognitionException {
		If_stmt_c_plus_plusContext _localctx = new If_stmt_c_plus_plusContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_if_stmt_c_plus_plus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1238);
			match(T_IF);
			setState(1239);
			match(T_OPEN_P);
			setState(1240);
			bool_expr_c_plus_plus(0);
			setState(1241);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_structure_c_plus_plusContext extends ParserRuleContext {
		public If_stmt_c_plus_plusContext if_stmt_c_plus_plus() {
			return getRuleContext(If_stmt_c_plus_plusContext.class,0);
		}
		public Begin_end_blockContext begin_end_block() {
			return getRuleContext(Begin_end_blockContext.class,0);
		}
		public If_structure_c_plus_plusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_structure_c_plus_plus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterIf_structure_c_plus_plus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitIf_structure_c_plus_plus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitIf_structure_c_plus_plus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_structure_c_plus_plusContext if_structure_c_plus_plus() throws RecognitionException {
		If_structure_c_plus_plusContext _localctx = new If_structure_c_plus_plusContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_if_structure_c_plus_plus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1243);
			if_stmt_c_plus_plus();
			setState(1244);
			begin_end_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_if_structure_c_plus_plusContext extends ParserRuleContext {
		public TerminalNode T_ELSE() { return getToken(HplsqlParser.T_ELSE, 0); }
		public If_structure_c_plus_plusContext if_structure_c_plus_plus() {
			return getRuleContext(If_structure_c_plus_plusContext.class,0);
		}
		public Else_if_structure_c_plus_plusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_if_structure_c_plus_plus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterElse_if_structure_c_plus_plus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitElse_if_structure_c_plus_plus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitElse_if_structure_c_plus_plus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_if_structure_c_plus_plusContext else_if_structure_c_plus_plus() throws RecognitionException {
		Else_if_structure_c_plus_plusContext _localctx = new Else_if_structure_c_plus_plusContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_else_if_structure_c_plus_plus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1246);
			match(T_ELSE);
			setState(1247);
			if_structure_c_plus_plus();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_structure_c_plus_plusContext extends ParserRuleContext {
		public TerminalNode T_ELSE() { return getToken(HplsqlParser.T_ELSE, 0); }
		public Begin_end_blockContext begin_end_block() {
			return getRuleContext(Begin_end_blockContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public Else_structure_c_plus_plusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_structure_c_plus_plus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterElse_structure_c_plus_plus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitElse_structure_c_plus_plus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitElse_structure_c_plus_plus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_structure_c_plus_plusContext else_structure_c_plus_plus() throws RecognitionException {
		Else_structure_c_plus_plusContext _localctx = new Else_structure_c_plus_plusContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_else_structure_c_plus_plus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1249);
			match(T_ELSE);
			setState(1252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				{
				setState(1250);
				begin_end_block();
				}
				break;
			case 2:
				{
				setState(1251);
				stmt();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_else_stmt_cppContext extends ParserRuleContext {
		public If_structure_c_plus_plusContext if_structure_c_plus_plus() {
			return getRuleContext(If_structure_c_plus_plusContext.class,0);
		}
		public List<Else_if_structure_c_plus_plusContext> else_if_structure_c_plus_plus() {
			return getRuleContexts(Else_if_structure_c_plus_plusContext.class);
		}
		public Else_if_structure_c_plus_plusContext else_if_structure_c_plus_plus(int i) {
			return getRuleContext(Else_if_structure_c_plus_plusContext.class,i);
		}
		public Else_structure_c_plus_plusContext else_structure_c_plus_plus() {
			return getRuleContext(Else_structure_c_plus_plusContext.class,0);
		}
		public If_else_stmt_cppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_else_stmt_cpp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterIf_else_stmt_cpp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitIf_else_stmt_cpp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitIf_else_stmt_cpp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_else_stmt_cppContext if_else_stmt_cpp() throws RecognitionException {
		If_else_stmt_cppContext _localctx = new If_else_stmt_cppContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_if_else_stmt_cpp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1254);
			if_structure_c_plus_plus();
			setState(1258);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1255);
					else_if_structure_c_plus_plus();
					}
					} 
				}
				setState(1260);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			}
			setState(1262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				{
				setState(1261);
				else_structure_c_plus_plus();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_expr_binary_operator_c_plusContext extends ParserRuleContext {
		public TerminalNode T_EQUAL2() { return getToken(HplsqlParser.T_EQUAL2, 0); }
		public TerminalNode T_NOTEQUAL() { return getToken(HplsqlParser.T_NOTEQUAL, 0); }
		public TerminalNode T_NOTEQUAL2() { return getToken(HplsqlParser.T_NOTEQUAL2, 0); }
		public TerminalNode T_LESS() { return getToken(HplsqlParser.T_LESS, 0); }
		public TerminalNode T_LESSEQUAL() { return getToken(HplsqlParser.T_LESSEQUAL, 0); }
		public TerminalNode T_GREATER() { return getToken(HplsqlParser.T_GREATER, 0); }
		public TerminalNode T_GREATEREQUAL() { return getToken(HplsqlParser.T_GREATEREQUAL, 0); }
		public Bool_expr_binary_operator_c_plusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_binary_operator_c_plus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterBool_expr_binary_operator_c_plus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitBool_expr_binary_operator_c_plus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitBool_expr_binary_operator_c_plus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_binary_operator_c_plusContext bool_expr_binary_operator_c_plus() throws RecognitionException {
		Bool_expr_binary_operator_c_plusContext _localctx = new Bool_expr_binary_operator_c_plusContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_bool_expr_binary_operator_c_plus);
		try {
			setState(1272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALLOCATE:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DELIMITER:
			case T_DESC:
			case T_DESCRIBE:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXEC:
			case T_EXECUTE:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FETCH:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FROM:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_GROUP:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HDFS:
			case T_HIVE:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INNER:
			case T_INOUT:
			case T_INSERT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INTO:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LEFT:
			case T_LIKE:
			case T_LIMIT:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NULL:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_ORDER:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITH:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_MAX_PART_STRING:
			case T_MIN_PART_STRING:
			case T_MAX_PART_INT:
			case T_MIN_PART_INT:
			case T_MAX_PART_DATE:
			case T_MIN_PART_DATE:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
			case T_ADD:
			case T_OPEN_P:
			case T_SUB:
			case L_NUMBER:
			case L_ID:
			case L_S_STRING:
			case L_D_STRING:
			case L_INT:
			case L_DEC:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T_EQUAL2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1265);
				match(T_EQUAL2);
				}
				break;
			case T_NOTEQUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1266);
				match(T_NOTEQUAL);
				}
				break;
			case T_NOTEQUAL2:
				enterOuterAlt(_localctx, 4);
				{
				setState(1267);
				match(T_NOTEQUAL2);
				}
				break;
			case T_LESS:
				enterOuterAlt(_localctx, 5);
				{
				setState(1268);
				match(T_LESS);
				}
				break;
			case T_LESSEQUAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(1269);
				match(T_LESSEQUAL);
				}
				break;
			case T_GREATER:
				enterOuterAlt(_localctx, 7);
				{
				setState(1270);
				match(T_GREATER);
				}
				break;
			case T_GREATEREQUAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(1271);
				match(T_GREATEREQUAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_expr_c_plus_plusContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public List<Bool_expr_c_plus_plusContext> bool_expr_c_plus_plus() {
			return getRuleContexts(Bool_expr_c_plus_plusContext.class);
		}
		public Bool_expr_c_plus_plusContext bool_expr_c_plus_plus(int i) {
			return getRuleContext(Bool_expr_c_plus_plusContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public TerminalNode T_NEGATIV() { return getToken(HplsqlParser.T_NEGATIV, 0); }
		public Bool_expr_atom_c_plusContext bool_expr_atom_c_plus() {
			return getRuleContext(Bool_expr_atom_c_plusContext.class,0);
		}
		public Bool_expr_logical_operator_c_plusContext bool_expr_logical_operator_c_plus() {
			return getRuleContext(Bool_expr_logical_operator_c_plusContext.class,0);
		}
		public Bool_expr_c_plus_plusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_c_plus_plus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterBool_expr_c_plus_plus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitBool_expr_c_plus_plus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitBool_expr_c_plus_plus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_c_plus_plusContext bool_expr_c_plus_plus() throws RecognitionException {
		return bool_expr_c_plus_plus(0);
	}

	private Bool_expr_c_plus_plusContext bool_expr_c_plus_plus(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bool_expr_c_plus_plusContext _localctx = new Bool_expr_c_plus_plusContext(_ctx, _parentState);
		Bool_expr_c_plus_plusContext _prevctx = _localctx;
		int _startState = 160;
		enterRecursionRule(_localctx, 160, RULE_bool_expr_c_plus_plus, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				{
				setState(1276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NEGATIV) {
					{
					setState(1275);
					match(T_NEGATIV);
					}
				}

				setState(1278);
				match(T_OPEN_P);
				setState(1279);
				bool_expr_c_plus_plus(0);
				setState(1280);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(1282);
				bool_expr_atom_c_plus();
				}
				break;
			case 3:
				{
				setState(1284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NEGATIV) {
					{
					setState(1283);
					match(T_NEGATIV);
					}
				}

				setState(1286);
				bool_expr_atom_c_plus();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1295);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bool_expr_c_plus_plusContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bool_expr_c_plus_plus);
					setState(1289);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(1290);
					bool_expr_logical_operator_c_plus();
					setState(1291);
					bool_expr_c_plus_plus(4);
					}
					} 
				}
				setState(1297);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Bool_expr_logical_operator_c_plusContext extends ParserRuleContext {
		public TerminalNode T_AND_cpp() { return getToken(HplsqlParser.T_AND_cpp, 0); }
		public TerminalNode T_PIPE() { return getToken(HplsqlParser.T_PIPE, 0); }
		public Bool_expr_logical_operator_c_plusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_logical_operator_c_plus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterBool_expr_logical_operator_c_plus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitBool_expr_logical_operator_c_plus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitBool_expr_logical_operator_c_plus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_logical_operator_c_plusContext bool_expr_logical_operator_c_plus() throws RecognitionException {
		Bool_expr_logical_operator_c_plusContext _localctx = new Bool_expr_logical_operator_c_plusContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_bool_expr_logical_operator_c_plus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1298);
			_la = _input.LA(1);
			if ( !(_la==T_PIPE || _la==T_AND_cpp) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_expr_binary_c_plusContext extends ParserRuleContext {
		public List<Expr_cppContext> expr_cpp() {
			return getRuleContexts(Expr_cppContext.class);
		}
		public Expr_cppContext expr_cpp(int i) {
			return getRuleContext(Expr_cppContext.class,i);
		}
		public Bool_expr_binary_operator_c_plusContext bool_expr_binary_operator_c_plus() {
			return getRuleContext(Bool_expr_binary_operator_c_plusContext.class,0);
		}
		public Bool_expr_binary_c_plusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_binary_c_plus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterBool_expr_binary_c_plus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitBool_expr_binary_c_plus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitBool_expr_binary_c_plus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_binary_c_plusContext bool_expr_binary_c_plus() throws RecognitionException {
		Bool_expr_binary_c_plusContext _localctx = new Bool_expr_binary_c_plusContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_bool_expr_binary_c_plus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1300);
			expr_cpp(0);
			setState(1301);
			bool_expr_binary_operator_c_plus();
			setState(1302);
			expr_cpp(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_expr_atom_c_plusContext extends ParserRuleContext {
		public Bool_expr_binary_c_plusContext bool_expr_binary_c_plus() {
			return getRuleContext(Bool_expr_binary_c_plusContext.class,0);
		}
		public Expr_cppContext expr_cpp() {
			return getRuleContext(Expr_cppContext.class,0);
		}
		public Bool_expr_atom_c_plusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_atom_c_plus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterBool_expr_atom_c_plus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitBool_expr_atom_c_plus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitBool_expr_atom_c_plus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_atom_c_plusContext bool_expr_atom_c_plus() throws RecognitionException {
		Bool_expr_atom_c_plusContext _localctx = new Bool_expr_atom_c_plusContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_bool_expr_atom_c_plus);
		try {
			setState(1306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1304);
				bool_expr_binary_c_plus();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1305);
				expr_cpp(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_cppContext extends ParserRuleContext {
		public Expr_cppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_cpp; }
	 
		public Expr_cppContext() { }
		public void copyFrom(Expr_cppContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CursorContext extends Expr_cppContext {
		public Expr_cursor_attributeContext expr_cursor_attribute() {
			return getRuleContext(Expr_cursor_attributeContext.class,0);
		}
		public CursorContext(Expr_cppContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCursor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCursor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCursor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AggContext extends Expr_cppContext {
		public Expr_agg_window_funcContext expr_agg_window_func() {
			return getRuleContext(Expr_agg_window_funcContext.class,0);
		}
		public AggContext(Expr_cppContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterAgg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitAgg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitAgg(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddContext extends Expr_cppContext {
		public List<Expr_cppContext> expr_cpp() {
			return getRuleContexts(Expr_cppContext.class);
		}
		public Expr_cppContext expr_cpp(int i) {
			return getRuleContext(Expr_cppContext.class,i);
		}
		public TerminalNode T_ADD() { return getToken(HplsqlParser.T_ADD, 0); }
		public AddContext(Expr_cppContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubContext extends Expr_cppContext {
		public List<Expr_cppContext> expr_cpp() {
			return getRuleContexts(Expr_cppContext.class);
		}
		public Expr_cppContext expr_cpp(int i) {
			return getRuleContext(Expr_cppContext.class,i);
		}
		public TerminalNode T_SUB() { return getToken(HplsqlParser.T_SUB, 0); }
		public SubContext(Expr_cppContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultContext extends Expr_cppContext {
		public List<Expr_cppContext> expr_cpp() {
			return getRuleContexts(Expr_cppContext.class);
		}
		public Expr_cppContext expr_cpp(int i) {
			return getRuleContext(Expr_cppContext.class,i);
		}
		public TerminalNode T_MUL() { return getToken(HplsqlParser.T_MUL, 0); }
		public MultContext(Expr_cppContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitMult(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PriorityContext extends Expr_cppContext {
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public Expr_cppContext expr_cpp() {
			return getRuleContext(Expr_cppContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public PriorityContext(Expr_cppContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterPriority(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitPriority(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitPriority(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SpecContext extends Expr_cppContext {
		public Expr_spec_funcContext expr_spec_func() {
			return getRuleContext(Expr_spec_funcContext.class,0);
		}
		public SpecContext(Expr_cppContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSpec(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivContext extends Expr_cppContext {
		public List<Expr_cppContext> expr_cpp() {
			return getRuleContexts(Expr_cppContext.class);
		}
		public Expr_cppContext expr_cpp(int i) {
			return getRuleContext(Expr_cppContext.class,i);
		}
		public TerminalNode T_DIV() { return getToken(HplsqlParser.T_DIV, 0); }
		public DivContext(Expr_cppContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncContext extends Expr_cppContext {
		public Expr_funcContext expr_func() {
			return getRuleContext(Expr_funcContext.class,0);
		}
		public FuncContext(Expr_cppContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expr_numberContext extends Expr_cppContext {
		public List<TerminalNode> L_NUMBER() { return getTokens(HplsqlParser.L_NUMBER); }
		public TerminalNode L_NUMBER(int i) {
			return getToken(HplsqlParser.L_NUMBER, i);
		}
		public Expr_numberContext(Expr_cppContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_number(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnContext extends Expr_cppContext {
		public Expr_cppContext expr_cpp() {
			return getRuleContext(Expr_cppContext.class,0);
		}
		public Interval_itemContext interval_item() {
			return getRuleContext(Interval_itemContext.class,0);
		}
		public UnContext(Expr_cppContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterUn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitUn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitUn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomContext extends Expr_cppContext {
		public Expr_atomContext expr_atom() {
			return getRuleContext(Expr_atomContext.class,0);
		}
		public AtomContext(Expr_cppContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CaseContext extends Expr_cppContext {
		public Expr_caseContext expr_case() {
			return getRuleContext(Expr_caseContext.class,0);
		}
		public CaseContext(Expr_cppContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_cppContext expr_cpp() throws RecognitionException {
		return expr_cpp(0);
	}

	private Expr_cppContext expr_cpp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_cppContext _localctx = new Expr_cppContext(_ctx, _parentState);
		Expr_cppContext _prevctx = _localctx;
		int _startState = 168;
		enterRecursionRule(_localctx, 168, RULE_expr_cpp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				{
				_localctx = new PriorityContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1309);
				match(T_OPEN_P);
				setState(1310);
				expr_cpp(0);
				setState(1311);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				_localctx = new CaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1313);
				expr_case();
				}
				break;
			case 3:
				{
				_localctx = new CursorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1314);
				expr_cursor_attribute();
				}
				break;
			case 4:
				{
				_localctx = new AggContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1315);
				expr_agg_window_func();
				}
				break;
			case 5:
				{
				_localctx = new SpecContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1316);
				expr_spec_func();
				}
				break;
			case 6:
				{
				_localctx = new FuncContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1317);
				expr_func();
				}
				break;
			case 7:
				{
				_localctx = new AtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1318);
				expr_atom();
				}
				break;
			case 8:
				{
				_localctx = new Expr_numberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1320); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1319);
						match(L_NUMBER);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1322); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1342);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1340);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
					case 1:
						{
						_localctx = new MultContext(new Expr_cppContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_cpp);
						setState(1326);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1327);
						match(T_MUL);
						setState(1328);
						expr_cpp(12);
						}
						break;
					case 2:
						{
						_localctx = new DivContext(new Expr_cppContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_cpp);
						setState(1329);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1330);
						match(T_DIV);
						setState(1331);
						expr_cpp(11);
						}
						break;
					case 3:
						{
						_localctx = new AddContext(new Expr_cppContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_cpp);
						setState(1332);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1333);
						match(T_ADD);
						setState(1334);
						expr_cpp(10);
						}
						break;
					case 4:
						{
						_localctx = new SubContext(new Expr_cppContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_cpp);
						setState(1335);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1336);
						match(T_SUB);
						setState(1337);
						expr_cpp(9);
						}
						break;
					case 5:
						{
						_localctx = new UnContext(new Expr_cppContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_cpp);
						setState(1338);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1339);
						interval_item();
						}
						break;
					}
					} 
				}
				setState(1344);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Create_package_body_stmtContext extends ParserRuleContext {
		public TerminalNode T_CREATE() { return getToken(HplsqlParser.T_CREATE, 0); }
		public TerminalNode T_PACKAGE() { return getToken(HplsqlParser.T_PACKAGE, 0); }
		public TerminalNode T_BODY() { return getToken(HplsqlParser.T_BODY, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public Package_bodyContext package_body() {
			return getRuleContext(Package_bodyContext.class,0);
		}
		public TerminalNode T_END() { return getToken(HplsqlParser.T_END, 0); }
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public TerminalNode T_IS() { return getToken(HplsqlParser.T_IS, 0); }
		public TerminalNode T_SEMICOLON() { return getToken(HplsqlParser.T_SEMICOLON, 0); }
		public Create_package_body_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_package_body_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_package_body_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_package_body_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_package_body_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_package_body_stmtContext create_package_body_stmt() throws RecognitionException {
		Create_package_body_stmtContext _localctx = new Create_package_body_stmtContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_create_package_body_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1345);
			match(T_CREATE);
			setState(1346);
			match(T_PACKAGE);
			setState(1347);
			match(T_BODY);
			setState(1348);
			ident();
			setState(1349);
			_la = _input.LA(1);
			if ( !(_la==T_AS || _la==T_IS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1350);
			package_body();
			setState(1351);
			match(T_END);
			setState(1355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				{
				setState(1352);
				ident();
				setState(1353);
				match(T_SEMICOLON);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Package_bodyContext extends ParserRuleContext {
		public List<Package_body_itemContext> package_body_item() {
			return getRuleContexts(Package_body_itemContext.class);
		}
		public Package_body_itemContext package_body_item(int i) {
			return getRuleContext(Package_body_itemContext.class,i);
		}
		public List<TerminalNode> T_SEMICOLON() { return getTokens(HplsqlParser.T_SEMICOLON); }
		public TerminalNode T_SEMICOLON(int i) {
			return getToken(HplsqlParser.T_SEMICOLON, i);
		}
		public Package_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterPackage_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitPackage_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitPackage_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_bodyContext package_body() throws RecognitionException {
		Package_bodyContext _localctx = new Package_bodyContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_package_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1357);
			package_body_item();
			setState(1358);
			match(T_SEMICOLON);
			setState(1364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_ADD2) | (1L << T_ALL) | (1L << T_ALLOCATE) | (1L << T_ALTER) | (1L << T_AND) | (1L << T_ANSI_NULLS) | (1L << T_ANSI_PADDING) | (1L << T_AS) | (1L << T_ASC) | (1L << T_ASSOCIATE) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BATCHSIZE) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CALLER) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLIENT) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECT) | (1L << T_COLLECTION) | (1L << T_COLUMN) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMMIT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COPY) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CREATION) | (1L << T_CREATOR) | (1L << T_CS) | (1L << T_CURRENT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_CURRENT_SCHEMA - 64)) | (1L << (T_CURSOR - 64)) | (1L << (T_DATABASE - 64)) | (1L << (T_DATA - 64)) | (1L << (T_DATE - 64)) | (1L << (T_DATETIME - 64)) | (1L << (T_DAY - 64)) | (1L << (T_DAYS - 64)) | (1L << (T_DEC - 64)) | (1L << (T_DECIMAL - 64)) | (1L << (T_DECLARE - 64)) | (1L << (T_DEFAULT - 64)) | (1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DELIMITER - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DESCRIBE - 64)) | (1L << (T_DIAGNOSTICS - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DIRECTORY - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DO - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DROP - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXEC - 64)) | (1L << (T_EXECUTE - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FETCH - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FILE - 64)) | (1L << (T_FILES - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GET - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)) | (1L << (T_GRANT - 64)) | (1L << (T_GROUP - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_HANDLER - 128)) | (1L << (T_HASH - 128)) | (1L << (T_HAVING - 128)) | (1L << (T_HDFS - 128)) | (1L << (T_HIVE - 128)) | (1L << (T_HOST - 128)) | (1L << (T_IDENTITY - 128)) | (1L << (T_IF - 128)) | (1L << (T_IGNORE - 128)) | (1L << (T_IMMEDIATE - 128)) | (1L << (T_IN - 128)) | (1L << (T_INCLUDE - 128)) | (1L << (T_INDEX - 128)) | (1L << (T_INITRANS - 128)) | (1L << (T_INNER - 128)) | (1L << (T_INOUT - 128)) | (1L << (T_INSERT - 128)) | (1L << (T_INT2 - 128)) | (1L << (T_INT4 - 128)) | (1L << (T_INT8 - 128)) | (1L << (T_INTEGER - 128)) | (1L << (T_INTERSECT - 128)) | (1L << (T_INTERVAL - 128)) | (1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCATOR - 128)) | (1L << (T_LOCATORS - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MATCHED - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MERGE - 128)) | (1L << (T_MESSAGE_TEXT - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NEW - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)) | (1L << (T_NOCOUNT - 128)) | (1L << (T_NOCOMPRESS - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_NOLOGGING - 192)) | (1L << (T_NONE - 192)) | (1L << (T_NOT - 192)) | (1L << (T_NOTFOUND - 192)) | (1L << (T_NUMERIC - 192)) | (1L << (T_NUMBER - 192)) | (1L << (T_OBJECT - 192)) | (1L << (T_OFF - 192)) | (1L << (T_ON - 192)) | (1L << (T_ONLY - 192)) | (1L << (T_OPEN - 192)) | (1L << (T_OR - 192)) | (1L << (T_ORDER - 192)) | (1L << (T_OUT - 192)) | (1L << (T_OUTER - 192)) | (1L << (T_OVER - 192)) | (1L << (T_OVERWRITE - 192)) | (1L << (T_OWNER - 192)) | (1L << (T_PACKAGE - 192)) | (1L << (T_PARTITION - 192)) | (1L << (T_PCTFREE - 192)) | (1L << (T_PCTUSED - 192)) | (1L << (T_PRECISION - 192)) | (1L << (T_PRESERVE - 192)) | (1L << (T_PRIMARY - 192)) | (1L << (T_PRINT - 192)) | (1L << (T_PROC - 192)) | (1L << (T_PROCEDURE - 192)) | (1L << (T_QUALIFY - 192)) | (1L << (T_QUERY_BAND - 192)) | (1L << (T_QUIT - 192)) | (1L << (T_QUOTED_IDENTIFIER - 192)) | (1L << (T_RAISE - 192)) | (1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESIGNAL - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROLE - 192)) | (1L << (T_ROLLBACK - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)) | (1L << (T_ROW_COUNT - 192)) | (1L << (T_RR - 192)) | (1L << (T_RS - 192)) | (1L << (T_PWD - 192)) | (1L << (T_TRIM - 192)) | (1L << (T_SCHEMA - 192)) | (1L << (T_SECOND - 192)) | (1L << (T_SECONDS - 192)) | (1L << (T_SECURITY - 192)) | (1L << (T_SEGMENT - 192)) | (1L << (T_SEL - 192)) | (1L << (T_SELECT - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_SET - 256)) | (1L << (T_SESSION - 256)) | (1L << (T_SESSIONS - 256)) | (1L << (T_SETS - 256)) | (1L << (T_SHARE - 256)) | (1L << (T_SIGNAL - 256)) | (1L << (T_SIMPLE_DOUBLE - 256)) | (1L << (T_SIMPLE_FLOAT - 256)) | (1L << (T_SMALLDATETIME - 256)) | (1L << (T_SMALLINT - 256)) | (1L << (T_SQL - 256)) | (1L << (T_SQLEXCEPTION - 256)) | (1L << (T_SQLINSERT - 256)) | (1L << (T_SQLSTATE - 256)) | (1L << (T_SQLWARNING - 256)) | (1L << (T_STATS - 256)) | (1L << (T_STATISTICS - 256)) | (1L << (T_STEP - 256)) | (1L << (T_STORAGE - 256)) | (1L << (T_STORED - 256)) | (1L << (T_SUBDIR - 256)) | (1L << (T_SUBSTRING - 256)) | (1L << (T_SUM - 256)) | (1L << (T_SUMMARY - 256)) | (1L << (T_SYS_REFCURSOR - 256)) | (1L << (T_TABLE - 256)) | (1L << (T_TABLESPACE - 256)) | (1L << (T_TEMPORARY - 256)) | (1L << (T_TERMINATED - 256)) | (1L << (T_TEXTIMAGE_ON - 256)) | (1L << (T_THEN - 256)) | (1L << (T_TIMESTAMP - 256)) | (1L << (T_TITLE - 256)) | (1L << (T_TO - 256)) | (1L << (T_TOP - 256)) | (1L << (T_TRANSACTION - 256)) | (1L << (T_TRUE - 256)) | (1L << (T_TRUNCATE - 256)) | (1L << (T_UNIQUE - 256)) | (1L << (T_UPDATE - 256)) | (1L << (T_UR - 256)) | (1L << (T_USE - 256)) | (1L << (T_USING - 256)) | (1L << (T_VALUE - 256)) | (1L << (T_VALUES - 256)) | (1L << (T_VAR - 256)) | (1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_VARYING - 256)) | (1L << (T_VOLATILE - 256)) | (1L << (T_WHILE - 256)) | (1L << (T_WITH - 256)) | (1L << (T_WITHOUT - 256)) | (1L << (T_WORK - 256)) | (1L << (T_XACT_ABORT - 256)) | (1L << (T_XML - 256)) | (1L << (T_YES - 256)))) != 0) || ((((_la - 321)) & ~0x3f) == 0 && ((1L << (_la - 321)) & ((1L << (T_ACTIVITY_COUNT - 321)) | (1L << (T_CUME_DIST - 321)) | (1L << (T_CURRENT_DATE - 321)) | (1L << (T_CURRENT_TIMESTAMP - 321)) | (1L << (T_CURRENT_USER - 321)) | (1L << (T_DENSE_RANK - 321)) | (1L << (T_FIRST_VALUE - 321)) | (1L << (T_LAG - 321)) | (1L << (T_LAST_VALUE - 321)) | (1L << (T_LEAD - 321)) | (1L << (T_PART_COUNT - 321)) | (1L << (T_PART_LOC - 321)) | (1L << (T_RANK - 321)) | (1L << (T_ROW_NUMBER - 321)) | (1L << (T_STDEV - 321)) | (1L << (T_SYSDATE - 321)) | (1L << (T_VARIANCE - 321)) | (1L << (T_USER - 321)) | (1L << (L_ID - 321)) | (1L << (L_S_STRING - 321)) | (1L << (L_D_STRING - 321)))) != 0)) {
				{
				{
				setState(1359);
				package_body_item();
				setState(1360);
				match(T_SEMICOLON);
				}
				}
				setState(1366);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Package_body_itemContext extends ParserRuleContext {
		public Declare_stmt_itemContext declare_stmt_item() {
			return getRuleContext(Declare_stmt_itemContext.class,0);
		}
		public Create_function_stmtContext create_function_stmt() {
			return getRuleContext(Create_function_stmtContext.class,0);
		}
		public Create_procedure_stmtContext create_procedure_stmt() {
			return getRuleContext(Create_procedure_stmtContext.class,0);
		}
		public Package_body_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_body_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterPackage_body_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitPackage_body_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitPackage_body_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_body_itemContext package_body_item() throws RecognitionException {
		Package_body_itemContext _localctx = new Package_body_itemContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_package_body_item);
		try {
			setState(1370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1367);
				declare_stmt_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1368);
				create_function_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1369);
				create_procedure_stmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_procedure_stmtContext extends ParserRuleContext {
		public TerminalNode T_CREATE() { return getToken(HplsqlParser.T_CREATE, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public Proc_blockContext proc_block() {
			return getRuleContext(Proc_blockContext.class,0);
		}
		public TerminalNode T_PROCEDURE() { return getToken(HplsqlParser.T_PROCEDURE, 0); }
		public TerminalNode T_PROC() { return getToken(HplsqlParser.T_PROC, 0); }
		public Create_routine_paramsContext create_routine_params() {
			return getRuleContext(Create_routine_paramsContext.class,0);
		}
		public Create_routine_optionsContext create_routine_options() {
			return getRuleContext(Create_routine_optionsContext.class,0);
		}
		public Declare_block_inplaceContext declare_block_inplace() {
			return getRuleContext(Declare_block_inplaceContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode T_SEMICOLON() { return getToken(HplsqlParser.T_SEMICOLON, 0); }
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public TerminalNode T_IS() { return getToken(HplsqlParser.T_IS, 0); }
		public Create_procedure_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_procedure_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_procedure_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_procedure_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_procedure_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_procedure_stmtContext create_procedure_stmt() throws RecognitionException {
		Create_procedure_stmtContext _localctx = new Create_procedure_stmtContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_create_procedure_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1372);
			match(T_CREATE);
			setState(1373);
			_la = _input.LA(1);
			if ( !(_la==T_PROC || _la==T_PROCEDURE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1374);
			ident();
			setState(1376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				{
				setState(1375);
				create_routine_params();
				}
				break;
			}
			setState(1379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				{
				setState(1378);
				create_routine_options();
				}
				break;
			}
			setState(1382);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				{
				setState(1381);
				_la = _input.LA(1);
				if ( !(_la==T_AS || _la==T_IS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				{
				setState(1384);
				declare_block_inplace();
				}
				break;
			}
			setState(1388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_LESS || _la==L_LABEL) {
				{
				setState(1387);
				label();
				}
			}

			setState(1390);
			proc_block();
			setState(1394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				{
				setState(1391);
				ident();
				setState(1392);
				match(T_SEMICOLON);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_routine_paramsContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<Create_routine_param_itemContext> create_routine_param_item() {
			return getRuleContexts(Create_routine_param_itemContext.class);
		}
		public Create_routine_param_itemContext create_routine_param_item(int i) {
			return getRuleContext(Create_routine_param_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Create_routine_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_routine_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_routine_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_routine_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_routine_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_routine_paramsContext create_routine_params() throws RecognitionException {
		Create_routine_paramsContext _localctx = new Create_routine_paramsContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_create_routine_params);
		int _la;
		try {
			setState(1418);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1396);
				match(T_OPEN_P);
				setState(1397);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1398);
				match(T_OPEN_P);
				setState(1399);
				create_routine_param_item();
				setState(1404);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1400);
					match(T_COMMA);
					setState(1401);
					create_routine_param_item();
					}
					}
					setState(1406);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1407);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1409);
				if (!(!_input.LT(1).getText().equalsIgnoreCase("IS") &&
				        !_input.LT(1).getText().equalsIgnoreCase("AS") &&
				        !(_input.LT(1).getText().equalsIgnoreCase("DYNAMIC") && _input.LT(2).getText().equalsIgnoreCase("RESULT"))
				        )) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"IS\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"AS\") &&\r\n        !(_input.LT(1).getText().equalsIgnoreCase(\"DYNAMIC\") && _input.LT(2).getText().equalsIgnoreCase(\"RESULT\"))\r\n        ");
				setState(1410);
				create_routine_param_item();
				setState(1415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1411);
					match(T_COMMA);
					setState(1412);
					create_routine_param_item();
					}
					}
					setState(1417);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_routine_param_itemContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public TerminalNode T_IN() { return getToken(HplsqlParser.T_IN, 0); }
		public TerminalNode T_OUT() { return getToken(HplsqlParser.T_OUT, 0); }
		public TerminalNode T_INOUT() { return getToken(HplsqlParser.T_INOUT, 0); }
		public Dtype_lenContext dtype_len() {
			return getRuleContext(Dtype_lenContext.class,0);
		}
		public List<Dtype_attrContext> dtype_attr() {
			return getRuleContexts(Dtype_attrContext.class);
		}
		public Dtype_attrContext dtype_attr(int i) {
			return getRuleContext(Dtype_attrContext.class,i);
		}
		public Dtype_defaultContext dtype_default() {
			return getRuleContext(Dtype_defaultContext.class,0);
		}
		public Create_routine_param_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_routine_param_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_routine_param_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_routine_param_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_routine_param_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_routine_param_itemContext create_routine_param_item() throws RecognitionException {
		Create_routine_param_itemContext _localctx = new Create_routine_param_itemContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_create_routine_param_item);
		int _la;
		try {
			int _alt;
			setState(1462);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1425);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
				case 1:
					{
					setState(1420);
					match(T_IN);
					}
					break;
				case 2:
					{
					setState(1421);
					match(T_OUT);
					}
					break;
				case 3:
					{
					setState(1422);
					match(T_INOUT);
					}
					break;
				case 4:
					{
					setState(1423);
					match(T_IN);
					setState(1424);
					match(T_OUT);
					}
					break;
				}
				setState(1427);
				ident();
				setState(1428);
				dtype();
				setState(1430);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(1429);
					dtype_len();
					}
				}

				setState(1435);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1432);
						dtype_attr();
						}
						} 
					}
					setState(1437);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
				}
				setState(1439);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
				case 1:
					{
					setState(1438);
					dtype_default();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1441);
				ident();
				setState(1447);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
				case 1:
					{
					setState(1442);
					match(T_IN);
					}
					break;
				case 2:
					{
					setState(1443);
					match(T_OUT);
					}
					break;
				case 3:
					{
					setState(1444);
					match(T_INOUT);
					}
					break;
				case 4:
					{
					setState(1445);
					match(T_IN);
					setState(1446);
					match(T_OUT);
					}
					break;
				}
				setState(1449);
				dtype();
				setState(1451);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(1450);
					dtype_len();
					}
				}

				setState(1456);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1453);
						dtype_attr();
						}
						} 
					}
					setState(1458);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
				}
				setState(1460);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
				case 1:
					{
					setState(1459);
					dtype_default();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_routine_optionsContext extends ParserRuleContext {
		public List<Create_routine_optionContext> create_routine_option() {
			return getRuleContexts(Create_routine_optionContext.class);
		}
		public Create_routine_optionContext create_routine_option(int i) {
			return getRuleContext(Create_routine_optionContext.class,i);
		}
		public Create_routine_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_routine_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_routine_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_routine_options(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_routine_options(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_routine_optionsContext create_routine_options() throws RecognitionException {
		Create_routine_optionsContext _localctx = new Create_routine_optionsContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_create_routine_options);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1465); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1464);
					create_routine_option();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1467); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_routine_optionContext extends ParserRuleContext {
		public TerminalNode T_LANGUAGE() { return getToken(HplsqlParser.T_LANGUAGE, 0); }
		public TerminalNode T_SQL() { return getToken(HplsqlParser.T_SQL, 0); }
		public TerminalNode T_SECURITY() { return getToken(HplsqlParser.T_SECURITY, 0); }
		public TerminalNode T_CREATOR() { return getToken(HplsqlParser.T_CREATOR, 0); }
		public TerminalNode T_DEFINER() { return getToken(HplsqlParser.T_DEFINER, 0); }
		public TerminalNode T_INVOKER() { return getToken(HplsqlParser.T_INVOKER, 0); }
		public TerminalNode T_OWNER() { return getToken(HplsqlParser.T_OWNER, 0); }
		public TerminalNode T_RESULT() { return getToken(HplsqlParser.T_RESULT, 0); }
		public TerminalNode T_SETS() { return getToken(HplsqlParser.T_SETS, 0); }
		public TerminalNode L_INT() { return getToken(HplsqlParser.L_INT, 0); }
		public TerminalNode T_DYNAMIC() { return getToken(HplsqlParser.T_DYNAMIC, 0); }
		public Create_routine_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_routine_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_routine_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_routine_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_routine_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_routine_optionContext create_routine_option() throws RecognitionException {
		Create_routine_optionContext _localctx = new Create_routine_optionContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_create_routine_option);
		int _la;
		try {
			setState(1480);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LANGUAGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1469);
				match(T_LANGUAGE);
				setState(1470);
				match(T_SQL);
				}
				break;
			case T_SQL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1471);
				match(T_SQL);
				setState(1472);
				match(T_SECURITY);
				setState(1473);
				_la = _input.LA(1);
				if ( !(_la==T_CREATOR || _la==T_DEFINER || _la==T_INVOKER || _la==T_OWNER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T_DYNAMIC:
			case T_RESULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1475);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_DYNAMIC) {
					{
					setState(1474);
					match(T_DYNAMIC);
					}
				}

				setState(1477);
				match(T_RESULT);
				setState(1478);
				match(T_SETS);
				setState(1479);
				match(L_INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_stmtContext extends ParserRuleContext {
		public If_plsql_stmtContext if_plsql_stmt() {
			return getRuleContext(If_plsql_stmtContext.class,0);
		}
		public If_tsql_stmtContext if_tsql_stmt() {
			return getRuleContext(If_tsql_stmtContext.class,0);
		}
		public If_bteq_stmtContext if_bteq_stmt() {
			return getRuleContext(If_bteq_stmtContext.class,0);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitIf_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_if_stmt);
		try {
			setState(1485);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1482);
				if_plsql_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1483);
				if_tsql_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1484);
				if_bteq_stmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_plsql_stmtContext extends ParserRuleContext {
		public List<TerminalNode> T_IF() { return getTokens(HplsqlParser.T_IF); }
		public TerminalNode T_IF(int i) {
			return getToken(HplsqlParser.T_IF, i);
		}
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode T_THEN() { return getToken(HplsqlParser.T_THEN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_END() { return getToken(HplsqlParser.T_END, 0); }
		public List<Elseif_blockContext> elseif_block() {
			return getRuleContexts(Elseif_blockContext.class);
		}
		public Elseif_blockContext elseif_block(int i) {
			return getRuleContext(Elseif_blockContext.class,i);
		}
		public Else_blockContext else_block() {
			return getRuleContext(Else_blockContext.class,0);
		}
		public If_plsql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_plsql_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterIf_plsql_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitIf_plsql_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitIf_plsql_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_plsql_stmtContext if_plsql_stmt() throws RecognitionException {
		If_plsql_stmtContext _localctx = new If_plsql_stmtContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_if_plsql_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1487);
			match(T_IF);
			setState(1488);
			bool_expr(0);
			setState(1489);
			match(T_THEN);
			setState(1490);
			block();
			setState(1494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_ELSEIF || _la==T_ELSIF) {
				{
				{
				setState(1491);
				elseif_block();
				}
				}
				setState(1496);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(1497);
				else_block();
				}
			}

			setState(1500);
			match(T_END);
			setState(1501);
			match(T_IF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_tsql_stmtContext extends ParserRuleContext {
		public TerminalNode T_IF() { return getToken(HplsqlParser.T_IF, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public List<Single_block_stmtContext> single_block_stmt() {
			return getRuleContexts(Single_block_stmtContext.class);
		}
		public Single_block_stmtContext single_block_stmt(int i) {
			return getRuleContext(Single_block_stmtContext.class,i);
		}
		public TerminalNode T_ELSE() { return getToken(HplsqlParser.T_ELSE, 0); }
		public If_tsql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_tsql_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterIf_tsql_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitIf_tsql_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitIf_tsql_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_tsql_stmtContext if_tsql_stmt() throws RecognitionException {
		If_tsql_stmtContext _localctx = new If_tsql_stmtContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_if_tsql_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1503);
			match(T_IF);
			setState(1504);
			bool_expr(0);
			setState(1505);
			single_block_stmt();
			setState(1508);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				{
				setState(1506);
				match(T_ELSE);
				setState(1507);
				single_block_stmt();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_bteq_stmtContext extends ParserRuleContext {
		public TerminalNode T_IF() { return getToken(HplsqlParser.T_IF, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode T_THEN() { return getToken(HplsqlParser.T_THEN, 0); }
		public Single_block_stmtContext single_block_stmt() {
			return getRuleContext(Single_block_stmtContext.class,0);
		}
		public If_bteq_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_bteq_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterIf_bteq_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitIf_bteq_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitIf_bteq_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_bteq_stmtContext if_bteq_stmt() throws RecognitionException {
		If_bteq_stmtContext _localctx = new If_bteq_stmtContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_if_bteq_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1510);
			match(T__2);
			setState(1511);
			match(T_IF);
			setState(1512);
			bool_expr(0);
			setState(1513);
			match(T_THEN);
			setState(1514);
			single_block_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Elseif_blockContext extends ParserRuleContext {
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode T_THEN() { return getToken(HplsqlParser.T_THEN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_ELSIF() { return getToken(HplsqlParser.T_ELSIF, 0); }
		public TerminalNode T_ELSEIF() { return getToken(HplsqlParser.T_ELSEIF, 0); }
		public Elseif_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseif_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterElseif_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitElseif_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitElseif_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elseif_blockContext elseif_block() throws RecognitionException {
		Elseif_blockContext _localctx = new Elseif_blockContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_elseif_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1516);
			_la = _input.LA(1);
			if ( !(_la==T_ELSEIF || _la==T_ELSIF) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1517);
			bool_expr(0);
			setState(1518);
			match(T_THEN);
			setState(1519);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_blockContext extends ParserRuleContext {
		public TerminalNode T_ELSE() { return getToken(HplsqlParser.T_ELSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Else_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterElse_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitElse_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitElse_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_blockContext else_block() throws RecognitionException {
		Else_blockContext _localctx = new Else_blockContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_else_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1521);
			match(T_ELSE);
			setState(1522);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_index_stmtContext extends ParserRuleContext {
		public TerminalNode T_CREATE() { return getToken(HplsqlParser.T_CREATE, 0); }
		public TerminalNode T_INDEX() { return getToken(HplsqlParser.T_INDEX, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_ON() { return getToken(HplsqlParser.T_ON, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public List<Create_index_colContext> create_index_col() {
			return getRuleContexts(Create_index_colContext.class);
		}
		public Create_index_colContext create_index_col(int i) {
			return getRuleContext(Create_index_colContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public TerminalNode T_UNIQUE() { return getToken(HplsqlParser.T_UNIQUE, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Create_index_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_index_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_index_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_index_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_index_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_index_stmtContext create_index_stmt() throws RecognitionException {
		Create_index_stmtContext _localctx = new Create_index_stmtContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_create_index_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1524);
			match(T_CREATE);
			setState(1526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_UNIQUE) {
				{
				setState(1525);
				match(T_UNIQUE);
				}
			}

			setState(1528);
			match(T_INDEX);
			setState(1529);
			ident();
			setState(1530);
			match(T_ON);
			setState(1531);
			table_name();
			setState(1532);
			match(T_OPEN_P);
			setState(1533);
			create_index_col();
			setState(1538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1534);
				match(T_COMMA);
				setState(1535);
				create_index_col();
				}
				}
				setState(1540);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1541);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_index_colContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_ASC() { return getToken(HplsqlParser.T_ASC, 0); }
		public TerminalNode T_DESC() { return getToken(HplsqlParser.T_DESC, 0); }
		public Create_index_colContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_index_col; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_index_col(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_index_col(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_index_col(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_index_colContext create_index_col() throws RecognitionException {
		Create_index_colContext _localctx = new Create_index_colContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_create_index_col);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1543);
			ident();
			setState(1545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ASC || _la==T_DESC) {
				{
				setState(1544);
				_la = _input.LA(1);
				if ( !(_la==T_ASC || _la==T_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_storage_clauseContext extends ParserRuleContext {
		public Index_mssql_storage_clauseContext index_mssql_storage_clause() {
			return getRuleContext(Index_mssql_storage_clauseContext.class,0);
		}
		public Index_storage_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_storage_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterIndex_storage_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitIndex_storage_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitIndex_storage_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_storage_clauseContext index_storage_clause() throws RecognitionException {
		Index_storage_clauseContext _localctx = new Index_storage_clauseContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_index_storage_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1547);
			index_mssql_storage_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_mssql_storage_clauseContext extends ParserRuleContext {
		public TerminalNode T_WITH() { return getToken(HplsqlParser.T_WITH, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> T_EQUAL() { return getTokens(HplsqlParser.T_EQUAL); }
		public TerminalNode T_EQUAL(int i) {
			return getToken(HplsqlParser.T_EQUAL, i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public List<Create_table_options_mssql_itemContext> create_table_options_mssql_item() {
			return getRuleContexts(Create_table_options_mssql_itemContext.class);
		}
		public Create_table_options_mssql_itemContext create_table_options_mssql_item(int i) {
			return getRuleContext(Create_table_options_mssql_itemContext.class,i);
		}
		public Index_mssql_storage_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_mssql_storage_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterIndex_mssql_storage_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitIndex_mssql_storage_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitIndex_mssql_storage_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_mssql_storage_clauseContext index_mssql_storage_clause() throws RecognitionException {
		Index_mssql_storage_clauseContext _localctx = new Index_mssql_storage_clauseContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_index_mssql_storage_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1549);
			match(T_WITH);
			setState(1550);
			match(T_OPEN_P);
			setState(1551);
			ident();
			setState(1552);
			match(T_EQUAL);
			setState(1553);
			ident();
			setState(1561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1554);
				match(T_COMMA);
				setState(1555);
				ident();
				setState(1556);
				match(T_EQUAL);
				setState(1557);
				ident();
				}
				}
				setState(1563);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1564);
			match(T_CLOSE_P);
			setState(1568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_ON || _la==T_TEXTIMAGE_ON) {
				{
				{
				setState(1565);
				create_table_options_mssql_item();
				}
				}
				setState(1570);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_cursor_stmtContext extends ParserRuleContext {
		public TerminalNode T_FOR() { return getToken(HplsqlParser.T_FOR, 0); }
		public TerminalNode L_ID() { return getToken(HplsqlParser.L_ID, 0); }
		public TerminalNode T_IN() { return getToken(HplsqlParser.T_IN, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<TerminalNode> T_LOOP() { return getTokens(HplsqlParser.T_LOOP); }
		public TerminalNode T_LOOP(int i) {
			return getToken(HplsqlParser.T_LOOP, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_END() { return getToken(HplsqlParser.T_END, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public For_cursor_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_cursor_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFor_cursor_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFor_cursor_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFor_cursor_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_cursor_stmtContext for_cursor_stmt() throws RecognitionException {
		For_cursor_stmtContext _localctx = new For_cursor_stmtContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_for_cursor_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1571);
			match(T_FOR);
			setState(1572);
			match(L_ID);
			setState(1573);
			match(T_IN);
			setState(1575);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				{
				setState(1574);
				match(T_OPEN_P);
				}
				break;
			}
			setState(1577);
			select_stmt();
			setState(1579);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_CLOSE_P) {
				{
				setState(1578);
				match(T_CLOSE_P);
				}
			}

			setState(1581);
			match(T_LOOP);
			setState(1582);
			block();
			setState(1583);
			match(T_END);
			setState(1584);
			match(T_LOOP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_range_stmtContext extends ParserRuleContext {
		public TerminalNode T_FOR() { return getToken(HplsqlParser.T_FOR, 0); }
		public TerminalNode L_ID() { return getToken(HplsqlParser.L_ID, 0); }
		public TerminalNode T_IN() { return getToken(HplsqlParser.T_IN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_DOT2() { return getToken(HplsqlParser.T_DOT2, 0); }
		public List<TerminalNode> T_LOOP() { return getTokens(HplsqlParser.T_LOOP); }
		public TerminalNode T_LOOP(int i) {
			return getToken(HplsqlParser.T_LOOP, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_END() { return getToken(HplsqlParser.T_END, 0); }
		public TerminalNode T_REVERSE() { return getToken(HplsqlParser.T_REVERSE, 0); }
		public TerminalNode T_BY() { return getToken(HplsqlParser.T_BY, 0); }
		public TerminalNode T_STEP() { return getToken(HplsqlParser.T_STEP, 0); }
		public For_range_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_range_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFor_range_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFor_range_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFor_range_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_range_stmtContext for_range_stmt() throws RecognitionException {
		For_range_stmtContext _localctx = new For_range_stmtContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_for_range_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1586);
			match(T_FOR);
			setState(1587);
			match(L_ID);
			setState(1588);
			match(T_IN);
			setState(1590);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				{
				setState(1589);
				match(T_REVERSE);
				}
				break;
			}
			setState(1592);
			expr(0);
			setState(1593);
			match(T_DOT2);
			setState(1594);
			expr(0);
			setState(1597);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_BY || _la==T_STEP) {
				{
				setState(1595);
				_la = _input.LA(1);
				if ( !(_la==T_BY || _la==T_STEP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1596);
				expr(0);
				}
			}

			setState(1599);
			match(T_LOOP);
			setState(1600);
			block();
			setState(1601);
			match(T_END);
			setState(1602);
			match(T_LOOP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelContext extends ParserRuleContext {
		public TerminalNode L_LABEL() { return getToken(HplsqlParser.L_LABEL, 0); }
		public List<TerminalNode> T_LESS() { return getTokens(HplsqlParser.T_LESS); }
		public TerminalNode T_LESS(int i) {
			return getToken(HplsqlParser.T_LESS, i);
		}
		public TerminalNode L_ID() { return getToken(HplsqlParser.L_ID, 0); }
		public List<TerminalNode> T_GREATER() { return getTokens(HplsqlParser.T_GREATER); }
		public TerminalNode T_GREATER(int i) {
			return getToken(HplsqlParser.T_GREATER, i);
		}
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_label);
		try {
			setState(1610);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_LABEL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1604);
				match(L_LABEL);
				}
				break;
			case T_LESS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1605);
				match(T_LESS);
				setState(1606);
				match(T_LESS);
				setState(1607);
				match(L_ID);
				setState(1608);
				match(T_GREATER);
				setState(1609);
				match(T_GREATER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_stmtContext extends ParserRuleContext {
		public Fullselect_stmtContext fullselect_stmt() {
			return getRuleContext(Fullselect_stmtContext.class,0);
		}
		public Cte_select_stmtContext cte_select_stmt() {
			return getRuleContext(Cte_select_stmtContext.class,0);
		}
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSelect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSelect_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSelect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1613);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_WITH) {
				{
				setState(1612);
				cte_select_stmt();
				}
			}

			setState(1615);
			fullselect_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cte_select_stmtContext extends ParserRuleContext {
		public TerminalNode T_WITH() { return getToken(HplsqlParser.T_WITH, 0); }
		public List<Cte_select_stmt_itemContext> cte_select_stmt_item() {
			return getRuleContexts(Cte_select_stmt_itemContext.class);
		}
		public Cte_select_stmt_itemContext cte_select_stmt_item(int i) {
			return getRuleContext(Cte_select_stmt_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Cte_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCte_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCte_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCte_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cte_select_stmtContext cte_select_stmt() throws RecognitionException {
		Cte_select_stmtContext _localctx = new Cte_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_cte_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1617);
			match(T_WITH);
			setState(1618);
			cte_select_stmt_item();
			setState(1623);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1619);
				match(T_COMMA);
				setState(1620);
				cte_select_stmt_item();
				}
				}
				setState(1625);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cte_select_stmt_itemContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public Fullselect_stmtContext fullselect_stmt() {
			return getRuleContext(Fullselect_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Cte_select_colsContext cte_select_cols() {
			return getRuleContext(Cte_select_colsContext.class,0);
		}
		public Cte_select_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_select_stmt_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCte_select_stmt_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCte_select_stmt_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCte_select_stmt_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cte_select_stmt_itemContext cte_select_stmt_item() throws RecognitionException {
		Cte_select_stmt_itemContext _localctx = new Cte_select_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_cte_select_stmt_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1626);
			ident();
			setState(1628);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_OPEN_P) {
				{
				setState(1627);
				cte_select_cols();
				}
			}

			setState(1630);
			match(T_AS);
			setState(1631);
			match(T_OPEN_P);
			setState(1632);
			fullselect_stmt();
			setState(1633);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cte_select_colsContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Cte_select_colsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_select_cols; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCte_select_cols(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCte_select_cols(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCte_select_cols(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cte_select_colsContext cte_select_cols() throws RecognitionException {
		Cte_select_colsContext _localctx = new Cte_select_colsContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_cte_select_cols);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1635);
			match(T_OPEN_P);
			setState(1636);
			ident();
			setState(1641);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1637);
				match(T_COMMA);
				setState(1638);
				ident();
				}
				}
				setState(1643);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1644);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fullselect_stmtContext extends ParserRuleContext {
		public List<Fullselect_stmt_itemContext> fullselect_stmt_item() {
			return getRuleContexts(Fullselect_stmt_itemContext.class);
		}
		public Fullselect_stmt_itemContext fullselect_stmt_item(int i) {
			return getRuleContext(Fullselect_stmt_itemContext.class,i);
		}
		public List<Fullselect_set_clauseContext> fullselect_set_clause() {
			return getRuleContexts(Fullselect_set_clauseContext.class);
		}
		public Fullselect_set_clauseContext fullselect_set_clause(int i) {
			return getRuleContext(Fullselect_set_clauseContext.class,i);
		}
		public Fullselect_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullselect_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFullselect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFullselect_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFullselect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fullselect_stmtContext fullselect_stmt() throws RecognitionException {
		Fullselect_stmtContext _localctx = new Fullselect_stmtContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_fullselect_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1646);
			fullselect_stmt_item();
			setState(1652);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1647);
					fullselect_set_clause();
					setState(1648);
					fullselect_stmt_item();
					}
					} 
				}
				setState(1654);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fullselect_stmt_itemContext extends ParserRuleContext {
		public Subselect_stmtContext subselect_stmt() {
			return getRuleContext(Subselect_stmtContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public Fullselect_stmtContext fullselect_stmt() {
			return getRuleContext(Fullselect_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Fullselect_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullselect_stmt_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFullselect_stmt_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFullselect_stmt_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFullselect_stmt_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fullselect_stmt_itemContext fullselect_stmt_item() throws RecognitionException {
		Fullselect_stmt_itemContext _localctx = new Fullselect_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_fullselect_stmt_item);
		try {
			setState(1660);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1655);
				subselect_stmt();
				}
				break;
			case T_OPEN_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(1656);
				match(T_OPEN_P);
				setState(1657);
				fullselect_stmt();
				setState(1658);
				match(T_CLOSE_P);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fullselect_set_clauseContext extends ParserRuleContext {
		public TerminalNode T_UNION() { return getToken(HplsqlParser.T_UNION, 0); }
		public TerminalNode T_ALL() { return getToken(HplsqlParser.T_ALL, 0); }
		public TerminalNode T_EXCEPT() { return getToken(HplsqlParser.T_EXCEPT, 0); }
		public TerminalNode T_INTERSECT() { return getToken(HplsqlParser.T_INTERSECT, 0); }
		public Fullselect_set_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullselect_set_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFullselect_set_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFullselect_set_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFullselect_set_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fullselect_set_clauseContext fullselect_set_clause() throws RecognitionException {
		Fullselect_set_clauseContext _localctx = new Fullselect_set_clauseContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_fullselect_set_clause);
		int _la;
		try {
			setState(1674);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_UNION:
				enterOuterAlt(_localctx, 1);
				{
				setState(1662);
				match(T_UNION);
				setState(1664);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL) {
					{
					setState(1663);
					match(T_ALL);
					}
				}

				}
				break;
			case T_EXCEPT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1666);
				match(T_EXCEPT);
				setState(1668);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL) {
					{
					setState(1667);
					match(T_ALL);
					}
				}

				}
				break;
			case T_INTERSECT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1670);
				match(T_INTERSECT);
				setState(1672);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL) {
					{
					setState(1671);
					match(T_ALL);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subselect_stmtContext extends ParserRuleContext {
		public Select_listContext select_list() {
			return getRuleContext(Select_listContext.class,0);
		}
		public TerminalNode T_SELECT() { return getToken(HplsqlParser.T_SELECT, 0); }
		public Into_clauseContext into_clause() {
			return getRuleContext(Into_clauseContext.class,0);
		}
		public From_clauseContext from_clause() {
			return getRuleContext(From_clauseContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Group_by_clauseContext group_by_clause() {
			return getRuleContext(Group_by_clauseContext.class,0);
		}
		public Having_clauseContext having_clause() {
			return getRuleContext(Having_clauseContext.class,0);
		}
		public Qualify_clauseContext qualify_clause() {
			return getRuleContext(Qualify_clauseContext.class,0);
		}
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public Select_optionsContext select_options() {
			return getRuleContext(Select_optionsContext.class,0);
		}
		public Subselect_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subselect_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSubselect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSubselect_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSubselect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subselect_stmtContext subselect_stmt() throws RecognitionException {
		Subselect_stmtContext _localctx = new Subselect_stmtContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_subselect_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1676);
			match(T_SELECT);
			}
			setState(1677);
			select_list();
			setState(1679);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				{
				setState(1678);
				into_clause();
				}
				break;
			}
			setState(1682);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				{
				setState(1681);
				from_clause();
				}
				break;
			}
			setState(1685);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				{
				setState(1684);
				where_clause();
				}
				break;
			}
			setState(1688);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				{
				setState(1687);
				group_by_clause();
				}
				break;
			}
			setState(1692);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				{
				setState(1690);
				having_clause();
				}
				break;
			case 2:
				{
				setState(1691);
				qualify_clause();
				}
				break;
			}
			setState(1695);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				{
				setState(1694);
				order_by_clause();
				}
				break;
			}
			setState(1698);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				{
				setState(1697);
				select_options();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_listContext extends ParserRuleContext {
		public List<Select_list_itemContext> select_list_item() {
			return getRuleContexts(Select_list_itemContext.class);
		}
		public Select_list_itemContext select_list_item(int i) {
			return getRuleContext(Select_list_itemContext.class,i);
		}
		public Select_list_setContext select_list_set() {
			return getRuleContext(Select_list_setContext.class,0);
		}
		public Select_list_limitContext select_list_limit() {
			return getRuleContext(Select_list_limitContext.class,0);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Select_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSelect_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSelect_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSelect_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_listContext select_list() throws RecognitionException {
		Select_listContext _localctx = new Select_listContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_select_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1701);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				{
				setState(1700);
				select_list_set();
				}
				break;
			}
			setState(1704);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				{
				setState(1703);
				select_list_limit();
				}
				break;
			}
			setState(1706);
			select_list_item();
			setState(1711);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1707);
					match(T_COMMA);
					setState(1708);
					select_list_item();
					}
					} 
				}
				setState(1713);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_list_setContext extends ParserRuleContext {
		public TerminalNode T_ALL() { return getToken(HplsqlParser.T_ALL, 0); }
		public TerminalNode T_DISTINCT() { return getToken(HplsqlParser.T_DISTINCT, 0); }
		public Select_list_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSelect_list_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSelect_list_set(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSelect_list_set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_list_setContext select_list_set() throws RecognitionException {
		Select_list_setContext _localctx = new Select_list_setContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_select_list_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1714);
			_la = _input.LA(1);
			if ( !(_la==T_ALL || _la==T_DISTINCT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_list_limitContext extends ParserRuleContext {
		public TerminalNode T_TOP() { return getToken(HplsqlParser.T_TOP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Select_list_limitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_limit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSelect_list_limit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSelect_list_limit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSelect_list_limit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_list_limitContext select_list_limit() throws RecognitionException {
		Select_list_limitContext _localctx = new Select_list_limitContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_select_list_limit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1716);
			match(T_TOP);
			setState(1717);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_list_itemContext extends ParserRuleContext {
		public TerminalNode T_FROM() { return getToken(HplsqlParser.T_FROM, 0); }
		public TabnameContext tabname() {
			return getRuleContext(TabnameContext.class,0);
		}
		public List<ColumnContext> column() {
			return getRuleContexts(ColumnContext.class);
		}
		public ColumnContext column(int i) {
			return getRuleContext(ColumnContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Select_list_asteriskContext select_list_asterisk() {
			return getRuleContext(Select_list_asteriskContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(HplsqlParser.T_EQUAL, 0); }
		public Select_list_aliasContext select_list_alias() {
			return getRuleContext(Select_list_aliasContext.class,0);
		}
		public Select_list_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSelect_list_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSelect_list_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSelect_list_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_list_itemContext select_list_item() throws RecognitionException {
		Select_list_itemContext _localctx = new Select_list_itemContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_select_list_item);
		try {
			int _alt;
			setState(1739);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1722);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1719);
						column();
						}
						} 
					}
					setState(1724);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
				}
				setState(1725);
				match(T_FROM);
				setState(1726);
				tabname();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1737);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
				case 1:
					{
					setState(1730);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
					case 1:
						{
						setState(1727);
						ident();
						setState(1728);
						match(T_EQUAL);
						}
						break;
					}
					setState(1732);
					expr(0);
					setState(1734);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
					case 1:
						{
						setState(1733);
						select_list_alias();
						}
						break;
					}
					}
					break;
				case 2:
					{
					setState(1736);
					select_list_asterisk();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_COMMA() { return getToken(HplsqlParser.T_COMMA, 0); }
		public ColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnContext column() throws RecognitionException {
		ColumnContext _localctx = new ColumnContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1741);
			ident();
			setState(1743);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_COMMA) {
				{
				setState(1742);
				match(T_COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TabnameContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TabnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tabname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterTabname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitTabname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitTabname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TabnameContext tabname() throws RecognitionException {
		TabnameContext _localctx = new TabnameContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_tabname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1745);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_list_aliasContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_TITLE() { return getToken(HplsqlParser.T_TITLE, 0); }
		public TerminalNode L_S_STRING() { return getToken(HplsqlParser.L_S_STRING, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Select_list_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSelect_list_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSelect_list_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSelect_list_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_list_aliasContext select_list_alias() throws RecognitionException {
		Select_list_aliasContext _localctx = new Select_list_aliasContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_select_list_alias);
		try {
			setState(1755);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALLOCATE:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DELIMITER:
			case T_DESC:
			case T_DESCRIBE:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXEC:
			case T_EXECUTE:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FETCH:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FROM:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_GROUP:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HDFS:
			case T_HIVE:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INNER:
			case T_INOUT:
			case T_INSERT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INTO:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LEFT:
			case T_LIKE:
			case T_LIMIT:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_ORDER:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITH:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
			case L_ID:
			case L_S_STRING:
			case L_D_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(1748);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
				case 1:
					{
					setState(1747);
					match(T_AS);
					}
					break;
				}
				setState(1750);
				ident();
				}
				break;
			case T_OPEN_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(1751);
				match(T_OPEN_P);
				setState(1752);
				match(T_TITLE);
				setState(1753);
				match(L_S_STRING);
				setState(1754);
				match(T_CLOSE_P);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_list_asteriskContext extends ParserRuleContext {
		public TerminalNode L_ID() { return getToken(HplsqlParser.L_ID, 0); }
		public Select_list_asteriskContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_asterisk; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSelect_list_asterisk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSelect_list_asterisk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSelect_list_asterisk(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_list_asteriskContext select_list_asterisk() throws RecognitionException {
		Select_list_asteriskContext _localctx = new Select_list_asteriskContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_select_list_asterisk);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1759);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==L_ID) {
				{
				setState(1757);
				match(L_ID);
				setState(1758);
				match(T__2);
				}
			}

			setState(1761);
			match(T_MUL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Into_clauseContext extends ParserRuleContext {
		public TerminalNode T_INTO() { return getToken(HplsqlParser.T_INTO, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Into_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_into_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterInto_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitInto_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitInto_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Into_clauseContext into_clause() throws RecognitionException {
		Into_clauseContext _localctx = new Into_clauseContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_into_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1763);
			match(T_INTO);
			setState(1764);
			ident();
			setState(1769);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,206,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1765);
					match(T_COMMA);
					setState(1766);
					ident();
					}
					} 
				}
				setState(1771);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,206,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_clauseContext extends ParserRuleContext {
		public TerminalNode T_FROM() { return getToken(HplsqlParser.T_FROM, 0); }
		public From_table_clauseContext from_table_clause() {
			return getRuleContext(From_table_clauseContext.class,0);
		}
		public List<From_join_clauseContext> from_join_clause() {
			return getRuleContexts(From_join_clauseContext.class);
		}
		public From_join_clauseContext from_join_clause(int i) {
			return getRuleContext(From_join_clauseContext.class,i);
		}
		public From_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFrom_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFrom_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFrom_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_clauseContext from_clause() throws RecognitionException {
		From_clauseContext _localctx = new From_clauseContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_from_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1772);
			match(T_FROM);
			setState(1773);
			from_table_clause();
			setState(1777);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1774);
					from_join_clause();
					}
					} 
				}
				setState(1779);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_table_clauseContext extends ParserRuleContext {
		public From_table_name_clauseContext from_table_name_clause() {
			return getRuleContext(From_table_name_clauseContext.class,0);
		}
		public From_subselect_clauseContext from_subselect_clause() {
			return getRuleContext(From_subselect_clauseContext.class,0);
		}
		public From_table_values_clauseContext from_table_values_clause() {
			return getRuleContext(From_table_values_clauseContext.class,0);
		}
		public From_table_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_table_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFrom_table_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFrom_table_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFrom_table_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_table_clauseContext from_table_clause() throws RecognitionException {
		From_table_clauseContext _localctx = new From_table_clauseContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_from_table_clause);
		try {
			setState(1783);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1780);
				from_table_name_clause();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1781);
				from_subselect_clause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1782);
				from_table_values_clause();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_table_name_clauseContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public From_alias_clauseContext from_alias_clause() {
			return getRuleContext(From_alias_clauseContext.class,0);
		}
		public From_table_name_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_table_name_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFrom_table_name_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFrom_table_name_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFrom_table_name_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_table_name_clauseContext from_table_name_clause() throws RecognitionException {
		From_table_name_clauseContext _localctx = new From_table_name_clauseContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_from_table_name_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1785);
			table_name();
			setState(1787);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				{
				setState(1786);
				from_alias_clause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_subselect_clauseContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public From_alias_clauseContext from_alias_clause() {
			return getRuleContext(From_alias_clauseContext.class,0);
		}
		public From_subselect_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_subselect_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFrom_subselect_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFrom_subselect_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFrom_subselect_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_subselect_clauseContext from_subselect_clause() throws RecognitionException {
		From_subselect_clauseContext _localctx = new From_subselect_clauseContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_from_subselect_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1789);
			match(T_OPEN_P);
			setState(1790);
			select_stmt();
			setState(1791);
			match(T_CLOSE_P);
			setState(1793);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				{
				setState(1792);
				from_alias_clause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_join_clauseContext extends ParserRuleContext {
		public TerminalNode T_COMMA() { return getToken(HplsqlParser.T_COMMA, 0); }
		public From_table_clauseContext from_table_clause() {
			return getRuleContext(From_table_clauseContext.class,0);
		}
		public From_join_type_clauseContext from_join_type_clause() {
			return getRuleContext(From_join_type_clauseContext.class,0);
		}
		public TerminalNode T_ON() { return getToken(HplsqlParser.T_ON, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public From_join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_join_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFrom_join_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFrom_join_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFrom_join_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_join_clauseContext from_join_clause() throws RecognitionException {
		From_join_clauseContext _localctx = new From_join_clauseContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_from_join_clause);
		try {
			setState(1802);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1795);
				match(T_COMMA);
				setState(1796);
				from_table_clause();
				}
				break;
			case T_FULL:
			case T_INNER:
			case T_JOIN:
			case T_LEFT:
			case T_RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1797);
				from_join_type_clause();
				setState(1798);
				from_table_clause();
				setState(1799);
				match(T_ON);
				setState(1800);
				bool_expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_join_type_clauseContext extends ParserRuleContext {
		public TerminalNode T_JOIN() { return getToken(HplsqlParser.T_JOIN, 0); }
		public TerminalNode T_INNER() { return getToken(HplsqlParser.T_INNER, 0); }
		public TerminalNode T_LEFT() { return getToken(HplsqlParser.T_LEFT, 0); }
		public TerminalNode T_RIGHT() { return getToken(HplsqlParser.T_RIGHT, 0); }
		public TerminalNode T_FULL() { return getToken(HplsqlParser.T_FULL, 0); }
		public TerminalNode T_OUTER() { return getToken(HplsqlParser.T_OUTER, 0); }
		public From_join_type_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_join_type_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFrom_join_type_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFrom_join_type_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFrom_join_type_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_join_type_clauseContext from_join_type_clause() throws RecognitionException {
		From_join_type_clauseContext _localctx = new From_join_type_clauseContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_from_join_type_clause);
		int _la;
		try {
			setState(1813);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_INNER:
			case T_JOIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1805);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_INNER) {
					{
					setState(1804);
					match(T_INNER);
					}
				}

				setState(1807);
				match(T_JOIN);
				}
				break;
			case T_FULL:
			case T_LEFT:
			case T_RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1808);
				_la = _input.LA(1);
				if ( !(_la==T_FULL || _la==T_LEFT || _la==T_RIGHT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1810);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OUTER) {
					{
					setState(1809);
					match(T_OUTER);
					}
				}

				setState(1812);
				match(T_JOIN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_table_values_clauseContext extends ParserRuleContext {
		public TerminalNode T_TABLE() { return getToken(HplsqlParser.T_TABLE, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_VALUES() { return getToken(HplsqlParser.T_VALUES, 0); }
		public List<From_table_values_rowContext> from_table_values_row() {
			return getRuleContexts(From_table_values_rowContext.class);
		}
		public From_table_values_rowContext from_table_values_row(int i) {
			return getRuleContext(From_table_values_rowContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public From_alias_clauseContext from_alias_clause() {
			return getRuleContext(From_alias_clauseContext.class,0);
		}
		public From_table_values_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_table_values_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFrom_table_values_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFrom_table_values_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFrom_table_values_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_table_values_clauseContext from_table_values_clause() throws RecognitionException {
		From_table_values_clauseContext _localctx = new From_table_values_clauseContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_from_table_values_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1815);
			match(T_TABLE);
			setState(1816);
			match(T_OPEN_P);
			setState(1817);
			match(T_VALUES);
			setState(1818);
			from_table_values_row();
			setState(1823);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1819);
				match(T_COMMA);
				setState(1820);
				from_table_values_row();
				}
				}
				setState(1825);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1826);
			match(T_CLOSE_P);
			setState(1828);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
			case 1:
				{
				setState(1827);
				from_alias_clause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_table_values_rowContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public From_table_values_rowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_table_values_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFrom_table_values_row(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFrom_table_values_row(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFrom_table_values_row(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_table_values_rowContext from_table_values_row() throws RecognitionException {
		From_table_values_rowContext _localctx = new From_table_values_rowContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_from_table_values_row);
		int _la;
		try {
			setState(1842);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1830);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1831);
				match(T_OPEN_P);
				setState(1832);
				expr(0);
				setState(1837);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1833);
					match(T_COMMA);
					setState(1834);
					expr(0);
					}
					}
					setState(1839);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1840);
				match(T_CLOSE_P);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_alias_clauseContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public List<TerminalNode> L_ID() { return getTokens(HplsqlParser.L_ID); }
		public TerminalNode L_ID(int i) {
			return getToken(HplsqlParser.L_ID, i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public From_alias_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_alias_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFrom_alias_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFrom_alias_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFrom_alias_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_alias_clauseContext from_alias_clause() throws RecognitionException {
		From_alias_clauseContext _localctx = new From_alias_clauseContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_from_alias_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1844);
			if (!(!_input.LT(1).getText().equalsIgnoreCase("EXEC") &&
			        !_input.LT(1).getText().equalsIgnoreCase("EXECUTE") &&
			        !_input.LT(1).getText().equalsIgnoreCase("INNER") &&
			        !_input.LT(1).getText().equalsIgnoreCase("LEFT") &&
			        !_input.LT(1).getText().equalsIgnoreCase("GROUP") &&
			        !_input.LT(1).getText().equalsIgnoreCase("ORDER") &&
			        !_input.LT(1).getText().equalsIgnoreCase("LIMIT") &&
			        !_input.LT(1).getText().equalsIgnoreCase("WITH"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"EXEC\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"EXECUTE\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"INNER\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"LEFT\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"GROUP\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"ORDER\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"LIMIT\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"WITH\")");
			setState(1846);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
			case 1:
				{
				setState(1845);
				match(T_AS);
				}
				break;
			}
			setState(1848);
			ident();
			setState(1859);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
			case 1:
				{
				setState(1849);
				match(T_OPEN_P);
				setState(1850);
				match(L_ID);
				setState(1855);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1851);
					match(T_COMMA);
					setState(1852);
					match(L_ID);
					}
					}
					setState(1857);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1858);
				match(T_CLOSE_P);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_nameContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitTable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1861);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Where_clauseContext extends ParserRuleContext {
		public TerminalNode T_WHERE() { return getToken(HplsqlParser.T_WHERE, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterWhere_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitWhere_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitWhere_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1863);
			match(T_WHERE);
			setState(1864);
			bool_expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Group_by_clauseContext extends ParserRuleContext {
		public TerminalNode T_GROUP() { return getToken(HplsqlParser.T_GROUP, 0); }
		public TerminalNode T_BY() { return getToken(HplsqlParser.T_BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Group_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_by_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterGroup_by_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitGroup_by_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitGroup_by_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Group_by_clauseContext group_by_clause() throws RecognitionException {
		Group_by_clauseContext _localctx = new Group_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_group_by_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1866);
			match(T_GROUP);
			setState(1867);
			match(T_BY);
			setState(1868);
			expr(0);
			setState(1873);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,222,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1869);
					match(T_COMMA);
					setState(1870);
					expr(0);
					}
					} 
				}
				setState(1875);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,222,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Having_clauseContext extends ParserRuleContext {
		public TerminalNode T_HAVING() { return getToken(HplsqlParser.T_HAVING, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Having_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_having_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterHaving_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitHaving_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitHaving_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Having_clauseContext having_clause() throws RecognitionException {
		Having_clauseContext _localctx = new Having_clauseContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_having_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1876);
			match(T_HAVING);
			setState(1877);
			bool_expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Qualify_clauseContext extends ParserRuleContext {
		public TerminalNode T_QUALIFY() { return getToken(HplsqlParser.T_QUALIFY, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Qualify_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualify_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterQualify_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitQualify_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitQualify_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualify_clauseContext qualify_clause() throws RecognitionException {
		Qualify_clauseContext _localctx = new Qualify_clauseContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_qualify_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1879);
			match(T_QUALIFY);
			setState(1880);
			bool_expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Order_by_clauseContext extends ParserRuleContext {
		public TerminalNode T_ORDER() { return getToken(HplsqlParser.T_ORDER, 0); }
		public TerminalNode T_BY() { return getToken(HplsqlParser.T_BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public List<TerminalNode> T_ASC() { return getTokens(HplsqlParser.T_ASC); }
		public TerminalNode T_ASC(int i) {
			return getToken(HplsqlParser.T_ASC, i);
		}
		public List<TerminalNode> T_DESC() { return getTokens(HplsqlParser.T_DESC); }
		public TerminalNode T_DESC(int i) {
			return getToken(HplsqlParser.T_DESC, i);
		}
		public TerminalNode L_NUMBER() { return getToken(HplsqlParser.L_NUMBER, 0); }
		public Order_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterOrder_by_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitOrder_by_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitOrder_by_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Order_by_clauseContext order_by_clause() throws RecognitionException {
		Order_by_clauseContext _localctx = new Order_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_order_by_clause);
		int _la;
		try {
			int _alt;
			setState(1901);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1882);
				match(T_ORDER);
				setState(1883);
				match(T_BY);
				setState(1884);
				expr(0);
				setState(1886);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
				case 1:
					{
					setState(1885);
					_la = _input.LA(1);
					if ( !(_la==T_ASC || _la==T_DESC) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(1895);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,225,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1888);
						match(T_COMMA);
						setState(1889);
						expr(0);
						setState(1891);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
						case 1:
							{
							setState(1890);
							_la = _input.LA(1);
							if ( !(_la==T_ASC || _la==T_DESC) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							break;
						}
						}
						} 
					}
					setState(1897);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,225,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1898);
				match(T_ORDER);
				setState(1899);
				match(T_BY);
				setState(1900);
				match(L_NUMBER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_optionsContext extends ParserRuleContext {
		public List<Select_options_itemContext> select_options_item() {
			return getRuleContexts(Select_options_itemContext.class);
		}
		public Select_options_itemContext select_options_item(int i) {
			return getRuleContext(Select_options_itemContext.class,i);
		}
		public Select_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSelect_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSelect_options(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSelect_options(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_optionsContext select_options() throws RecognitionException {
		Select_optionsContext _localctx = new Select_optionsContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_select_options);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1904); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1903);
					select_options_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1906); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,227,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_options_itemContext extends ParserRuleContext {
		public TerminalNode T_LIMIT() { return getToken(HplsqlParser.T_LIMIT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_WITH() { return getToken(HplsqlParser.T_WITH, 0); }
		public TerminalNode T_RR() { return getToken(HplsqlParser.T_RR, 0); }
		public TerminalNode T_RS() { return getToken(HplsqlParser.T_RS, 0); }
		public TerminalNode T_CS() { return getToken(HplsqlParser.T_CS, 0); }
		public TerminalNode T_UR() { return getToken(HplsqlParser.T_UR, 0); }
		public TerminalNode T_USE() { return getToken(HplsqlParser.T_USE, 0); }
		public TerminalNode T_AND() { return getToken(HplsqlParser.T_AND, 0); }
		public TerminalNode T_KEEP() { return getToken(HplsqlParser.T_KEEP, 0); }
		public TerminalNode T_LOCKS() { return getToken(HplsqlParser.T_LOCKS, 0); }
		public TerminalNode T_EXCLUSIVE() { return getToken(HplsqlParser.T_EXCLUSIVE, 0); }
		public TerminalNode T_UPDATE() { return getToken(HplsqlParser.T_UPDATE, 0); }
		public TerminalNode T_SHARE() { return getToken(HplsqlParser.T_SHARE, 0); }
		public Select_options_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_options_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSelect_options_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSelect_options_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSelect_options_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_options_itemContext select_options_item() throws RecognitionException {
		Select_options_itemContext _localctx = new Select_options_itemContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_select_options_item);
		int _la;
		try {
			setState(1919);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LIMIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1908);
				match(T_LIMIT);
				setState(1909);
				expr(0);
				}
				break;
			case T_WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(1910);
				match(T_WITH);
				setState(1911);
				_la = _input.LA(1);
				if ( !(_la==T_CS || ((((_la - 245)) & ~0x3f) == 0 && ((1L << (_la - 245)) & ((1L << (T_RR - 245)) | (1L << (T_RS - 245)) | (1L << (T_UR - 245)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1917);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
				case 1:
					{
					setState(1912);
					match(T_USE);
					setState(1913);
					match(T_AND);
					setState(1914);
					match(T_KEEP);
					setState(1915);
					_la = _input.LA(1);
					if ( !(_la==T_EXCLUSIVE || _la==T_SHARE || _la==T_UPDATE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1916);
					match(T_LOCKS);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_exprContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public List<Bool_exprContext> bool_expr() {
			return getRuleContexts(Bool_exprContext.class);
		}
		public Bool_exprContext bool_expr(int i) {
			return getRuleContext(Bool_exprContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public Bool_expr_atomContext bool_expr_atom() {
			return getRuleContext(Bool_expr_atomContext.class,0);
		}
		public Bool_expr_logical_operatorContext bool_expr_logical_operator() {
			return getRuleContext(Bool_expr_logical_operatorContext.class,0);
		}
		public Bool_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterBool_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitBool_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitBool_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_exprContext bool_expr() throws RecognitionException {
		return bool_expr(0);
	}

	private Bool_exprContext bool_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bool_exprContext _localctx = new Bool_exprContext(_ctx, _parentState);
		Bool_exprContext _prevctx = _localctx;
		int _startState = 280;
		enterRecursionRule(_localctx, 280, RULE_bool_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1930);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
			case 1:
				{
				setState(1923);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1922);
					match(T_NOT);
					}
				}

				setState(1925);
				match(T_OPEN_P);
				setState(1926);
				bool_expr(0);
				setState(1927);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(1929);
				bool_expr_atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1938);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,232,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bool_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bool_expr);
					setState(1932);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1933);
					bool_expr_logical_operator();
					setState(1934);
					bool_expr(3);
					}
					} 
				}
				setState(1940);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,232,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Bool_expr_atomContext extends ParserRuleContext {
		public Bool_expr_unaryContext bool_expr_unary() {
			return getRuleContext(Bool_expr_unaryContext.class,0);
		}
		public Bool_expr_binaryContext bool_expr_binary() {
			return getRuleContext(Bool_expr_binaryContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Bool_expr_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterBool_expr_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitBool_expr_atom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitBool_expr_atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_atomContext bool_expr_atom() throws RecognitionException {
		Bool_expr_atomContext _localctx = new Bool_expr_atomContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_bool_expr_atom);
		try {
			setState(1944);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1941);
				bool_expr_unary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1942);
				bool_expr_binary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1943);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_expr_unaryContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_IS() { return getToken(HplsqlParser.T_IS, 0); }
		public TerminalNode T_NULL() { return getToken(HplsqlParser.T_NULL, 0); }
		public TerminalNode T_TRUE() { return getToken(HplsqlParser.T_TRUE, 0); }
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public TerminalNode T_BETWEEN() { return getToken(HplsqlParser.T_BETWEEN, 0); }
		public TerminalNode T_AND() { return getToken(HplsqlParser.T_AND, 0); }
		public TerminalNode T_EXISTS() { return getToken(HplsqlParser.T_EXISTS, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Bool_expr_single_inContext bool_expr_single_in() {
			return getRuleContext(Bool_expr_single_inContext.class,0);
		}
		public Bool_expr_multi_inContext bool_expr_multi_in() {
			return getRuleContext(Bool_expr_multi_inContext.class,0);
		}
		public Bool_expr_unaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_unary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterBool_expr_unary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitBool_expr_unary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitBool_expr_unary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_unaryContext bool_expr_unary() throws RecognitionException {
		Bool_expr_unaryContext _localctx = new Bool_expr_unaryContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_bool_expr_unary);
		int _la;
		try {
			setState(1969);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1946);
				expr(0);
				setState(1947);
				match(T_IS);
				setState(1949);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1948);
					match(T_NOT);
					}
				}

				setState(1951);
				_la = _input.LA(1);
				if ( !(_la==T_NULL || _la==T_TRUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1953);
				expr(0);
				setState(1954);
				match(T_BETWEEN);
				setState(1955);
				expr(0);
				setState(1956);
				match(T_AND);
				setState(1957);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1960);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1959);
					match(T_NOT);
					}
				}

				setState(1962);
				match(T_EXISTS);
				setState(1963);
				match(T_OPEN_P);
				setState(1964);
				select_stmt();
				setState(1965);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1967);
				bool_expr_single_in();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1968);
				bool_expr_multi_in();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_expr_single_inContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_IN() { return getToken(HplsqlParser.T_IN, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Bool_expr_single_inContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_single_in; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterBool_expr_single_in(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitBool_expr_single_in(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitBool_expr_single_in(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_single_inContext bool_expr_single_in() throws RecognitionException {
		Bool_expr_single_inContext _localctx = new Bool_expr_single_inContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_bool_expr_single_in);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1971);
			expr(0);
			setState(1973);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_NOT) {
				{
				setState(1972);
				match(T_NOT);
				}
			}

			setState(1975);
			match(T_IN);
			setState(1976);
			match(T_OPEN_P);
			setState(1986);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
			case 1:
				{
				{
				setState(1977);
				expr(0);
				setState(1982);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1978);
					match(T_COMMA);
					setState(1979);
					expr(0);
					}
					}
					setState(1984);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2:
				{
				setState(1985);
				select_stmt();
				}
				break;
			}
			setState(1988);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_expr_multi_inContext extends ParserRuleContext {
		public List<TerminalNode> T_OPEN_P() { return getTokens(HplsqlParser.T_OPEN_P); }
		public TerminalNode T_OPEN_P(int i) {
			return getToken(HplsqlParser.T_OPEN_P, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_CLOSE_P() { return getTokens(HplsqlParser.T_CLOSE_P); }
		public TerminalNode T_CLOSE_P(int i) {
			return getToken(HplsqlParser.T_CLOSE_P, i);
		}
		public TerminalNode T_IN() { return getToken(HplsqlParser.T_IN, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public Bool_expr_multi_inContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_multi_in; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterBool_expr_multi_in(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitBool_expr_multi_in(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitBool_expr_multi_in(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_multi_inContext bool_expr_multi_in() throws RecognitionException {
		Bool_expr_multi_inContext _localctx = new Bool_expr_multi_inContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_bool_expr_multi_in);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1990);
			match(T_OPEN_P);
			setState(1991);
			expr(0);
			setState(1996);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1992);
				match(T_COMMA);
				setState(1993);
				expr(0);
				}
				}
				setState(1998);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1999);
			match(T_CLOSE_P);
			setState(2001);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_NOT) {
				{
				setState(2000);
				match(T_NOT);
				}
			}

			setState(2003);
			match(T_IN);
			setState(2004);
			match(T_OPEN_P);
			setState(2005);
			select_stmt();
			setState(2006);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_expr_binaryContext extends ParserRuleContext {
		public Bool_expr_binary_operatorContext bool_expr_binary_operator() {
			return getRuleContext(Bool_expr_binary_operatorContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Bool_expr_binaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_binary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterBool_expr_binary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitBool_expr_binary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitBool_expr_binary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_binaryContext bool_expr_binary() throws RecognitionException {
		Bool_expr_binaryContext _localctx = new Bool_expr_binaryContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_bool_expr_binary);
		try {
			setState(2013);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2008);
				bool_expr_binary_operator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2009);
				expr(0);
				setState(2010);
				bool_expr_binary_operator();
				setState(2011);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_expr_logical_operatorContext extends ParserRuleContext {
		public TerminalNode T_AND() { return getToken(HplsqlParser.T_AND, 0); }
		public TerminalNode T_OR() { return getToken(HplsqlParser.T_OR, 0); }
		public Bool_expr_logical_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_logical_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterBool_expr_logical_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitBool_expr_logical_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitBool_expr_logical_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_logical_operatorContext bool_expr_logical_operator() throws RecognitionException {
		Bool_expr_logical_operatorContext _localctx = new Bool_expr_logical_operatorContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_bool_expr_logical_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2015);
			_la = _input.LA(1);
			if ( !(_la==T_AND || _la==T_OR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_expr_binary_operatorContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(HplsqlParser.T_EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_EQUAL2() { return getToken(HplsqlParser.T_EQUAL2, 0); }
		public TerminalNode T_NOTEQUAL() { return getToken(HplsqlParser.T_NOTEQUAL, 0); }
		public TerminalNode T_NOTEQUAL2() { return getToken(HplsqlParser.T_NOTEQUAL2, 0); }
		public TerminalNode T_LESS() { return getToken(HplsqlParser.T_LESS, 0); }
		public TerminalNode T_LESSEQUAL() { return getToken(HplsqlParser.T_LESSEQUAL, 0); }
		public TerminalNode T_GREATER() { return getToken(HplsqlParser.T_GREATER, 0); }
		public TerminalNode T_GREATEREQUAL() { return getToken(HplsqlParser.T_GREATEREQUAL, 0); }
		public TerminalNode T_LIKE() { return getToken(HplsqlParser.T_LIKE, 0); }
		public TerminalNode T_RLIKE() { return getToken(HplsqlParser.T_RLIKE, 0); }
		public TerminalNode T_REGEXP() { return getToken(HplsqlParser.T_REGEXP, 0); }
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public Bool_expr_binary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_binary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterBool_expr_binary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitBool_expr_binary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitBool_expr_binary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_binary_operatorContext bool_expr_binary_operator() throws RecognitionException {
		Bool_expr_binary_operatorContext _localctx = new Bool_expr_binary_operatorContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_bool_expr_binary_operator);
		int _la;
		try {
			setState(2036);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2017);
				ident();
				setState(2018);
				match(T_EQUAL);
				setState(2019);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2021);
				expr(0);
				setState(2022);
				match(T_EQUAL);
				setState(2023);
				ident();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2025);
				match(T_EQUAL2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2026);
				match(T_NOTEQUAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2027);
				match(T_NOTEQUAL2);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2028);
				match(T_LESS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2029);
				match(T_LESSEQUAL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2030);
				match(T_GREATER);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2031);
				match(T_GREATEREQUAL);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2033);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(2032);
					match(T_NOT);
					}
				}

				setState(2035);
				_la = _input.LA(1);
				if ( !(_la==T_LIKE || _la==T_REGEXP || _la==T_RLIKE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Expr_concatContext expr_concat() {
			return getRuleContext(Expr_concatContext.class,0);
		}
		public Expr_caseContext expr_case() {
			return getRuleContext(Expr_caseContext.class,0);
		}
		public Expr_cursor_attributeContext expr_cursor_attribute() {
			return getRuleContext(Expr_cursor_attributeContext.class,0);
		}
		public Expr_agg_window_funcContext expr_agg_window_func() {
			return getRuleContext(Expr_agg_window_funcContext.class,0);
		}
		public Expr_spec_funcContext expr_spec_func() {
			return getRuleContext(Expr_spec_funcContext.class,0);
		}
		public Expr_funcContext expr_func() {
			return getRuleContext(Expr_funcContext.class,0);
		}
		public Expr_atomContext expr_atom() {
			return getRuleContext(Expr_atomContext.class,0);
		}
		public TerminalNode T_MUL() { return getToken(HplsqlParser.T_MUL, 0); }
		public TerminalNode T_DIV() { return getToken(HplsqlParser.T_DIV, 0); }
		public TerminalNode T_ADD() { return getToken(HplsqlParser.T_ADD, 0); }
		public TerminalNode T_SUB() { return getToken(HplsqlParser.T_SUB, 0); }
		public Interval_itemContext interval_item() {
			return getRuleContext(Interval_itemContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 296;
		enterRecursionRule(_localctx, 296, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2054);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
			case 1:
				{
				setState(2039);
				match(T_OPEN_P);
				setState(2040);
				select_stmt();
				setState(2041);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(2043);
				match(T_OPEN_P);
				setState(2044);
				expr(0);
				setState(2045);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				{
				setState(2047);
				expr_concat();
				}
				break;
			case 4:
				{
				setState(2048);
				expr_case();
				}
				break;
			case 5:
				{
				setState(2049);
				expr_cursor_attribute();
				}
				break;
			case 6:
				{
				setState(2050);
				expr_agg_window_func();
				}
				break;
			case 7:
				{
				setState(2051);
				expr_spec_func();
				}
				break;
			case 8:
				{
				setState(2052);
				expr_func();
				}
				break;
			case 9:
				{
				setState(2053);
				expr_atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2072);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,247,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2070);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2056);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(2057);
						match(T_MUL);
						setState(2058);
						expr(14);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2059);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(2060);
						match(T_DIV);
						setState(2061);
						expr(13);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2062);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(2063);
						match(T_ADD);
						setState(2064);
						expr(12);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2065);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(2066);
						match(T_SUB);
						setState(2067);
						expr(11);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2068);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(2069);
						interval_item();
						}
						break;
					}
					} 
				}
				setState(2074);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,247,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Expr_atomContext extends ParserRuleContext {
		public Date_literalContext date_literal() {
			return getRuleContext(Date_literalContext.class,0);
		}
		public Timestamp_literalContext timestamp_literal() {
			return getRuleContext(Timestamp_literalContext.class,0);
		}
		public Bool_literalContext bool_literal() {
			return getRuleContext(Bool_literalContext.class,0);
		}
		public Variable_nameContext variable_name() {
			return getRuleContext(Variable_nameContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Dec_numberContext dec_number() {
			return getRuleContext(Dec_numberContext.class,0);
		}
		public Int_numberContext int_number() {
			return getRuleContext(Int_numberContext.class,0);
		}
		public Null_constContext null_const() {
			return getRuleContext(Null_constContext.class,0);
		}
		public Expr_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_atom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_atomContext expr_atom() throws RecognitionException {
		Expr_atomContext _localctx = new Expr_atomContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_expr_atom);
		try {
			setState(2083);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2075);
				date_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2076);
				timestamp_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2077);
				bool_literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2078);
				variable_name();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2079);
				string();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2080);
				dec_number();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2081);
				int_number();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2082);
				null_const();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interval_itemContext extends ParserRuleContext {
		public TerminalNode T_DAY() { return getToken(HplsqlParser.T_DAY, 0); }
		public TerminalNode T_DAYS() { return getToken(HplsqlParser.T_DAYS, 0); }
		public TerminalNode T_MICROSECOND() { return getToken(HplsqlParser.T_MICROSECOND, 0); }
		public TerminalNode T_MICROSECONDS() { return getToken(HplsqlParser.T_MICROSECONDS, 0); }
		public TerminalNode T_SECOND() { return getToken(HplsqlParser.T_SECOND, 0); }
		public TerminalNode T_SECONDS() { return getToken(HplsqlParser.T_SECONDS, 0); }
		public Interval_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterInterval_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitInterval_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitInterval_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interval_itemContext interval_item() throws RecognitionException {
		Interval_itemContext _localctx = new Interval_itemContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_interval_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2085);
			_la = _input.LA(1);
			if ( !(_la==T_DAY || _la==T_DAYS || _la==T_MICROSECOND || _la==T_MICROSECONDS || _la==T_SECOND || _la==T_SECONDS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_concatContext extends ParserRuleContext {
		public List<Expr_concat_itemContext> expr_concat_item() {
			return getRuleContexts(Expr_concat_itemContext.class);
		}
		public Expr_concat_itemContext expr_concat_item(int i) {
			return getRuleContext(Expr_concat_itemContext.class,i);
		}
		public List<TerminalNode> T_PIPE() { return getTokens(HplsqlParser.T_PIPE); }
		public TerminalNode T_PIPE(int i) {
			return getToken(HplsqlParser.T_PIPE, i);
		}
		public List<TerminalNode> T_CONCAT() { return getTokens(HplsqlParser.T_CONCAT); }
		public TerminalNode T_CONCAT(int i) {
			return getToken(HplsqlParser.T_CONCAT, i);
		}
		public Expr_concatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_concat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_concat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_concat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_concat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_concatContext expr_concat() throws RecognitionException {
		Expr_concatContext _localctx = new Expr_concatContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_expr_concat);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2087);
			expr_concat_item();
			setState(2088);
			_la = _input.LA(1);
			if ( !(_la==T_CONCAT || _la==T_PIPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2089);
			expr_concat_item();
			setState(2094);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,249,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2090);
					_la = _input.LA(1);
					if ( !(_la==T_CONCAT || _la==T_PIPE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2091);
					expr_concat_item();
					}
					} 
				}
				setState(2096);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,249,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_concat_itemContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Expr_caseContext expr_case() {
			return getRuleContext(Expr_caseContext.class,0);
		}
		public Expr_agg_window_funcContext expr_agg_window_func() {
			return getRuleContext(Expr_agg_window_funcContext.class,0);
		}
		public Expr_spec_funcContext expr_spec_func() {
			return getRuleContext(Expr_spec_funcContext.class,0);
		}
		public Expr_funcContext expr_func() {
			return getRuleContext(Expr_funcContext.class,0);
		}
		public Expr_atomContext expr_atom() {
			return getRuleContext(Expr_atomContext.class,0);
		}
		public Expr_concat_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_concat_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_concat_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_concat_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_concat_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_concat_itemContext expr_concat_item() throws RecognitionException {
		Expr_concat_itemContext _localctx = new Expr_concat_itemContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_expr_concat_item);
		try {
			setState(2106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2097);
				match(T_OPEN_P);
				setState(2098);
				expr(0);
				setState(2099);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2101);
				expr_case();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2102);
				expr_agg_window_func();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2103);
				expr_spec_func();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2104);
				expr_func();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2105);
				expr_atom();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_caseContext extends ParserRuleContext {
		public Expr_case_simpleContext expr_case_simple() {
			return getRuleContext(Expr_case_simpleContext.class,0);
		}
		public Expr_case_searchedContext expr_case_searched() {
			return getRuleContext(Expr_case_searchedContext.class,0);
		}
		public Expr_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_case(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_case(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_caseContext expr_case() throws RecognitionException {
		Expr_caseContext _localctx = new Expr_caseContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_expr_case);
		try {
			setState(2110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2108);
				expr_case_simple();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2109);
				expr_case_searched();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_case_simpleContext extends ParserRuleContext {
		public TerminalNode T_CASE() { return getToken(HplsqlParser.T_CASE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_END() { return getToken(HplsqlParser.T_END, 0); }
		public List<TerminalNode> T_WHEN() { return getTokens(HplsqlParser.T_WHEN); }
		public TerminalNode T_WHEN(int i) {
			return getToken(HplsqlParser.T_WHEN, i);
		}
		public List<TerminalNode> T_THEN() { return getTokens(HplsqlParser.T_THEN); }
		public TerminalNode T_THEN(int i) {
			return getToken(HplsqlParser.T_THEN, i);
		}
		public TerminalNode T_ELSE() { return getToken(HplsqlParser.T_ELSE, 0); }
		public Expr_case_simpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_case_simple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_case_simple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_case_simple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_case_simple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_case_simpleContext expr_case_simple() throws RecognitionException {
		Expr_case_simpleContext _localctx = new Expr_case_simpleContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_expr_case_simple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2112);
			match(T_CASE);
			setState(2113);
			expr(0);
			setState(2119); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2114);
				match(T_WHEN);
				setState(2115);
				expr(0);
				setState(2116);
				match(T_THEN);
				setState(2117);
				expr(0);
				}
				}
				setState(2121); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_WHEN );
			setState(2125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(2123);
				match(T_ELSE);
				setState(2124);
				expr(0);
				}
			}

			setState(2127);
			match(T_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_case_searchedContext extends ParserRuleContext {
		public TerminalNode T_CASE() { return getToken(HplsqlParser.T_CASE, 0); }
		public TerminalNode T_END() { return getToken(HplsqlParser.T_END, 0); }
		public List<TerminalNode> T_WHEN() { return getTokens(HplsqlParser.T_WHEN); }
		public TerminalNode T_WHEN(int i) {
			return getToken(HplsqlParser.T_WHEN, i);
		}
		public List<Bool_exprContext> bool_expr() {
			return getRuleContexts(Bool_exprContext.class);
		}
		public Bool_exprContext bool_expr(int i) {
			return getRuleContext(Bool_exprContext.class,i);
		}
		public List<TerminalNode> T_THEN() { return getTokens(HplsqlParser.T_THEN); }
		public TerminalNode T_THEN(int i) {
			return getToken(HplsqlParser.T_THEN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_ELSE() { return getToken(HplsqlParser.T_ELSE, 0); }
		public Expr_case_searchedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_case_searched; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_case_searched(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_case_searched(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_case_searched(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_case_searchedContext expr_case_searched() throws RecognitionException {
		Expr_case_searchedContext _localctx = new Expr_case_searchedContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_expr_case_searched);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2129);
			match(T_CASE);
			setState(2135); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2130);
				match(T_WHEN);
				setState(2131);
				bool_expr(0);
				setState(2132);
				match(T_THEN);
				setState(2133);
				expr(0);
				}
				}
				setState(2137); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_WHEN );
			setState(2141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(2139);
				match(T_ELSE);
				setState(2140);
				expr(0);
				}
			}

			setState(2143);
			match(T_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_cursor_attributeContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_ISOPEN() { return getToken(HplsqlParser.T_ISOPEN, 0); }
		public TerminalNode T_FOUND() { return getToken(HplsqlParser.T_FOUND, 0); }
		public TerminalNode T_NOTFOUND() { return getToken(HplsqlParser.T_NOTFOUND, 0); }
		public Expr_cursor_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_cursor_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_cursor_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_cursor_attribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_cursor_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_cursor_attributeContext expr_cursor_attribute() throws RecognitionException {
		Expr_cursor_attributeContext _localctx = new Expr_cursor_attributeContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_expr_cursor_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2145);
			ident();
			setState(2146);
			match(T__3);
			setState(2147);
			_la = _input.LA(1);
			if ( !(_la==T_FOUND || _la==T_ISOPEN || _la==T_NOTFOUND) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_agg_window_funcContext extends ParserRuleContext {
		public TerminalNode T_AVG() { return getToken(HplsqlParser.T_AVG, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Expr_func_all_distinctContext expr_func_all_distinct() {
			return getRuleContext(Expr_func_all_distinctContext.class,0);
		}
		public Expr_func_over_clauseContext expr_func_over_clause() {
			return getRuleContext(Expr_func_over_clauseContext.class,0);
		}
		public TerminalNode T_COUNT() { return getToken(HplsqlParser.T_COUNT, 0); }
		public TerminalNode T_COUNT_BIG() { return getToken(HplsqlParser.T_COUNT_BIG, 0); }
		public TerminalNode T_CUME_DIST() { return getToken(HplsqlParser.T_CUME_DIST, 0); }
		public TerminalNode T_DENSE_RANK() { return getToken(HplsqlParser.T_DENSE_RANK, 0); }
		public TerminalNode T_FIRST_VALUE() { return getToken(HplsqlParser.T_FIRST_VALUE, 0); }
		public TerminalNode T_LAG() { return getToken(HplsqlParser.T_LAG, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public TerminalNode T_LAST_VALUE() { return getToken(HplsqlParser.T_LAST_VALUE, 0); }
		public TerminalNode T_LEAD() { return getToken(HplsqlParser.T_LEAD, 0); }
		public TerminalNode T_MAX() { return getToken(HplsqlParser.T_MAX, 0); }
		public TerminalNode T_MIN() { return getToken(HplsqlParser.T_MIN, 0); }
		public TerminalNode T_RANK() { return getToken(HplsqlParser.T_RANK, 0); }
		public TerminalNode T_ROW_NUMBER() { return getToken(HplsqlParser.T_ROW_NUMBER, 0); }
		public TerminalNode T_STDEV() { return getToken(HplsqlParser.T_STDEV, 0); }
		public TerminalNode T_SUM() { return getToken(HplsqlParser.T_SUM, 0); }
		public TerminalNode T_VAR() { return getToken(HplsqlParser.T_VAR, 0); }
		public TerminalNode T_VARIANCE() { return getToken(HplsqlParser.T_VARIANCE, 0); }
		public Expr_agg_window_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_agg_window_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_agg_window_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_agg_window_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_agg_window_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_agg_window_funcContext expr_agg_window_func() throws RecognitionException {
		Expr_agg_window_funcContext _localctx = new Expr_agg_window_funcContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_expr_agg_window_func);
		int _la;
		try {
			setState(2301);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AVG:
				enterOuterAlt(_localctx, 1);
				{
				setState(2149);
				match(T_AVG);
				setState(2150);
				match(T_OPEN_P);
				setState(2152);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
				case 1:
					{
					setState(2151);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2154);
				expr(0);
				setState(2155);
				match(T_CLOSE_P);
				setState(2157);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
				case 1:
					{
					setState(2156);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_COUNT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2159);
				match(T_COUNT);
				setState(2160);
				match(T_OPEN_P);
				setState(2166);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_ACTION:
				case T_ADD2:
				case T_ALL:
				case T_ALLOCATE:
				case T_ALTER:
				case T_AND:
				case T_ANSI_NULLS:
				case T_ANSI_PADDING:
				case T_AS:
				case T_ASC:
				case T_ASSOCIATE:
				case T_AT:
				case T_AUTO_INCREMENT:
				case T_AVG:
				case T_BATCHSIZE:
				case T_BEGIN:
				case T_BETWEEN:
				case T_BIGINT:
				case T_BINARY_DOUBLE:
				case T_BINARY_FLOAT:
				case T_BIT:
				case T_BODY:
				case T_BREAK:
				case T_BY:
				case T_BYTE:
				case T_CALL:
				case T_CALLER:
				case T_CASCADE:
				case T_CASE:
				case T_CASESPECIFIC:
				case T_CAST:
				case T_CHAR:
				case T_CHARACTER:
				case T_CHARSET:
				case T_CLIENT:
				case T_CLOSE:
				case T_CLUSTERED:
				case T_CMP:
				case T_COLLECT:
				case T_COLLECTION:
				case T_COLUMN:
				case T_COMMENT:
				case T_CONSTANT:
				case T_COMMIT:
				case T_COMPRESS:
				case T_CONCAT:
				case T_CONDITION:
				case T_CONSTRAINT:
				case T_CONTINUE:
				case T_COPY:
				case T_COUNT:
				case T_COUNT_BIG:
				case T_CREATE:
				case T_CREATION:
				case T_CREATOR:
				case T_CS:
				case T_CURRENT:
				case T_CURRENT_SCHEMA:
				case T_CURSOR:
				case T_DATABASE:
				case T_DATA:
				case T_DATE:
				case T_DATETIME:
				case T_DAY:
				case T_DAYS:
				case T_DEC:
				case T_DECIMAL:
				case T_DECLARE:
				case T_DEFAULT:
				case T_DEFERRED:
				case T_DEFINED:
				case T_DEFINER:
				case T_DEFINITION:
				case T_DELETE:
				case T_DELIMITED:
				case T_DELIMITER:
				case T_DESC:
				case T_DESCRIBE:
				case T_DIAGNOSTICS:
				case T_DIR:
				case T_DIRECTORY:
				case T_DISTINCT:
				case T_DISTRIBUTE:
				case T_DO:
				case T_DOUBLE:
				case T_DROP:
				case T_DYNAMIC:
				case T_ENABLE:
				case T_ENGINE:
				case T_ESCAPED:
				case T_EXCEPT:
				case T_EXEC:
				case T_EXECUTE:
				case T_EXCEPTION:
				case T_EXCLUSIVE:
				case T_EXISTS:
				case T_EXIT:
				case T_FALLBACK:
				case T_FALSE:
				case T_FETCH:
				case T_FIELDS:
				case T_FILE:
				case T_FILES:
				case T_FLOAT:
				case T_FOR:
				case T_FOREIGN:
				case T_FORMAT:
				case T_FOUND:
				case T_FROM:
				case T_FULL:
				case T_FUNCTION:
				case T_GET:
				case T_GLOBAL:
				case T_GO:
				case T_GRANT:
				case T_GROUP:
				case T_HANDLER:
				case T_HASH:
				case T_HAVING:
				case T_HDFS:
				case T_HIVE:
				case T_HOST:
				case T_IDENTITY:
				case T_IF:
				case T_IGNORE:
				case T_IMMEDIATE:
				case T_IN:
				case T_INCLUDE:
				case T_INDEX:
				case T_INITRANS:
				case T_INNER:
				case T_INOUT:
				case T_INSERT:
				case T_INT2:
				case T_INT4:
				case T_INT8:
				case T_INTEGER:
				case T_INTERSECT:
				case T_INTERVAL:
				case T_INTO:
				case T_INVOKER:
				case T_IS:
				case T_ISOPEN:
				case T_ITEMS:
				case T_JOIN:
				case T_KEEP:
				case T_KEY:
				case T_KEYS:
				case T_LANGUAGE:
				case T_LEAVE:
				case T_LEFT:
				case T_LIKE:
				case T_LIMIT:
				case T_LINES:
				case T_LOCAL:
				case T_LOCATION:
				case T_LOCATOR:
				case T_LOCATORS:
				case T_LOCKS:
				case T_LOG:
				case T_LOGGED:
				case T_LOGGING:
				case T_LOOP:
				case T_MAP:
				case T_MATCHED:
				case T_MAX:
				case T_MAXTRANS:
				case T_MERGE:
				case T_MESSAGE_TEXT:
				case T_MICROSECOND:
				case T_MICROSECONDS:
				case T_MIN:
				case T_MULTISET:
				case T_NCHAR:
				case T_NEW:
				case T_NVARCHAR:
				case T_NO:
				case T_NOCOUNT:
				case T_NOCOMPRESS:
				case T_NOLOGGING:
				case T_NONE:
				case T_NOT:
				case T_NOTFOUND:
				case T_NULL:
				case T_NUMERIC:
				case T_NUMBER:
				case T_OBJECT:
				case T_OFF:
				case T_ON:
				case T_ONLY:
				case T_OPEN:
				case T_OR:
				case T_ORDER:
				case T_OUT:
				case T_OUTER:
				case T_OVER:
				case T_OVERWRITE:
				case T_OWNER:
				case T_PACKAGE:
				case T_PARTITION:
				case T_PCTFREE:
				case T_PCTUSED:
				case T_PRECISION:
				case T_PRESERVE:
				case T_PRIMARY:
				case T_PRINT:
				case T_PROC:
				case T_PROCEDURE:
				case T_QUALIFY:
				case T_QUERY_BAND:
				case T_QUIT:
				case T_QUOTED_IDENTIFIER:
				case T_RAISE:
				case T_REFERENCES:
				case T_REGEXP:
				case T_REPLACE:
				case T_RESIGNAL:
				case T_RESTRICT:
				case T_RESULT:
				case T_RESULT_SET_LOCATOR:
				case T_RETURN:
				case T_RETURNS:
				case T_REVERSE:
				case T_RIGHT:
				case T_RLIKE:
				case T_ROLE:
				case T_ROLLBACK:
				case T_ROW:
				case T_ROWS:
				case T_ROW_COUNT:
				case T_RR:
				case T_RS:
				case T_PWD:
				case T_TRIM:
				case T_SCHEMA:
				case T_SECOND:
				case T_SECONDS:
				case T_SECURITY:
				case T_SEGMENT:
				case T_SEL:
				case T_SELECT:
				case T_SET:
				case T_SESSION:
				case T_SESSIONS:
				case T_SETS:
				case T_SHARE:
				case T_SIGNAL:
				case T_SIMPLE_DOUBLE:
				case T_SIMPLE_FLOAT:
				case T_SMALLDATETIME:
				case T_SMALLINT:
				case T_SQL:
				case T_SQLEXCEPTION:
				case T_SQLINSERT:
				case T_SQLSTATE:
				case T_SQLWARNING:
				case T_STATS:
				case T_STATISTICS:
				case T_STEP:
				case T_STORAGE:
				case T_STORED:
				case T_SUBDIR:
				case T_SUBSTRING:
				case T_SUM:
				case T_SUMMARY:
				case T_SYS_REFCURSOR:
				case T_TABLE:
				case T_TABLESPACE:
				case T_TEMPORARY:
				case T_TERMINATED:
				case T_TEXTIMAGE_ON:
				case T_THEN:
				case T_TIMESTAMP:
				case T_TITLE:
				case T_TO:
				case T_TOP:
				case T_TRANSACTION:
				case T_TRUE:
				case T_TRUNCATE:
				case T_UNIQUE:
				case T_UPDATE:
				case T_UR:
				case T_USE:
				case T_USING:
				case T_VALUE:
				case T_VALUES:
				case T_VAR:
				case T_VARCHAR:
				case T_VARCHAR2:
				case T_VARYING:
				case T_VOLATILE:
				case T_WHILE:
				case T_WITH:
				case T_WITHOUT:
				case T_WORK:
				case T_XACT_ABORT:
				case T_XML:
				case T_YES:
				case T_ACTIVITY_COUNT:
				case T_CUME_DIST:
				case T_CURRENT_DATE:
				case T_CURRENT_TIMESTAMP:
				case T_CURRENT_USER:
				case T_DENSE_RANK:
				case T_FIRST_VALUE:
				case T_LAG:
				case T_LAST_VALUE:
				case T_LEAD:
				case T_MAX_PART_STRING:
				case T_MIN_PART_STRING:
				case T_MAX_PART_INT:
				case T_MIN_PART_INT:
				case T_MAX_PART_DATE:
				case T_MIN_PART_DATE:
				case T_PART_COUNT:
				case T_PART_LOC:
				case T_RANK:
				case T_ROW_NUMBER:
				case T_STDEV:
				case T_SYSDATE:
				case T_VARIANCE:
				case T_USER:
				case T_ADD:
				case T_OPEN_P:
				case T_SUB:
				case L_ID:
				case L_S_STRING:
				case L_D_STRING:
				case L_INT:
				case L_DEC:
					{
					{
					setState(2162);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
					case 1:
						{
						setState(2161);
						expr_func_all_distinct();
						}
						break;
					}
					setState(2164);
					expr(0);
					}
					}
					break;
				case T_MUL:
					{
					setState(2165);
					match(T_MUL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2168);
				match(T_CLOSE_P);
				setState(2170);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
				case 1:
					{
					setState(2169);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_COUNT_BIG:
				enterOuterAlt(_localctx, 3);
				{
				setState(2172);
				match(T_COUNT_BIG);
				setState(2173);
				match(T_OPEN_P);
				setState(2179);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_ACTION:
				case T_ADD2:
				case T_ALL:
				case T_ALLOCATE:
				case T_ALTER:
				case T_AND:
				case T_ANSI_NULLS:
				case T_ANSI_PADDING:
				case T_AS:
				case T_ASC:
				case T_ASSOCIATE:
				case T_AT:
				case T_AUTO_INCREMENT:
				case T_AVG:
				case T_BATCHSIZE:
				case T_BEGIN:
				case T_BETWEEN:
				case T_BIGINT:
				case T_BINARY_DOUBLE:
				case T_BINARY_FLOAT:
				case T_BIT:
				case T_BODY:
				case T_BREAK:
				case T_BY:
				case T_BYTE:
				case T_CALL:
				case T_CALLER:
				case T_CASCADE:
				case T_CASE:
				case T_CASESPECIFIC:
				case T_CAST:
				case T_CHAR:
				case T_CHARACTER:
				case T_CHARSET:
				case T_CLIENT:
				case T_CLOSE:
				case T_CLUSTERED:
				case T_CMP:
				case T_COLLECT:
				case T_COLLECTION:
				case T_COLUMN:
				case T_COMMENT:
				case T_CONSTANT:
				case T_COMMIT:
				case T_COMPRESS:
				case T_CONCAT:
				case T_CONDITION:
				case T_CONSTRAINT:
				case T_CONTINUE:
				case T_COPY:
				case T_COUNT:
				case T_COUNT_BIG:
				case T_CREATE:
				case T_CREATION:
				case T_CREATOR:
				case T_CS:
				case T_CURRENT:
				case T_CURRENT_SCHEMA:
				case T_CURSOR:
				case T_DATABASE:
				case T_DATA:
				case T_DATE:
				case T_DATETIME:
				case T_DAY:
				case T_DAYS:
				case T_DEC:
				case T_DECIMAL:
				case T_DECLARE:
				case T_DEFAULT:
				case T_DEFERRED:
				case T_DEFINED:
				case T_DEFINER:
				case T_DEFINITION:
				case T_DELETE:
				case T_DELIMITED:
				case T_DELIMITER:
				case T_DESC:
				case T_DESCRIBE:
				case T_DIAGNOSTICS:
				case T_DIR:
				case T_DIRECTORY:
				case T_DISTINCT:
				case T_DISTRIBUTE:
				case T_DO:
				case T_DOUBLE:
				case T_DROP:
				case T_DYNAMIC:
				case T_ENABLE:
				case T_ENGINE:
				case T_ESCAPED:
				case T_EXCEPT:
				case T_EXEC:
				case T_EXECUTE:
				case T_EXCEPTION:
				case T_EXCLUSIVE:
				case T_EXISTS:
				case T_EXIT:
				case T_FALLBACK:
				case T_FALSE:
				case T_FETCH:
				case T_FIELDS:
				case T_FILE:
				case T_FILES:
				case T_FLOAT:
				case T_FOR:
				case T_FOREIGN:
				case T_FORMAT:
				case T_FOUND:
				case T_FROM:
				case T_FULL:
				case T_FUNCTION:
				case T_GET:
				case T_GLOBAL:
				case T_GO:
				case T_GRANT:
				case T_GROUP:
				case T_HANDLER:
				case T_HASH:
				case T_HAVING:
				case T_HDFS:
				case T_HIVE:
				case T_HOST:
				case T_IDENTITY:
				case T_IF:
				case T_IGNORE:
				case T_IMMEDIATE:
				case T_IN:
				case T_INCLUDE:
				case T_INDEX:
				case T_INITRANS:
				case T_INNER:
				case T_INOUT:
				case T_INSERT:
				case T_INT2:
				case T_INT4:
				case T_INT8:
				case T_INTEGER:
				case T_INTERSECT:
				case T_INTERVAL:
				case T_INTO:
				case T_INVOKER:
				case T_IS:
				case T_ISOPEN:
				case T_ITEMS:
				case T_JOIN:
				case T_KEEP:
				case T_KEY:
				case T_KEYS:
				case T_LANGUAGE:
				case T_LEAVE:
				case T_LEFT:
				case T_LIKE:
				case T_LIMIT:
				case T_LINES:
				case T_LOCAL:
				case T_LOCATION:
				case T_LOCATOR:
				case T_LOCATORS:
				case T_LOCKS:
				case T_LOG:
				case T_LOGGED:
				case T_LOGGING:
				case T_LOOP:
				case T_MAP:
				case T_MATCHED:
				case T_MAX:
				case T_MAXTRANS:
				case T_MERGE:
				case T_MESSAGE_TEXT:
				case T_MICROSECOND:
				case T_MICROSECONDS:
				case T_MIN:
				case T_MULTISET:
				case T_NCHAR:
				case T_NEW:
				case T_NVARCHAR:
				case T_NO:
				case T_NOCOUNT:
				case T_NOCOMPRESS:
				case T_NOLOGGING:
				case T_NONE:
				case T_NOT:
				case T_NOTFOUND:
				case T_NULL:
				case T_NUMERIC:
				case T_NUMBER:
				case T_OBJECT:
				case T_OFF:
				case T_ON:
				case T_ONLY:
				case T_OPEN:
				case T_OR:
				case T_ORDER:
				case T_OUT:
				case T_OUTER:
				case T_OVER:
				case T_OVERWRITE:
				case T_OWNER:
				case T_PACKAGE:
				case T_PARTITION:
				case T_PCTFREE:
				case T_PCTUSED:
				case T_PRECISION:
				case T_PRESERVE:
				case T_PRIMARY:
				case T_PRINT:
				case T_PROC:
				case T_PROCEDURE:
				case T_QUALIFY:
				case T_QUERY_BAND:
				case T_QUIT:
				case T_QUOTED_IDENTIFIER:
				case T_RAISE:
				case T_REFERENCES:
				case T_REGEXP:
				case T_REPLACE:
				case T_RESIGNAL:
				case T_RESTRICT:
				case T_RESULT:
				case T_RESULT_SET_LOCATOR:
				case T_RETURN:
				case T_RETURNS:
				case T_REVERSE:
				case T_RIGHT:
				case T_RLIKE:
				case T_ROLE:
				case T_ROLLBACK:
				case T_ROW:
				case T_ROWS:
				case T_ROW_COUNT:
				case T_RR:
				case T_RS:
				case T_PWD:
				case T_TRIM:
				case T_SCHEMA:
				case T_SECOND:
				case T_SECONDS:
				case T_SECURITY:
				case T_SEGMENT:
				case T_SEL:
				case T_SELECT:
				case T_SET:
				case T_SESSION:
				case T_SESSIONS:
				case T_SETS:
				case T_SHARE:
				case T_SIGNAL:
				case T_SIMPLE_DOUBLE:
				case T_SIMPLE_FLOAT:
				case T_SMALLDATETIME:
				case T_SMALLINT:
				case T_SQL:
				case T_SQLEXCEPTION:
				case T_SQLINSERT:
				case T_SQLSTATE:
				case T_SQLWARNING:
				case T_STATS:
				case T_STATISTICS:
				case T_STEP:
				case T_STORAGE:
				case T_STORED:
				case T_SUBDIR:
				case T_SUBSTRING:
				case T_SUM:
				case T_SUMMARY:
				case T_SYS_REFCURSOR:
				case T_TABLE:
				case T_TABLESPACE:
				case T_TEMPORARY:
				case T_TERMINATED:
				case T_TEXTIMAGE_ON:
				case T_THEN:
				case T_TIMESTAMP:
				case T_TITLE:
				case T_TO:
				case T_TOP:
				case T_TRANSACTION:
				case T_TRUE:
				case T_TRUNCATE:
				case T_UNIQUE:
				case T_UPDATE:
				case T_UR:
				case T_USE:
				case T_USING:
				case T_VALUE:
				case T_VALUES:
				case T_VAR:
				case T_VARCHAR:
				case T_VARCHAR2:
				case T_VARYING:
				case T_VOLATILE:
				case T_WHILE:
				case T_WITH:
				case T_WITHOUT:
				case T_WORK:
				case T_XACT_ABORT:
				case T_XML:
				case T_YES:
				case T_ACTIVITY_COUNT:
				case T_CUME_DIST:
				case T_CURRENT_DATE:
				case T_CURRENT_TIMESTAMP:
				case T_CURRENT_USER:
				case T_DENSE_RANK:
				case T_FIRST_VALUE:
				case T_LAG:
				case T_LAST_VALUE:
				case T_LEAD:
				case T_MAX_PART_STRING:
				case T_MIN_PART_STRING:
				case T_MAX_PART_INT:
				case T_MIN_PART_INT:
				case T_MAX_PART_DATE:
				case T_MIN_PART_DATE:
				case T_PART_COUNT:
				case T_PART_LOC:
				case T_RANK:
				case T_ROW_NUMBER:
				case T_STDEV:
				case T_SYSDATE:
				case T_VARIANCE:
				case T_USER:
				case T_ADD:
				case T_OPEN_P:
				case T_SUB:
				case L_ID:
				case L_S_STRING:
				case L_D_STRING:
				case L_INT:
				case L_DEC:
					{
					{
					setState(2175);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
					case 1:
						{
						setState(2174);
						expr_func_all_distinct();
						}
						break;
					}
					setState(2177);
					expr(0);
					}
					}
					break;
				case T_MUL:
					{
					setState(2178);
					match(T_MUL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2181);
				match(T_CLOSE_P);
				setState(2183);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
				case 1:
					{
					setState(2182);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_CUME_DIST:
				enterOuterAlt(_localctx, 4);
				{
				setState(2185);
				match(T_CUME_DIST);
				setState(2186);
				match(T_OPEN_P);
				setState(2187);
				match(T_CLOSE_P);
				setState(2188);
				expr_func_over_clause();
				}
				break;
			case T_DENSE_RANK:
				enterOuterAlt(_localctx, 5);
				{
				setState(2189);
				match(T_DENSE_RANK);
				setState(2190);
				match(T_OPEN_P);
				setState(2191);
				match(T_CLOSE_P);
				setState(2192);
				expr_func_over_clause();
				}
				break;
			case T_FIRST_VALUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(2193);
				match(T_FIRST_VALUE);
				setState(2194);
				match(T_OPEN_P);
				setState(2195);
				expr(0);
				setState(2196);
				match(T_CLOSE_P);
				setState(2197);
				expr_func_over_clause();
				}
				break;
			case T_LAG:
				enterOuterAlt(_localctx, 7);
				{
				setState(2199);
				match(T_LAG);
				setState(2200);
				match(T_OPEN_P);
				setState(2201);
				expr(0);
				setState(2208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2202);
					match(T_COMMA);
					setState(2203);
					expr(0);
					setState(2206);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_COMMA) {
						{
						setState(2204);
						match(T_COMMA);
						setState(2205);
						expr(0);
						}
					}

					}
				}

				setState(2210);
				match(T_CLOSE_P);
				setState(2211);
				expr_func_over_clause();
				}
				break;
			case T_LAST_VALUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(2213);
				match(T_LAST_VALUE);
				setState(2214);
				match(T_OPEN_P);
				setState(2215);
				expr(0);
				setState(2216);
				match(T_CLOSE_P);
				setState(2217);
				expr_func_over_clause();
				}
				break;
			case T_LEAD:
				enterOuterAlt(_localctx, 9);
				{
				setState(2219);
				match(T_LEAD);
				setState(2220);
				match(T_OPEN_P);
				setState(2221);
				expr(0);
				setState(2228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2222);
					match(T_COMMA);
					setState(2223);
					expr(0);
					setState(2226);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_COMMA) {
						{
						setState(2224);
						match(T_COMMA);
						setState(2225);
						expr(0);
						}
					}

					}
				}

				setState(2230);
				match(T_CLOSE_P);
				setState(2231);
				expr_func_over_clause();
				}
				break;
			case T_MAX:
				enterOuterAlt(_localctx, 10);
				{
				setState(2233);
				match(T_MAX);
				setState(2234);
				match(T_OPEN_P);
				setState(2236);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
				case 1:
					{
					setState(2235);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2238);
				expr(0);
				setState(2239);
				match(T_CLOSE_P);
				setState(2241);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,269,_ctx) ) {
				case 1:
					{
					setState(2240);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_MIN:
				enterOuterAlt(_localctx, 11);
				{
				setState(2243);
				match(T_MIN);
				setState(2244);
				match(T_OPEN_P);
				setState(2246);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,270,_ctx) ) {
				case 1:
					{
					setState(2245);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2248);
				expr(0);
				setState(2249);
				match(T_CLOSE_P);
				setState(2251);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,271,_ctx) ) {
				case 1:
					{
					setState(2250);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_RANK:
				enterOuterAlt(_localctx, 12);
				{
				setState(2253);
				match(T_RANK);
				setState(2254);
				match(T_OPEN_P);
				setState(2255);
				match(T_CLOSE_P);
				setState(2256);
				expr_func_over_clause();
				}
				break;
			case T_ROW_NUMBER:
				enterOuterAlt(_localctx, 13);
				{
				setState(2257);
				match(T_ROW_NUMBER);
				setState(2258);
				match(T_OPEN_P);
				setState(2259);
				match(T_CLOSE_P);
				setState(2260);
				expr_func_over_clause();
				}
				break;
			case T_STDEV:
				enterOuterAlt(_localctx, 14);
				{
				setState(2261);
				match(T_STDEV);
				setState(2262);
				match(T_OPEN_P);
				setState(2264);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,272,_ctx) ) {
				case 1:
					{
					setState(2263);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2266);
				expr(0);
				setState(2267);
				match(T_CLOSE_P);
				setState(2269);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
				case 1:
					{
					setState(2268);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_SUM:
				enterOuterAlt(_localctx, 15);
				{
				setState(2271);
				match(T_SUM);
				setState(2272);
				match(T_OPEN_P);
				setState(2274);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
				case 1:
					{
					setState(2273);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2276);
				expr(0);
				setState(2277);
				match(T_CLOSE_P);
				setState(2279);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
				case 1:
					{
					setState(2278);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_VAR:
				enterOuterAlt(_localctx, 16);
				{
				setState(2281);
				match(T_VAR);
				setState(2282);
				match(T_OPEN_P);
				setState(2284);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
				case 1:
					{
					setState(2283);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2286);
				expr(0);
				setState(2287);
				match(T_CLOSE_P);
				setState(2289);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,277,_ctx) ) {
				case 1:
					{
					setState(2288);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_VARIANCE:
				enterOuterAlt(_localctx, 17);
				{
				setState(2291);
				match(T_VARIANCE);
				setState(2292);
				match(T_OPEN_P);
				setState(2294);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
				case 1:
					{
					setState(2293);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2296);
				expr(0);
				setState(2297);
				match(T_CLOSE_P);
				setState(2299);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
				case 1:
					{
					setState(2298);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_func_all_distinctContext extends ParserRuleContext {
		public TerminalNode T_ALL() { return getToken(HplsqlParser.T_ALL, 0); }
		public TerminalNode T_DISTINCT() { return getToken(HplsqlParser.T_DISTINCT, 0); }
		public Expr_func_all_distinctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func_all_distinct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_func_all_distinct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_func_all_distinct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_func_all_distinct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_func_all_distinctContext expr_func_all_distinct() throws RecognitionException {
		Expr_func_all_distinctContext _localctx = new Expr_func_all_distinctContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_expr_func_all_distinct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2303);
			_la = _input.LA(1);
			if ( !(_la==T_ALL || _la==T_DISTINCT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_func_over_clauseContext extends ParserRuleContext {
		public TerminalNode T_OVER() { return getToken(HplsqlParser.T_OVER, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Expr_func_partition_by_clauseContext expr_func_partition_by_clause() {
			return getRuleContext(Expr_func_partition_by_clauseContext.class,0);
		}
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public Expr_func_over_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func_over_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_func_over_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_func_over_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_func_over_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_func_over_clauseContext expr_func_over_clause() throws RecognitionException {
		Expr_func_over_clauseContext _localctx = new Expr_func_over_clauseContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_expr_func_over_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2305);
			match(T_OVER);
			setState(2306);
			match(T_OPEN_P);
			setState(2308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_PARTITION) {
				{
				setState(2307);
				expr_func_partition_by_clause();
				}
			}

			setState(2311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ORDER) {
				{
				setState(2310);
				order_by_clause();
				}
			}

			setState(2313);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_func_partition_by_clauseContext extends ParserRuleContext {
		public TerminalNode T_PARTITION() { return getToken(HplsqlParser.T_PARTITION, 0); }
		public TerminalNode T_BY() { return getToken(HplsqlParser.T_BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Expr_func_partition_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func_partition_by_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_func_partition_by_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_func_partition_by_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_func_partition_by_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_func_partition_by_clauseContext expr_func_partition_by_clause() throws RecognitionException {
		Expr_func_partition_by_clauseContext _localctx = new Expr_func_partition_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_expr_func_partition_by_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2315);
			match(T_PARTITION);
			setState(2316);
			match(T_BY);
			setState(2317);
			expr(0);
			setState(2322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2318);
				match(T_COMMA);
				setState(2319);
				expr(0);
				}
				}
				setState(2324);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_spec_funcContext extends ParserRuleContext {
		public TerminalNode T_ACTIVITY_COUNT() { return getToken(HplsqlParser.T_ACTIVITY_COUNT, 0); }
		public TerminalNode T_CAST() { return getToken(HplsqlParser.T_CAST, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Dtype_lenContext dtype_len() {
			return getRuleContext(Dtype_lenContext.class,0);
		}
		public TerminalNode T_COUNT() { return getToken(HplsqlParser.T_COUNT, 0); }
		public TerminalNode T_CURRENT_DATE() { return getToken(HplsqlParser.T_CURRENT_DATE, 0); }
		public TerminalNode T_CURRENT() { return getToken(HplsqlParser.T_CURRENT, 0); }
		public TerminalNode T_DATE() { return getToken(HplsqlParser.T_DATE, 0); }
		public TerminalNode T_CURRENT_TIMESTAMP() { return getToken(HplsqlParser.T_CURRENT_TIMESTAMP, 0); }
		public TerminalNode T_TIMESTAMP() { return getToken(HplsqlParser.T_TIMESTAMP, 0); }
		public TerminalNode T_CURRENT_USER() { return getToken(HplsqlParser.T_CURRENT_USER, 0); }
		public TerminalNode T_USER() { return getToken(HplsqlParser.T_USER, 0); }
		public TerminalNode T_MAX_PART_STRING() { return getToken(HplsqlParser.T_MAX_PART_STRING, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public List<TerminalNode> T_EQUAL() { return getTokens(HplsqlParser.T_EQUAL); }
		public TerminalNode T_EQUAL(int i) {
			return getToken(HplsqlParser.T_EQUAL, i);
		}
		public TerminalNode T_MIN_PART_STRING() { return getToken(HplsqlParser.T_MIN_PART_STRING, 0); }
		public TerminalNode T_MAX_PART_INT() { return getToken(HplsqlParser.T_MAX_PART_INT, 0); }
		public TerminalNode T_MIN_PART_INT() { return getToken(HplsqlParser.T_MIN_PART_INT, 0); }
		public TerminalNode T_MAX_PART_DATE() { return getToken(HplsqlParser.T_MAX_PART_DATE, 0); }
		public TerminalNode T_MIN_PART_DATE() { return getToken(HplsqlParser.T_MIN_PART_DATE, 0); }
		public TerminalNode T_PART_COUNT() { return getToken(HplsqlParser.T_PART_COUNT, 0); }
		public TerminalNode T_PART_LOC() { return getToken(HplsqlParser.T_PART_LOC, 0); }
		public TerminalNode T_TRIM() { return getToken(HplsqlParser.T_TRIM, 0); }
		public TerminalNode T_SUBSTRING() { return getToken(HplsqlParser.T_SUBSTRING, 0); }
		public TerminalNode T_FROM() { return getToken(HplsqlParser.T_FROM, 0); }
		public TerminalNode T_FOR() { return getToken(HplsqlParser.T_FOR, 0); }
		public TerminalNode T_SYSDATE() { return getToken(HplsqlParser.T_SYSDATE, 0); }
		public Expr_spec_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_spec_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_spec_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_spec_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_spec_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_spec_funcContext expr_spec_func() throws RecognitionException {
		Expr_spec_funcContext _localctx = new Expr_spec_funcContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_expr_spec_func);
		int _la;
		try {
			int _alt;
			setState(2525);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,304,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2325);
				match(T_ACTIVITY_COUNT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2326);
				match(T_CAST);
				setState(2327);
				match(T_OPEN_P);
				setState(2328);
				expr(0);
				setState(2329);
				match(T_AS);
				setState(2330);
				dtype();
				setState(2332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(2331);
					dtype_len();
					}
				}

				setState(2334);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2336);
				match(T_COUNT);
				setState(2337);
				match(T_OPEN_P);
				setState(2340);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_ACTION:
				case T_ADD2:
				case T_ALL:
				case T_ALLOCATE:
				case T_ALTER:
				case T_AND:
				case T_ANSI_NULLS:
				case T_ANSI_PADDING:
				case T_AS:
				case T_ASC:
				case T_ASSOCIATE:
				case T_AT:
				case T_AUTO_INCREMENT:
				case T_AVG:
				case T_BATCHSIZE:
				case T_BEGIN:
				case T_BETWEEN:
				case T_BIGINT:
				case T_BINARY_DOUBLE:
				case T_BINARY_FLOAT:
				case T_BIT:
				case T_BODY:
				case T_BREAK:
				case T_BY:
				case T_BYTE:
				case T_CALL:
				case T_CALLER:
				case T_CASCADE:
				case T_CASE:
				case T_CASESPECIFIC:
				case T_CAST:
				case T_CHAR:
				case T_CHARACTER:
				case T_CHARSET:
				case T_CLIENT:
				case T_CLOSE:
				case T_CLUSTERED:
				case T_CMP:
				case T_COLLECT:
				case T_COLLECTION:
				case T_COLUMN:
				case T_COMMENT:
				case T_CONSTANT:
				case T_COMMIT:
				case T_COMPRESS:
				case T_CONCAT:
				case T_CONDITION:
				case T_CONSTRAINT:
				case T_CONTINUE:
				case T_COPY:
				case T_COUNT:
				case T_COUNT_BIG:
				case T_CREATE:
				case T_CREATION:
				case T_CREATOR:
				case T_CS:
				case T_CURRENT:
				case T_CURRENT_SCHEMA:
				case T_CURSOR:
				case T_DATABASE:
				case T_DATA:
				case T_DATE:
				case T_DATETIME:
				case T_DAY:
				case T_DAYS:
				case T_DEC:
				case T_DECIMAL:
				case T_DECLARE:
				case T_DEFAULT:
				case T_DEFERRED:
				case T_DEFINED:
				case T_DEFINER:
				case T_DEFINITION:
				case T_DELETE:
				case T_DELIMITED:
				case T_DELIMITER:
				case T_DESC:
				case T_DESCRIBE:
				case T_DIAGNOSTICS:
				case T_DIR:
				case T_DIRECTORY:
				case T_DISTINCT:
				case T_DISTRIBUTE:
				case T_DO:
				case T_DOUBLE:
				case T_DROP:
				case T_DYNAMIC:
				case T_ENABLE:
				case T_ENGINE:
				case T_ESCAPED:
				case T_EXCEPT:
				case T_EXEC:
				case T_EXECUTE:
				case T_EXCEPTION:
				case T_EXCLUSIVE:
				case T_EXISTS:
				case T_EXIT:
				case T_FALLBACK:
				case T_FALSE:
				case T_FETCH:
				case T_FIELDS:
				case T_FILE:
				case T_FILES:
				case T_FLOAT:
				case T_FOR:
				case T_FOREIGN:
				case T_FORMAT:
				case T_FOUND:
				case T_FROM:
				case T_FULL:
				case T_FUNCTION:
				case T_GET:
				case T_GLOBAL:
				case T_GO:
				case T_GRANT:
				case T_GROUP:
				case T_HANDLER:
				case T_HASH:
				case T_HAVING:
				case T_HDFS:
				case T_HIVE:
				case T_HOST:
				case T_IDENTITY:
				case T_IF:
				case T_IGNORE:
				case T_IMMEDIATE:
				case T_IN:
				case T_INCLUDE:
				case T_INDEX:
				case T_INITRANS:
				case T_INNER:
				case T_INOUT:
				case T_INSERT:
				case T_INT2:
				case T_INT4:
				case T_INT8:
				case T_INTEGER:
				case T_INTERSECT:
				case T_INTERVAL:
				case T_INTO:
				case T_INVOKER:
				case T_IS:
				case T_ISOPEN:
				case T_ITEMS:
				case T_JOIN:
				case T_KEEP:
				case T_KEY:
				case T_KEYS:
				case T_LANGUAGE:
				case T_LEAVE:
				case T_LEFT:
				case T_LIKE:
				case T_LIMIT:
				case T_LINES:
				case T_LOCAL:
				case T_LOCATION:
				case T_LOCATOR:
				case T_LOCATORS:
				case T_LOCKS:
				case T_LOG:
				case T_LOGGED:
				case T_LOGGING:
				case T_LOOP:
				case T_MAP:
				case T_MATCHED:
				case T_MAX:
				case T_MAXTRANS:
				case T_MERGE:
				case T_MESSAGE_TEXT:
				case T_MICROSECOND:
				case T_MICROSECONDS:
				case T_MIN:
				case T_MULTISET:
				case T_NCHAR:
				case T_NEW:
				case T_NVARCHAR:
				case T_NO:
				case T_NOCOUNT:
				case T_NOCOMPRESS:
				case T_NOLOGGING:
				case T_NONE:
				case T_NOT:
				case T_NOTFOUND:
				case T_NULL:
				case T_NUMERIC:
				case T_NUMBER:
				case T_OBJECT:
				case T_OFF:
				case T_ON:
				case T_ONLY:
				case T_OPEN:
				case T_OR:
				case T_ORDER:
				case T_OUT:
				case T_OUTER:
				case T_OVER:
				case T_OVERWRITE:
				case T_OWNER:
				case T_PACKAGE:
				case T_PARTITION:
				case T_PCTFREE:
				case T_PCTUSED:
				case T_PRECISION:
				case T_PRESERVE:
				case T_PRIMARY:
				case T_PRINT:
				case T_PROC:
				case T_PROCEDURE:
				case T_QUALIFY:
				case T_QUERY_BAND:
				case T_QUIT:
				case T_QUOTED_IDENTIFIER:
				case T_RAISE:
				case T_REFERENCES:
				case T_REGEXP:
				case T_REPLACE:
				case T_RESIGNAL:
				case T_RESTRICT:
				case T_RESULT:
				case T_RESULT_SET_LOCATOR:
				case T_RETURN:
				case T_RETURNS:
				case T_REVERSE:
				case T_RIGHT:
				case T_RLIKE:
				case T_ROLE:
				case T_ROLLBACK:
				case T_ROW:
				case T_ROWS:
				case T_ROW_COUNT:
				case T_RR:
				case T_RS:
				case T_PWD:
				case T_TRIM:
				case T_SCHEMA:
				case T_SECOND:
				case T_SECONDS:
				case T_SECURITY:
				case T_SEGMENT:
				case T_SEL:
				case T_SELECT:
				case T_SET:
				case T_SESSION:
				case T_SESSIONS:
				case T_SETS:
				case T_SHARE:
				case T_SIGNAL:
				case T_SIMPLE_DOUBLE:
				case T_SIMPLE_FLOAT:
				case T_SMALLDATETIME:
				case T_SMALLINT:
				case T_SQL:
				case T_SQLEXCEPTION:
				case T_SQLINSERT:
				case T_SQLSTATE:
				case T_SQLWARNING:
				case T_STATS:
				case T_STATISTICS:
				case T_STEP:
				case T_STORAGE:
				case T_STORED:
				case T_SUBDIR:
				case T_SUBSTRING:
				case T_SUM:
				case T_SUMMARY:
				case T_SYS_REFCURSOR:
				case T_TABLE:
				case T_TABLESPACE:
				case T_TEMPORARY:
				case T_TERMINATED:
				case T_TEXTIMAGE_ON:
				case T_THEN:
				case T_TIMESTAMP:
				case T_TITLE:
				case T_TO:
				case T_TOP:
				case T_TRANSACTION:
				case T_TRUE:
				case T_TRUNCATE:
				case T_UNIQUE:
				case T_UPDATE:
				case T_UR:
				case T_USE:
				case T_USING:
				case T_VALUE:
				case T_VALUES:
				case T_VAR:
				case T_VARCHAR:
				case T_VARCHAR2:
				case T_VARYING:
				case T_VOLATILE:
				case T_WHILE:
				case T_WITH:
				case T_WITHOUT:
				case T_WORK:
				case T_XACT_ABORT:
				case T_XML:
				case T_YES:
				case T_ACTIVITY_COUNT:
				case T_CUME_DIST:
				case T_CURRENT_DATE:
				case T_CURRENT_TIMESTAMP:
				case T_CURRENT_USER:
				case T_DENSE_RANK:
				case T_FIRST_VALUE:
				case T_LAG:
				case T_LAST_VALUE:
				case T_LEAD:
				case T_MAX_PART_STRING:
				case T_MIN_PART_STRING:
				case T_MAX_PART_INT:
				case T_MIN_PART_INT:
				case T_MAX_PART_DATE:
				case T_MIN_PART_DATE:
				case T_PART_COUNT:
				case T_PART_LOC:
				case T_RANK:
				case T_ROW_NUMBER:
				case T_STDEV:
				case T_SYSDATE:
				case T_VARIANCE:
				case T_USER:
				case T_ADD:
				case T_OPEN_P:
				case T_SUB:
				case L_ID:
				case L_S_STRING:
				case L_D_STRING:
				case L_INT:
				case L_DEC:
					{
					setState(2338);
					expr(0);
					}
					break;
				case T_MUL:
					{
					setState(2339);
					match(T_MUL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2342);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2343);
				match(T_CURRENT_DATE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2344);
				match(T_CURRENT);
				setState(2345);
				match(T_DATE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2349);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_CURRENT_TIMESTAMP:
					{
					setState(2346);
					match(T_CURRENT_TIMESTAMP);
					}
					break;
				case T_CURRENT:
					{
					setState(2347);
					match(T_CURRENT);
					setState(2348);
					match(T_TIMESTAMP);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2355);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
				case 1:
					{
					setState(2351);
					match(T_OPEN_P);
					setState(2352);
					expr(0);
					setState(2353);
					match(T_CLOSE_P);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2357);
				match(T_CURRENT_USER);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2358);
				match(T_CURRENT);
				setState(2359);
				match(T_USER);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2360);
				match(T_MAX_PART_STRING);
				setState(2361);
				match(T_OPEN_P);
				setState(2362);
				expr(0);
				setState(2375);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2363);
					match(T_COMMA);
					setState(2364);
					expr(0);
					setState(2372);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2365);
						match(T_COMMA);
						setState(2366);
						expr(0);
						setState(2367);
						match(T_EQUAL);
						setState(2368);
						expr(0);
						}
						}
						setState(2374);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2377);
				match(T_CLOSE_P);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2379);
				match(T_MIN_PART_STRING);
				setState(2380);
				match(T_OPEN_P);
				setState(2381);
				expr(0);
				setState(2394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2382);
					match(T_COMMA);
					setState(2383);
					expr(0);
					setState(2391);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2384);
						match(T_COMMA);
						setState(2385);
						expr(0);
						setState(2386);
						match(T_EQUAL);
						setState(2387);
						expr(0);
						}
						}
						setState(2393);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2396);
				match(T_CLOSE_P);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2398);
				match(T_MAX_PART_INT);
				setState(2399);
				match(T_OPEN_P);
				setState(2400);
				expr(0);
				setState(2413);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2401);
					match(T_COMMA);
					setState(2402);
					expr(0);
					setState(2410);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2403);
						match(T_COMMA);
						setState(2404);
						expr(0);
						setState(2405);
						match(T_EQUAL);
						setState(2406);
						expr(0);
						}
						}
						setState(2412);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2415);
				match(T_CLOSE_P);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2417);
				match(T_MIN_PART_INT);
				setState(2418);
				match(T_OPEN_P);
				setState(2419);
				expr(0);
				setState(2432);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2420);
					match(T_COMMA);
					setState(2421);
					expr(0);
					setState(2429);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2422);
						match(T_COMMA);
						setState(2423);
						expr(0);
						setState(2424);
						match(T_EQUAL);
						setState(2425);
						expr(0);
						}
						}
						setState(2431);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2434);
				match(T_CLOSE_P);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2436);
				match(T_MAX_PART_DATE);
				setState(2437);
				match(T_OPEN_P);
				setState(2438);
				expr(0);
				setState(2451);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2439);
					match(T_COMMA);
					setState(2440);
					expr(0);
					setState(2448);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2441);
						match(T_COMMA);
						setState(2442);
						expr(0);
						setState(2443);
						match(T_EQUAL);
						setState(2444);
						expr(0);
						}
						}
						setState(2450);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2453);
				match(T_CLOSE_P);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2455);
				match(T_MIN_PART_DATE);
				setState(2456);
				match(T_OPEN_P);
				setState(2457);
				expr(0);
				setState(2470);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2458);
					match(T_COMMA);
					setState(2459);
					expr(0);
					setState(2467);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2460);
						match(T_COMMA);
						setState(2461);
						expr(0);
						setState(2462);
						match(T_EQUAL);
						setState(2463);
						expr(0);
						}
						}
						setState(2469);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2472);
				match(T_CLOSE_P);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2474);
				match(T_PART_COUNT);
				setState(2475);
				match(T_OPEN_P);
				setState(2476);
				expr(0);
				setState(2484);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2477);
					match(T_COMMA);
					setState(2478);
					expr(0);
					setState(2479);
					match(T_EQUAL);
					setState(2480);
					expr(0);
					}
					}
					setState(2486);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2487);
				match(T_CLOSE_P);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2489);
				match(T_PART_LOC);
				setState(2490);
				match(T_OPEN_P);
				setState(2491);
				expr(0);
				setState(2497); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2492);
						match(T_COMMA);
						setState(2493);
						expr(0);
						setState(2494);
						match(T_EQUAL);
						setState(2495);
						expr(0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2499); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,301,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(2503);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2501);
					match(T_COMMA);
					setState(2502);
					expr(0);
					}
				}

				setState(2505);
				match(T_CLOSE_P);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2507);
				match(T_TRIM);
				setState(2508);
				match(T_OPEN_P);
				setState(2509);
				expr(0);
				setState(2510);
				match(T_CLOSE_P);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2512);
				match(T_SUBSTRING);
				setState(2513);
				match(T_OPEN_P);
				setState(2514);
				expr(0);
				setState(2515);
				match(T_FROM);
				setState(2516);
				expr(0);
				setState(2519);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_FOR) {
					{
					setState(2517);
					match(T_FOR);
					setState(2518);
					expr(0);
					}
				}

				setState(2521);
				match(T_CLOSE_P);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2523);
				match(T_SYSDATE);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2524);
				match(T_USER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_funcContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Expr_func_paramsContext expr_func_params() {
			return getRuleContext(Expr_func_paramsContext.class,0);
		}
		public Expr_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_funcContext expr_func() throws RecognitionException {
		Expr_funcContext _localctx = new Expr_funcContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_expr_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2527);
			ident();
			setState(2528);
			match(T_OPEN_P);
			setState(2530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_ADD2) | (1L << T_ALL) | (1L << T_ALLOCATE) | (1L << T_ALTER) | (1L << T_AND) | (1L << T_ANSI_NULLS) | (1L << T_ANSI_PADDING) | (1L << T_AS) | (1L << T_ASC) | (1L << T_ASSOCIATE) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BATCHSIZE) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CALLER) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLIENT) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECT) | (1L << T_COLLECTION) | (1L << T_COLUMN) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMMIT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COPY) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CREATION) | (1L << T_CREATOR) | (1L << T_CS) | (1L << T_CURRENT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_CURRENT_SCHEMA - 64)) | (1L << (T_CURSOR - 64)) | (1L << (T_DATABASE - 64)) | (1L << (T_DATA - 64)) | (1L << (T_DATE - 64)) | (1L << (T_DATETIME - 64)) | (1L << (T_DAY - 64)) | (1L << (T_DAYS - 64)) | (1L << (T_DEC - 64)) | (1L << (T_DECIMAL - 64)) | (1L << (T_DECLARE - 64)) | (1L << (T_DEFAULT - 64)) | (1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DELIMITER - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DESCRIBE - 64)) | (1L << (T_DIAGNOSTICS - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DIRECTORY - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DO - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DROP - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXEC - 64)) | (1L << (T_EXECUTE - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FETCH - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FILE - 64)) | (1L << (T_FILES - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GET - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)) | (1L << (T_GRANT - 64)) | (1L << (T_GROUP - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_HANDLER - 128)) | (1L << (T_HASH - 128)) | (1L << (T_HAVING - 128)) | (1L << (T_HDFS - 128)) | (1L << (T_HIVE - 128)) | (1L << (T_HOST - 128)) | (1L << (T_IDENTITY - 128)) | (1L << (T_IF - 128)) | (1L << (T_IGNORE - 128)) | (1L << (T_IMMEDIATE - 128)) | (1L << (T_IN - 128)) | (1L << (T_INCLUDE - 128)) | (1L << (T_INDEX - 128)) | (1L << (T_INITRANS - 128)) | (1L << (T_INNER - 128)) | (1L << (T_INOUT - 128)) | (1L << (T_INSERT - 128)) | (1L << (T_INT2 - 128)) | (1L << (T_INT4 - 128)) | (1L << (T_INT8 - 128)) | (1L << (T_INTEGER - 128)) | (1L << (T_INTERSECT - 128)) | (1L << (T_INTERVAL - 128)) | (1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCATOR - 128)) | (1L << (T_LOCATORS - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MATCHED - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MERGE - 128)) | (1L << (T_MESSAGE_TEXT - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NEW - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)) | (1L << (T_NOCOUNT - 128)) | (1L << (T_NOCOMPRESS - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_NOLOGGING - 192)) | (1L << (T_NONE - 192)) | (1L << (T_NOT - 192)) | (1L << (T_NOTFOUND - 192)) | (1L << (T_NULL - 192)) | (1L << (T_NUMERIC - 192)) | (1L << (T_NUMBER - 192)) | (1L << (T_OBJECT - 192)) | (1L << (T_OFF - 192)) | (1L << (T_ON - 192)) | (1L << (T_ONLY - 192)) | (1L << (T_OPEN - 192)) | (1L << (T_OR - 192)) | (1L << (T_ORDER - 192)) | (1L << (T_OUT - 192)) | (1L << (T_OUTER - 192)) | (1L << (T_OVER - 192)) | (1L << (T_OVERWRITE - 192)) | (1L << (T_OWNER - 192)) | (1L << (T_PACKAGE - 192)) | (1L << (T_PARTITION - 192)) | (1L << (T_PCTFREE - 192)) | (1L << (T_PCTUSED - 192)) | (1L << (T_PRECISION - 192)) | (1L << (T_PRESERVE - 192)) | (1L << (T_PRIMARY - 192)) | (1L << (T_PRINT - 192)) | (1L << (T_PROC - 192)) | (1L << (T_PROCEDURE - 192)) | (1L << (T_QUALIFY - 192)) | (1L << (T_QUERY_BAND - 192)) | (1L << (T_QUIT - 192)) | (1L << (T_QUOTED_IDENTIFIER - 192)) | (1L << (T_RAISE - 192)) | (1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESIGNAL - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROLE - 192)) | (1L << (T_ROLLBACK - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)) | (1L << (T_ROW_COUNT - 192)) | (1L << (T_RR - 192)) | (1L << (T_RS - 192)) | (1L << (T_PWD - 192)) | (1L << (T_TRIM - 192)) | (1L << (T_SCHEMA - 192)) | (1L << (T_SECOND - 192)) | (1L << (T_SECONDS - 192)) | (1L << (T_SECURITY - 192)) | (1L << (T_SEGMENT - 192)) | (1L << (T_SEL - 192)) | (1L << (T_SELECT - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_SET - 256)) | (1L << (T_SESSION - 256)) | (1L << (T_SESSIONS - 256)) | (1L << (T_SETS - 256)) | (1L << (T_SHARE - 256)) | (1L << (T_SIGNAL - 256)) | (1L << (T_SIMPLE_DOUBLE - 256)) | (1L << (T_SIMPLE_FLOAT - 256)) | (1L << (T_SMALLDATETIME - 256)) | (1L << (T_SMALLINT - 256)) | (1L << (T_SQL - 256)) | (1L << (T_SQLEXCEPTION - 256)) | (1L << (T_SQLINSERT - 256)) | (1L << (T_SQLSTATE - 256)) | (1L << (T_SQLWARNING - 256)) | (1L << (T_STATS - 256)) | (1L << (T_STATISTICS - 256)) | (1L << (T_STEP - 256)) | (1L << (T_STORAGE - 256)) | (1L << (T_STORED - 256)) | (1L << (T_SUBDIR - 256)) | (1L << (T_SUBSTRING - 256)) | (1L << (T_SUM - 256)) | (1L << (T_SUMMARY - 256)) | (1L << (T_SYS_REFCURSOR - 256)) | (1L << (T_TABLE - 256)) | (1L << (T_TABLESPACE - 256)) | (1L << (T_TEMPORARY - 256)) | (1L << (T_TERMINATED - 256)) | (1L << (T_TEXTIMAGE_ON - 256)) | (1L << (T_THEN - 256)) | (1L << (T_TIMESTAMP - 256)) | (1L << (T_TITLE - 256)) | (1L << (T_TO - 256)) | (1L << (T_TOP - 256)) | (1L << (T_TRANSACTION - 256)) | (1L << (T_TRUE - 256)) | (1L << (T_TRUNCATE - 256)) | (1L << (T_UNIQUE - 256)) | (1L << (T_UPDATE - 256)) | (1L << (T_UR - 256)) | (1L << (T_USE - 256)) | (1L << (T_USING - 256)) | (1L << (T_VALUE - 256)) | (1L << (T_VALUES - 256)) | (1L << (T_VAR - 256)) | (1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_VARYING - 256)) | (1L << (T_VOLATILE - 256)) | (1L << (T_WHILE - 256)) | (1L << (T_WITH - 256)) | (1L << (T_WITHOUT - 256)) | (1L << (T_WORK - 256)) | (1L << (T_XACT_ABORT - 256)) | (1L << (T_XML - 256)) | (1L << (T_YES - 256)))) != 0) || ((((_la - 321)) & ~0x3f) == 0 && ((1L << (_la - 321)) & ((1L << (T_ACTIVITY_COUNT - 321)) | (1L << (T_CUME_DIST - 321)) | (1L << (T_CURRENT_DATE - 321)) | (1L << (T_CURRENT_TIMESTAMP - 321)) | (1L << (T_CURRENT_USER - 321)) | (1L << (T_DENSE_RANK - 321)) | (1L << (T_FIRST_VALUE - 321)) | (1L << (T_LAG - 321)) | (1L << (T_LAST_VALUE - 321)) | (1L << (T_LEAD - 321)) | (1L << (T_MAX_PART_STRING - 321)) | (1L << (T_MIN_PART_STRING - 321)) | (1L << (T_MAX_PART_INT - 321)) | (1L << (T_MIN_PART_INT - 321)) | (1L << (T_MAX_PART_DATE - 321)) | (1L << (T_MIN_PART_DATE - 321)) | (1L << (T_PART_COUNT - 321)) | (1L << (T_PART_LOC - 321)) | (1L << (T_RANK - 321)) | (1L << (T_ROW_NUMBER - 321)) | (1L << (T_STDEV - 321)) | (1L << (T_SYSDATE - 321)) | (1L << (T_VARIANCE - 321)) | (1L << (T_USER - 321)) | (1L << (T_ADD - 321)) | (1L << (T_OPEN_P - 321)) | (1L << (T_SUB - 321)) | (1L << (L_NUMBER - 321)) | (1L << (L_ID - 321)) | (1L << (L_S_STRING - 321)) | (1L << (L_D_STRING - 321)) | (1L << (L_INT - 321)) | (1L << (L_DEC - 321)))) != 0)) {
				{
				setState(2529);
				expr_func_params();
				}
			}

			setState(2532);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_func_paramsContext extends ParserRuleContext {
		public List<Func_paramContext> func_param() {
			return getRuleContexts(Func_paramContext.class);
		}
		public Func_paramContext func_param(int i) {
			return getRuleContext(Func_paramContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Expr_func_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_func_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_func_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_func_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_func_paramsContext expr_func_params() throws RecognitionException {
		Expr_func_paramsContext _localctx = new Expr_func_paramsContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_expr_func_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2534);
			func_param();
			setState(2539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2535);
				match(T_COMMA);
				setState(2536);
				func_param();
				}
				}
				setState(2541);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_paramContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode L_NUMBER() { return getToken(HplsqlParser.L_NUMBER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(HplsqlParser.T_EQUAL, 0); }
		public TerminalNode T_GREATER() { return getToken(HplsqlParser.T_GREATER, 0); }
		public Func_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFunc_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFunc_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFunc_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_paramContext func_param() throws RecognitionException {
		Func_paramContext _localctx = new Func_paramContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_func_param);
		int _la;
		try {
			setState(2554);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2544);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_ACTION:
				case T_ADD2:
				case T_ALL:
				case T_ALLOCATE:
				case T_ALTER:
				case T_AND:
				case T_ANSI_NULLS:
				case T_ANSI_PADDING:
				case T_AS:
				case T_ASC:
				case T_ASSOCIATE:
				case T_AT:
				case T_AUTO_INCREMENT:
				case T_AVG:
				case T_BATCHSIZE:
				case T_BEGIN:
				case T_BETWEEN:
				case T_BIGINT:
				case T_BINARY_DOUBLE:
				case T_BINARY_FLOAT:
				case T_BIT:
				case T_BODY:
				case T_BREAK:
				case T_BY:
				case T_BYTE:
				case T_CALL:
				case T_CALLER:
				case T_CASCADE:
				case T_CASE:
				case T_CASESPECIFIC:
				case T_CAST:
				case T_CHAR:
				case T_CHARACTER:
				case T_CHARSET:
				case T_CLIENT:
				case T_CLOSE:
				case T_CLUSTERED:
				case T_CMP:
				case T_COLLECT:
				case T_COLLECTION:
				case T_COLUMN:
				case T_COMMENT:
				case T_CONSTANT:
				case T_COMMIT:
				case T_COMPRESS:
				case T_CONCAT:
				case T_CONDITION:
				case T_CONSTRAINT:
				case T_CONTINUE:
				case T_COPY:
				case T_COUNT:
				case T_COUNT_BIG:
				case T_CREATE:
				case T_CREATION:
				case T_CREATOR:
				case T_CS:
				case T_CURRENT:
				case T_CURRENT_SCHEMA:
				case T_CURSOR:
				case T_DATABASE:
				case T_DATA:
				case T_DATE:
				case T_DATETIME:
				case T_DAY:
				case T_DAYS:
				case T_DEC:
				case T_DECIMAL:
				case T_DECLARE:
				case T_DEFAULT:
				case T_DEFERRED:
				case T_DEFINED:
				case T_DEFINER:
				case T_DEFINITION:
				case T_DELETE:
				case T_DELIMITED:
				case T_DELIMITER:
				case T_DESC:
				case T_DESCRIBE:
				case T_DIAGNOSTICS:
				case T_DIR:
				case T_DIRECTORY:
				case T_DISTINCT:
				case T_DISTRIBUTE:
				case T_DO:
				case T_DOUBLE:
				case T_DROP:
				case T_DYNAMIC:
				case T_ENABLE:
				case T_ENGINE:
				case T_ESCAPED:
				case T_EXCEPT:
				case T_EXEC:
				case T_EXECUTE:
				case T_EXCEPTION:
				case T_EXCLUSIVE:
				case T_EXISTS:
				case T_EXIT:
				case T_FALLBACK:
				case T_FALSE:
				case T_FETCH:
				case T_FIELDS:
				case T_FILE:
				case T_FILES:
				case T_FLOAT:
				case T_FOR:
				case T_FOREIGN:
				case T_FORMAT:
				case T_FOUND:
				case T_FROM:
				case T_FULL:
				case T_FUNCTION:
				case T_GET:
				case T_GLOBAL:
				case T_GO:
				case T_GRANT:
				case T_GROUP:
				case T_HANDLER:
				case T_HASH:
				case T_HAVING:
				case T_HDFS:
				case T_HIVE:
				case T_HOST:
				case T_IDENTITY:
				case T_IF:
				case T_IGNORE:
				case T_IMMEDIATE:
				case T_IN:
				case T_INCLUDE:
				case T_INDEX:
				case T_INITRANS:
				case T_INNER:
				case T_INOUT:
				case T_INSERT:
				case T_INT2:
				case T_INT4:
				case T_INT8:
				case T_INTEGER:
				case T_INTERSECT:
				case T_INTERVAL:
				case T_INTO:
				case T_INVOKER:
				case T_IS:
				case T_ISOPEN:
				case T_ITEMS:
				case T_JOIN:
				case T_KEEP:
				case T_KEY:
				case T_KEYS:
				case T_LANGUAGE:
				case T_LEAVE:
				case T_LEFT:
				case T_LIKE:
				case T_LIMIT:
				case T_LINES:
				case T_LOCAL:
				case T_LOCATION:
				case T_LOCATOR:
				case T_LOCATORS:
				case T_LOCKS:
				case T_LOG:
				case T_LOGGED:
				case T_LOGGING:
				case T_LOOP:
				case T_MAP:
				case T_MATCHED:
				case T_MAX:
				case T_MAXTRANS:
				case T_MERGE:
				case T_MESSAGE_TEXT:
				case T_MICROSECOND:
				case T_MICROSECONDS:
				case T_MIN:
				case T_MULTISET:
				case T_NCHAR:
				case T_NEW:
				case T_NVARCHAR:
				case T_NO:
				case T_NOCOUNT:
				case T_NOCOMPRESS:
				case T_NOLOGGING:
				case T_NONE:
				case T_NOT:
				case T_NOTFOUND:
				case T_NUMERIC:
				case T_NUMBER:
				case T_OBJECT:
				case T_OFF:
				case T_ON:
				case T_ONLY:
				case T_OPEN:
				case T_OR:
				case T_ORDER:
				case T_OUT:
				case T_OUTER:
				case T_OVER:
				case T_OVERWRITE:
				case T_OWNER:
				case T_PACKAGE:
				case T_PARTITION:
				case T_PCTFREE:
				case T_PCTUSED:
				case T_PRECISION:
				case T_PRESERVE:
				case T_PRIMARY:
				case T_PRINT:
				case T_PROC:
				case T_PROCEDURE:
				case T_QUALIFY:
				case T_QUERY_BAND:
				case T_QUIT:
				case T_QUOTED_IDENTIFIER:
				case T_RAISE:
				case T_REFERENCES:
				case T_REGEXP:
				case T_REPLACE:
				case T_RESIGNAL:
				case T_RESTRICT:
				case T_RESULT:
				case T_RESULT_SET_LOCATOR:
				case T_RETURN:
				case T_RETURNS:
				case T_REVERSE:
				case T_RIGHT:
				case T_RLIKE:
				case T_ROLE:
				case T_ROLLBACK:
				case T_ROW:
				case T_ROWS:
				case T_ROW_COUNT:
				case T_RR:
				case T_RS:
				case T_PWD:
				case T_TRIM:
				case T_SCHEMA:
				case T_SECOND:
				case T_SECONDS:
				case T_SECURITY:
				case T_SEGMENT:
				case T_SEL:
				case T_SELECT:
				case T_SET:
				case T_SESSION:
				case T_SESSIONS:
				case T_SETS:
				case T_SHARE:
				case T_SIGNAL:
				case T_SIMPLE_DOUBLE:
				case T_SIMPLE_FLOAT:
				case T_SMALLDATETIME:
				case T_SMALLINT:
				case T_SQL:
				case T_SQLEXCEPTION:
				case T_SQLINSERT:
				case T_SQLSTATE:
				case T_SQLWARNING:
				case T_STATS:
				case T_STATISTICS:
				case T_STEP:
				case T_STORAGE:
				case T_STORED:
				case T_SUBDIR:
				case T_SUBSTRING:
				case T_SUM:
				case T_SUMMARY:
				case T_SYS_REFCURSOR:
				case T_TABLE:
				case T_TABLESPACE:
				case T_TEMPORARY:
				case T_TERMINATED:
				case T_TEXTIMAGE_ON:
				case T_THEN:
				case T_TIMESTAMP:
				case T_TITLE:
				case T_TO:
				case T_TOP:
				case T_TRANSACTION:
				case T_TRUE:
				case T_TRUNCATE:
				case T_UNIQUE:
				case T_UPDATE:
				case T_UR:
				case T_USE:
				case T_USING:
				case T_VALUE:
				case T_VALUES:
				case T_VAR:
				case T_VARCHAR:
				case T_VARCHAR2:
				case T_VARYING:
				case T_VOLATILE:
				case T_WHILE:
				case T_WITH:
				case T_WITHOUT:
				case T_WORK:
				case T_XACT_ABORT:
				case T_XML:
				case T_YES:
				case T_ACTIVITY_COUNT:
				case T_CUME_DIST:
				case T_CURRENT_DATE:
				case T_CURRENT_TIMESTAMP:
				case T_CURRENT_USER:
				case T_DENSE_RANK:
				case T_FIRST_VALUE:
				case T_LAG:
				case T_LAST_VALUE:
				case T_LEAD:
				case T_PART_COUNT:
				case T_PART_LOC:
				case T_RANK:
				case T_ROW_NUMBER:
				case T_STDEV:
				case T_SYSDATE:
				case T_VARIANCE:
				case T_USER:
				case L_ID:
				case L_S_STRING:
				case L_D_STRING:
					{
					setState(2542);
					ident();
					}
					break;
				case L_NUMBER:
					{
					setState(2543);
					match(L_NUMBER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2551);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,309,_ctx) ) {
				case 1:
					{
					setState(2546);
					ident();
					setState(2547);
					match(T_EQUAL);
					setState(2549);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_GREATER) {
						{
						setState(2548);
						match(T_GREATER);
						}
					}

					}
					break;
				}
				setState(2553);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Date_literalContext extends ParserRuleContext {
		public TerminalNode T_DATE() { return getToken(HplsqlParser.T_DATE, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Date_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDate_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDate_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDate_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Date_literalContext date_literal() throws RecognitionException {
		Date_literalContext _localctx = new Date_literalContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_date_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2556);
			match(T_DATE);
			setState(2557);
			string();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Timestamp_literalContext extends ParserRuleContext {
		public TerminalNode T_TIMESTAMP() { return getToken(HplsqlParser.T_TIMESTAMP, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Timestamp_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timestamp_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterTimestamp_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitTimestamp_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitTimestamp_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Timestamp_literalContext timestamp_literal() throws RecognitionException {
		Timestamp_literalContext _localctx = new Timestamp_literalContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_timestamp_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2559);
			match(T_TIMESTAMP);
			setState(2560);
			string();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public List<TerminalNode> L_ID() { return getTokens(HplsqlParser.L_ID); }
		public TerminalNode L_ID(int i) {
			return getToken(HplsqlParser.L_ID, i);
		}
		public List<Non_reserved_wordsContext> non_reserved_words() {
			return getRuleContexts(Non_reserved_wordsContext.class);
		}
		public Non_reserved_wordsContext non_reserved_words(int i) {
			return getRuleContext(Non_reserved_wordsContext.class,i);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_ident);
		try {
			int _alt;
			setState(2580);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_S_STRING:
			case L_D_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(2562);
				string();
				}
				break;
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALLOCATE:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DELIMITER:
			case T_DESC:
			case T_DESCRIBE:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXEC:
			case T_EXECUTE:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FETCH:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FROM:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_GROUP:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HDFS:
			case T_HIVE:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INNER:
			case T_INOUT:
			case T_INSERT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INTO:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LEFT:
			case T_LIKE:
			case T_LIMIT:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_ORDER:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITH:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
			case L_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(2565);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case L_ID:
					{
					setState(2563);
					match(L_ID);
					}
					break;
				case T_ACTION:
				case T_ADD2:
				case T_ALL:
				case T_ALLOCATE:
				case T_ALTER:
				case T_AND:
				case T_ANSI_NULLS:
				case T_ANSI_PADDING:
				case T_AS:
				case T_ASC:
				case T_ASSOCIATE:
				case T_AT:
				case T_AUTO_INCREMENT:
				case T_AVG:
				case T_BATCHSIZE:
				case T_BEGIN:
				case T_BETWEEN:
				case T_BIGINT:
				case T_BINARY_DOUBLE:
				case T_BINARY_FLOAT:
				case T_BIT:
				case T_BODY:
				case T_BREAK:
				case T_BY:
				case T_BYTE:
				case T_CALL:
				case T_CALLER:
				case T_CASCADE:
				case T_CASE:
				case T_CASESPECIFIC:
				case T_CAST:
				case T_CHAR:
				case T_CHARACTER:
				case T_CHARSET:
				case T_CLIENT:
				case T_CLOSE:
				case T_CLUSTERED:
				case T_CMP:
				case T_COLLECT:
				case T_COLLECTION:
				case T_COLUMN:
				case T_COMMENT:
				case T_CONSTANT:
				case T_COMMIT:
				case T_COMPRESS:
				case T_CONCAT:
				case T_CONDITION:
				case T_CONSTRAINT:
				case T_CONTINUE:
				case T_COPY:
				case T_COUNT:
				case T_COUNT_BIG:
				case T_CREATE:
				case T_CREATION:
				case T_CREATOR:
				case T_CS:
				case T_CURRENT:
				case T_CURRENT_SCHEMA:
				case T_CURSOR:
				case T_DATABASE:
				case T_DATA:
				case T_DATE:
				case T_DATETIME:
				case T_DAY:
				case T_DAYS:
				case T_DEC:
				case T_DECIMAL:
				case T_DECLARE:
				case T_DEFAULT:
				case T_DEFERRED:
				case T_DEFINED:
				case T_DEFINER:
				case T_DEFINITION:
				case T_DELETE:
				case T_DELIMITED:
				case T_DELIMITER:
				case T_DESC:
				case T_DESCRIBE:
				case T_DIAGNOSTICS:
				case T_DIR:
				case T_DIRECTORY:
				case T_DISTINCT:
				case T_DISTRIBUTE:
				case T_DO:
				case T_DOUBLE:
				case T_DROP:
				case T_DYNAMIC:
				case T_ENABLE:
				case T_ENGINE:
				case T_ESCAPED:
				case T_EXCEPT:
				case T_EXEC:
				case T_EXECUTE:
				case T_EXCEPTION:
				case T_EXCLUSIVE:
				case T_EXISTS:
				case T_EXIT:
				case T_FALLBACK:
				case T_FALSE:
				case T_FETCH:
				case T_FIELDS:
				case T_FILE:
				case T_FILES:
				case T_FLOAT:
				case T_FOR:
				case T_FOREIGN:
				case T_FORMAT:
				case T_FOUND:
				case T_FROM:
				case T_FULL:
				case T_FUNCTION:
				case T_GET:
				case T_GLOBAL:
				case T_GO:
				case T_GRANT:
				case T_GROUP:
				case T_HANDLER:
				case T_HASH:
				case T_HAVING:
				case T_HDFS:
				case T_HIVE:
				case T_HOST:
				case T_IDENTITY:
				case T_IF:
				case T_IGNORE:
				case T_IMMEDIATE:
				case T_IN:
				case T_INCLUDE:
				case T_INDEX:
				case T_INITRANS:
				case T_INNER:
				case T_INOUT:
				case T_INSERT:
				case T_INT2:
				case T_INT4:
				case T_INT8:
				case T_INTEGER:
				case T_INTERSECT:
				case T_INTERVAL:
				case T_INTO:
				case T_INVOKER:
				case T_IS:
				case T_ISOPEN:
				case T_ITEMS:
				case T_JOIN:
				case T_KEEP:
				case T_KEY:
				case T_KEYS:
				case T_LANGUAGE:
				case T_LEAVE:
				case T_LEFT:
				case T_LIKE:
				case T_LIMIT:
				case T_LINES:
				case T_LOCAL:
				case T_LOCATION:
				case T_LOCATOR:
				case T_LOCATORS:
				case T_LOCKS:
				case T_LOG:
				case T_LOGGED:
				case T_LOGGING:
				case T_LOOP:
				case T_MAP:
				case T_MATCHED:
				case T_MAX:
				case T_MAXTRANS:
				case T_MERGE:
				case T_MESSAGE_TEXT:
				case T_MICROSECOND:
				case T_MICROSECONDS:
				case T_MIN:
				case T_MULTISET:
				case T_NCHAR:
				case T_NEW:
				case T_NVARCHAR:
				case T_NO:
				case T_NOCOUNT:
				case T_NOCOMPRESS:
				case T_NOLOGGING:
				case T_NONE:
				case T_NOT:
				case T_NOTFOUND:
				case T_NUMERIC:
				case T_NUMBER:
				case T_OBJECT:
				case T_OFF:
				case T_ON:
				case T_ONLY:
				case T_OPEN:
				case T_OR:
				case T_ORDER:
				case T_OUT:
				case T_OUTER:
				case T_OVER:
				case T_OVERWRITE:
				case T_OWNER:
				case T_PACKAGE:
				case T_PARTITION:
				case T_PCTFREE:
				case T_PCTUSED:
				case T_PRECISION:
				case T_PRESERVE:
				case T_PRIMARY:
				case T_PRINT:
				case T_PROC:
				case T_PROCEDURE:
				case T_QUALIFY:
				case T_QUERY_BAND:
				case T_QUIT:
				case T_QUOTED_IDENTIFIER:
				case T_RAISE:
				case T_REFERENCES:
				case T_REGEXP:
				case T_REPLACE:
				case T_RESIGNAL:
				case T_RESTRICT:
				case T_RESULT:
				case T_RESULT_SET_LOCATOR:
				case T_RETURN:
				case T_RETURNS:
				case T_REVERSE:
				case T_RIGHT:
				case T_RLIKE:
				case T_ROLE:
				case T_ROLLBACK:
				case T_ROW:
				case T_ROWS:
				case T_ROW_COUNT:
				case T_RR:
				case T_RS:
				case T_PWD:
				case T_TRIM:
				case T_SCHEMA:
				case T_SECOND:
				case T_SECONDS:
				case T_SECURITY:
				case T_SEGMENT:
				case T_SEL:
				case T_SELECT:
				case T_SET:
				case T_SESSION:
				case T_SESSIONS:
				case T_SETS:
				case T_SHARE:
				case T_SIGNAL:
				case T_SIMPLE_DOUBLE:
				case T_SIMPLE_FLOAT:
				case T_SMALLDATETIME:
				case T_SMALLINT:
				case T_SQL:
				case T_SQLEXCEPTION:
				case T_SQLINSERT:
				case T_SQLSTATE:
				case T_SQLWARNING:
				case T_STATS:
				case T_STATISTICS:
				case T_STEP:
				case T_STORAGE:
				case T_STORED:
				case T_SUBDIR:
				case T_SUBSTRING:
				case T_SUM:
				case T_SUMMARY:
				case T_SYS_REFCURSOR:
				case T_TABLE:
				case T_TABLESPACE:
				case T_TEMPORARY:
				case T_TERMINATED:
				case T_TEXTIMAGE_ON:
				case T_THEN:
				case T_TIMESTAMP:
				case T_TITLE:
				case T_TO:
				case T_TOP:
				case T_TRANSACTION:
				case T_TRUE:
				case T_TRUNCATE:
				case T_UNIQUE:
				case T_UPDATE:
				case T_UR:
				case T_USE:
				case T_USING:
				case T_VALUE:
				case T_VALUES:
				case T_VAR:
				case T_VARCHAR:
				case T_VARCHAR2:
				case T_VARYING:
				case T_VOLATILE:
				case T_WHILE:
				case T_WITH:
				case T_WITHOUT:
				case T_WORK:
				case T_XACT_ABORT:
				case T_XML:
				case T_YES:
				case T_ACTIVITY_COUNT:
				case T_CUME_DIST:
				case T_CURRENT_DATE:
				case T_CURRENT_TIMESTAMP:
				case T_CURRENT_USER:
				case T_DENSE_RANK:
				case T_FIRST_VALUE:
				case T_LAG:
				case T_LAST_VALUE:
				case T_LEAD:
				case T_PART_COUNT:
				case T_PART_LOC:
				case T_RANK:
				case T_ROW_NUMBER:
				case T_STDEV:
				case T_SYSDATE:
				case T_VARIANCE:
				case T_USER:
					{
					setState(2564);
					non_reserved_words();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2574);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,313,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2567);
						match(T__2);
						setState(2570);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case L_ID:
							{
							setState(2568);
							match(L_ID);
							}
							break;
						case T_ACTION:
						case T_ADD2:
						case T_ALL:
						case T_ALLOCATE:
						case T_ALTER:
						case T_AND:
						case T_ANSI_NULLS:
						case T_ANSI_PADDING:
						case T_AS:
						case T_ASC:
						case T_ASSOCIATE:
						case T_AT:
						case T_AUTO_INCREMENT:
						case T_AVG:
						case T_BATCHSIZE:
						case T_BEGIN:
						case T_BETWEEN:
						case T_BIGINT:
						case T_BINARY_DOUBLE:
						case T_BINARY_FLOAT:
						case T_BIT:
						case T_BODY:
						case T_BREAK:
						case T_BY:
						case T_BYTE:
						case T_CALL:
						case T_CALLER:
						case T_CASCADE:
						case T_CASE:
						case T_CASESPECIFIC:
						case T_CAST:
						case T_CHAR:
						case T_CHARACTER:
						case T_CHARSET:
						case T_CLIENT:
						case T_CLOSE:
						case T_CLUSTERED:
						case T_CMP:
						case T_COLLECT:
						case T_COLLECTION:
						case T_COLUMN:
						case T_COMMENT:
						case T_CONSTANT:
						case T_COMMIT:
						case T_COMPRESS:
						case T_CONCAT:
						case T_CONDITION:
						case T_CONSTRAINT:
						case T_CONTINUE:
						case T_COPY:
						case T_COUNT:
						case T_COUNT_BIG:
						case T_CREATE:
						case T_CREATION:
						case T_CREATOR:
						case T_CS:
						case T_CURRENT:
						case T_CURRENT_SCHEMA:
						case T_CURSOR:
						case T_DATABASE:
						case T_DATA:
						case T_DATE:
						case T_DATETIME:
						case T_DAY:
						case T_DAYS:
						case T_DEC:
						case T_DECIMAL:
						case T_DECLARE:
						case T_DEFAULT:
						case T_DEFERRED:
						case T_DEFINED:
						case T_DEFINER:
						case T_DEFINITION:
						case T_DELETE:
						case T_DELIMITED:
						case T_DELIMITER:
						case T_DESC:
						case T_DESCRIBE:
						case T_DIAGNOSTICS:
						case T_DIR:
						case T_DIRECTORY:
						case T_DISTINCT:
						case T_DISTRIBUTE:
						case T_DO:
						case T_DOUBLE:
						case T_DROP:
						case T_DYNAMIC:
						case T_ENABLE:
						case T_ENGINE:
						case T_ESCAPED:
						case T_EXCEPT:
						case T_EXEC:
						case T_EXECUTE:
						case T_EXCEPTION:
						case T_EXCLUSIVE:
						case T_EXISTS:
						case T_EXIT:
						case T_FALLBACK:
						case T_FALSE:
						case T_FETCH:
						case T_FIELDS:
						case T_FILE:
						case T_FILES:
						case T_FLOAT:
						case T_FOR:
						case T_FOREIGN:
						case T_FORMAT:
						case T_FOUND:
						case T_FROM:
						case T_FULL:
						case T_FUNCTION:
						case T_GET:
						case T_GLOBAL:
						case T_GO:
						case T_GRANT:
						case T_GROUP:
						case T_HANDLER:
						case T_HASH:
						case T_HAVING:
						case T_HDFS:
						case T_HIVE:
						case T_HOST:
						case T_IDENTITY:
						case T_IF:
						case T_IGNORE:
						case T_IMMEDIATE:
						case T_IN:
						case T_INCLUDE:
						case T_INDEX:
						case T_INITRANS:
						case T_INNER:
						case T_INOUT:
						case T_INSERT:
						case T_INT2:
						case T_INT4:
						case T_INT8:
						case T_INTEGER:
						case T_INTERSECT:
						case T_INTERVAL:
						case T_INTO:
						case T_INVOKER:
						case T_IS:
						case T_ISOPEN:
						case T_ITEMS:
						case T_JOIN:
						case T_KEEP:
						case T_KEY:
						case T_KEYS:
						case T_LANGUAGE:
						case T_LEAVE:
						case T_LEFT:
						case T_LIKE:
						case T_LIMIT:
						case T_LINES:
						case T_LOCAL:
						case T_LOCATION:
						case T_LOCATOR:
						case T_LOCATORS:
						case T_LOCKS:
						case T_LOG:
						case T_LOGGED:
						case T_LOGGING:
						case T_LOOP:
						case T_MAP:
						case T_MATCHED:
						case T_MAX:
						case T_MAXTRANS:
						case T_MERGE:
						case T_MESSAGE_TEXT:
						case T_MICROSECOND:
						case T_MICROSECONDS:
						case T_MIN:
						case T_MULTISET:
						case T_NCHAR:
						case T_NEW:
						case T_NVARCHAR:
						case T_NO:
						case T_NOCOUNT:
						case T_NOCOMPRESS:
						case T_NOLOGGING:
						case T_NONE:
						case T_NOT:
						case T_NOTFOUND:
						case T_NUMERIC:
						case T_NUMBER:
						case T_OBJECT:
						case T_OFF:
						case T_ON:
						case T_ONLY:
						case T_OPEN:
						case T_OR:
						case T_ORDER:
						case T_OUT:
						case T_OUTER:
						case T_OVER:
						case T_OVERWRITE:
						case T_OWNER:
						case T_PACKAGE:
						case T_PARTITION:
						case T_PCTFREE:
						case T_PCTUSED:
						case T_PRECISION:
						case T_PRESERVE:
						case T_PRIMARY:
						case T_PRINT:
						case T_PROC:
						case T_PROCEDURE:
						case T_QUALIFY:
						case T_QUERY_BAND:
						case T_QUIT:
						case T_QUOTED_IDENTIFIER:
						case T_RAISE:
						case T_REFERENCES:
						case T_REGEXP:
						case T_REPLACE:
						case T_RESIGNAL:
						case T_RESTRICT:
						case T_RESULT:
						case T_RESULT_SET_LOCATOR:
						case T_RETURN:
						case T_RETURNS:
						case T_REVERSE:
						case T_RIGHT:
						case T_RLIKE:
						case T_ROLE:
						case T_ROLLBACK:
						case T_ROW:
						case T_ROWS:
						case T_ROW_COUNT:
						case T_RR:
						case T_RS:
						case T_PWD:
						case T_TRIM:
						case T_SCHEMA:
						case T_SECOND:
						case T_SECONDS:
						case T_SECURITY:
						case T_SEGMENT:
						case T_SEL:
						case T_SELECT:
						case T_SET:
						case T_SESSION:
						case T_SESSIONS:
						case T_SETS:
						case T_SHARE:
						case T_SIGNAL:
						case T_SIMPLE_DOUBLE:
						case T_SIMPLE_FLOAT:
						case T_SMALLDATETIME:
						case T_SMALLINT:
						case T_SQL:
						case T_SQLEXCEPTION:
						case T_SQLINSERT:
						case T_SQLSTATE:
						case T_SQLWARNING:
						case T_STATS:
						case T_STATISTICS:
						case T_STEP:
						case T_STORAGE:
						case T_STORED:
						case T_SUBDIR:
						case T_SUBSTRING:
						case T_SUM:
						case T_SUMMARY:
						case T_SYS_REFCURSOR:
						case T_TABLE:
						case T_TABLESPACE:
						case T_TEMPORARY:
						case T_TERMINATED:
						case T_TEXTIMAGE_ON:
						case T_THEN:
						case T_TIMESTAMP:
						case T_TITLE:
						case T_TO:
						case T_TOP:
						case T_TRANSACTION:
						case T_TRUE:
						case T_TRUNCATE:
						case T_UNIQUE:
						case T_UPDATE:
						case T_UR:
						case T_USE:
						case T_USING:
						case T_VALUE:
						case T_VALUES:
						case T_VAR:
						case T_VARCHAR:
						case T_VARCHAR2:
						case T_VARYING:
						case T_VOLATILE:
						case T_WHILE:
						case T_WITH:
						case T_WITHOUT:
						case T_WORK:
						case T_XACT_ABORT:
						case T_XML:
						case T_YES:
						case T_ACTIVITY_COUNT:
						case T_CUME_DIST:
						case T_CURRENT_DATE:
						case T_CURRENT_TIMESTAMP:
						case T_CURRENT_USER:
						case T_DENSE_RANK:
						case T_FIRST_VALUE:
						case T_LAG:
						case T_LAST_VALUE:
						case T_LEAD:
						case T_PART_COUNT:
						case T_PART_LOC:
						case T_RANK:
						case T_ROW_NUMBER:
						case T_STDEV:
						case T_SYSDATE:
						case T_VARIANCE:
						case T_USER:
							{
							setState(2569);
							non_reserved_words();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						} 
					}
					setState(2576);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,313,_ctx);
				}
				setState(2578);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
				case 1:
					{
					setState(2577);
					ident();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	 
		public StringContext() { }
		public void copyFrom(StringContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Double_quotedStringContext extends StringContext {
		public TerminalNode L_D_STRING() { return getToken(HplsqlParser.L_D_STRING, 0); }
		public Double_quotedStringContext(StringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDouble_quotedString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDouble_quotedString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDouble_quotedString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Single_quotedStringContext extends StringContext {
		public TerminalNode L_S_STRING() { return getToken(HplsqlParser.L_S_STRING, 0); }
		public Single_quotedStringContext(StringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSingle_quotedString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSingle_quotedString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSingle_quotedString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_string);
		try {
			setState(2584);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_S_STRING:
				_localctx = new Single_quotedStringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2582);
				match(L_S_STRING);
				}
				break;
			case L_D_STRING:
				_localctx = new Double_quotedStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2583);
				match(L_D_STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Int_numberContext extends ParserRuleContext {
		public TerminalNode L_INT() { return getToken(HplsqlParser.L_INT, 0); }
		public Int_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterInt_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitInt_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitInt_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_numberContext int_number() throws RecognitionException {
		Int_numberContext _localctx = new Int_numberContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_int_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2587);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ADD || _la==T_SUB) {
				{
				setState(2586);
				_la = _input.LA(1);
				if ( !(_la==T_ADD || _la==T_SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2589);
			match(L_INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dec_numberContext extends ParserRuleContext {
		public TerminalNode L_DEC() { return getToken(HplsqlParser.L_DEC, 0); }
		public Dec_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDec_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDec_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDec_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dec_numberContext dec_number() throws RecognitionException {
		Dec_numberContext _localctx = new Dec_numberContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_dec_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ADD || _la==T_SUB) {
				{
				setState(2591);
				_la = _input.LA(1);
				if ( !(_la==T_ADD || _la==T_SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2594);
			match(L_DEC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_literalContext extends ParserRuleContext {
		public TerminalNode T_TRUE() { return getToken(HplsqlParser.T_TRUE, 0); }
		public TerminalNode T_FALSE() { return getToken(HplsqlParser.T_FALSE, 0); }
		public Bool_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterBool_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitBool_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitBool_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_literalContext bool_literal() throws RecognitionException {
		Bool_literalContext _localctx = new Bool_literalContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_bool_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2596);
			_la = _input.LA(1);
			if ( !(_la==T_FALSE || _la==T_TRUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Null_constContext extends ParserRuleContext {
		public TerminalNode T_NULL() { return getToken(HplsqlParser.T_NULL, 0); }
		public Null_constContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_const; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterNull_const(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitNull_const(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitNull_const(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Null_constContext null_const() throws RecognitionException {
		Null_constContext _localctx = new Null_constContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_null_const);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2598);
			match(T_NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Non_reserved_wordsContext extends ParserRuleContext {
		public TerminalNode T_ACTION() { return getToken(HplsqlParser.T_ACTION, 0); }
		public TerminalNode T_ACTIVITY_COUNT() { return getToken(HplsqlParser.T_ACTIVITY_COUNT, 0); }
		public TerminalNode T_ADD2() { return getToken(HplsqlParser.T_ADD2, 0); }
		public TerminalNode T_ALL() { return getToken(HplsqlParser.T_ALL, 0); }
		public TerminalNode T_ALLOCATE() { return getToken(HplsqlParser.T_ALLOCATE, 0); }
		public TerminalNode T_ALTER() { return getToken(HplsqlParser.T_ALTER, 0); }
		public TerminalNode T_AND() { return getToken(HplsqlParser.T_AND, 0); }
		public TerminalNode T_ANSI_NULLS() { return getToken(HplsqlParser.T_ANSI_NULLS, 0); }
		public TerminalNode T_ANSI_PADDING() { return getToken(HplsqlParser.T_ANSI_PADDING, 0); }
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public TerminalNode T_ASC() { return getToken(HplsqlParser.T_ASC, 0); }
		public TerminalNode T_ASSOCIATE() { return getToken(HplsqlParser.T_ASSOCIATE, 0); }
		public TerminalNode T_AT() { return getToken(HplsqlParser.T_AT, 0); }
		public TerminalNode T_AUTO_INCREMENT() { return getToken(HplsqlParser.T_AUTO_INCREMENT, 0); }
		public TerminalNode T_AVG() { return getToken(HplsqlParser.T_AVG, 0); }
		public TerminalNode T_BATCHSIZE() { return getToken(HplsqlParser.T_BATCHSIZE, 0); }
		public TerminalNode T_BEGIN() { return getToken(HplsqlParser.T_BEGIN, 0); }
		public TerminalNode T_BETWEEN() { return getToken(HplsqlParser.T_BETWEEN, 0); }
		public TerminalNode T_BIGINT() { return getToken(HplsqlParser.T_BIGINT, 0); }
		public TerminalNode T_BINARY_DOUBLE() { return getToken(HplsqlParser.T_BINARY_DOUBLE, 0); }
		public TerminalNode T_BINARY_FLOAT() { return getToken(HplsqlParser.T_BINARY_FLOAT, 0); }
		public TerminalNode T_BIT() { return getToken(HplsqlParser.T_BIT, 0); }
		public TerminalNode T_BODY() { return getToken(HplsqlParser.T_BODY, 0); }
		public TerminalNode T_BREAK() { return getToken(HplsqlParser.T_BREAK, 0); }
		public TerminalNode T_BY() { return getToken(HplsqlParser.T_BY, 0); }
		public TerminalNode T_BYTE() { return getToken(HplsqlParser.T_BYTE, 0); }
		public TerminalNode T_CALL() { return getToken(HplsqlParser.T_CALL, 0); }
		public TerminalNode T_CALLER() { return getToken(HplsqlParser.T_CALLER, 0); }
		public TerminalNode T_CASCADE() { return getToken(HplsqlParser.T_CASCADE, 0); }
		public TerminalNode T_CASE() { return getToken(HplsqlParser.T_CASE, 0); }
		public TerminalNode T_CASESPECIFIC() { return getToken(HplsqlParser.T_CASESPECIFIC, 0); }
		public TerminalNode T_CAST() { return getToken(HplsqlParser.T_CAST, 0); }
		public TerminalNode T_CHAR() { return getToken(HplsqlParser.T_CHAR, 0); }
		public TerminalNode T_CHARACTER() { return getToken(HplsqlParser.T_CHARACTER, 0); }
		public TerminalNode T_CHARSET() { return getToken(HplsqlParser.T_CHARSET, 0); }
		public TerminalNode T_CLIENT() { return getToken(HplsqlParser.T_CLIENT, 0); }
		public TerminalNode T_CLOSE() { return getToken(HplsqlParser.T_CLOSE, 0); }
		public TerminalNode T_CLUSTERED() { return getToken(HplsqlParser.T_CLUSTERED, 0); }
		public TerminalNode T_CMP() { return getToken(HplsqlParser.T_CMP, 0); }
		public TerminalNode T_COLLECT() { return getToken(HplsqlParser.T_COLLECT, 0); }
		public TerminalNode T_COLLECTION() { return getToken(HplsqlParser.T_COLLECTION, 0); }
		public TerminalNode T_COLUMN() { return getToken(HplsqlParser.T_COLUMN, 0); }
		public TerminalNode T_COMMENT() { return getToken(HplsqlParser.T_COMMENT, 0); }
		public TerminalNode T_COMPRESS() { return getToken(HplsqlParser.T_COMPRESS, 0); }
		public TerminalNode T_CONSTANT() { return getToken(HplsqlParser.T_CONSTANT, 0); }
		public TerminalNode T_COPY() { return getToken(HplsqlParser.T_COPY, 0); }
		public TerminalNode T_COMMIT() { return getToken(HplsqlParser.T_COMMIT, 0); }
		public TerminalNode T_CONCAT() { return getToken(HplsqlParser.T_CONCAT, 0); }
		public TerminalNode T_CONDITION() { return getToken(HplsqlParser.T_CONDITION, 0); }
		public TerminalNode T_CONSTRAINT() { return getToken(HplsqlParser.T_CONSTRAINT, 0); }
		public TerminalNode T_CONTINUE() { return getToken(HplsqlParser.T_CONTINUE, 0); }
		public TerminalNode T_COUNT() { return getToken(HplsqlParser.T_COUNT, 0); }
		public TerminalNode T_COUNT_BIG() { return getToken(HplsqlParser.T_COUNT_BIG, 0); }
		public TerminalNode T_CREATE() { return getToken(HplsqlParser.T_CREATE, 0); }
		public TerminalNode T_CREATION() { return getToken(HplsqlParser.T_CREATION, 0); }
		public TerminalNode T_CREATOR() { return getToken(HplsqlParser.T_CREATOR, 0); }
		public TerminalNode T_CS() { return getToken(HplsqlParser.T_CS, 0); }
		public TerminalNode T_CUME_DIST() { return getToken(HplsqlParser.T_CUME_DIST, 0); }
		public TerminalNode T_CURRENT() { return getToken(HplsqlParser.T_CURRENT, 0); }
		public TerminalNode T_CURRENT_DATE() { return getToken(HplsqlParser.T_CURRENT_DATE, 0); }
		public TerminalNode T_CURRENT_SCHEMA() { return getToken(HplsqlParser.T_CURRENT_SCHEMA, 0); }
		public TerminalNode T_CURRENT_TIMESTAMP() { return getToken(HplsqlParser.T_CURRENT_TIMESTAMP, 0); }
		public TerminalNode T_CURRENT_USER() { return getToken(HplsqlParser.T_CURRENT_USER, 0); }
		public TerminalNode T_CURSOR() { return getToken(HplsqlParser.T_CURSOR, 0); }
		public TerminalNode T_DATA() { return getToken(HplsqlParser.T_DATA, 0); }
		public TerminalNode T_DATABASE() { return getToken(HplsqlParser.T_DATABASE, 0); }
		public TerminalNode T_DATE() { return getToken(HplsqlParser.T_DATE, 0); }
		public TerminalNode T_DATETIME() { return getToken(HplsqlParser.T_DATETIME, 0); }
		public TerminalNode T_DAY() { return getToken(HplsqlParser.T_DAY, 0); }
		public TerminalNode T_DAYS() { return getToken(HplsqlParser.T_DAYS, 0); }
		public TerminalNode T_DEC() { return getToken(HplsqlParser.T_DEC, 0); }
		public TerminalNode T_DECIMAL() { return getToken(HplsqlParser.T_DECIMAL, 0); }
		public TerminalNode T_DECLARE() { return getToken(HplsqlParser.T_DECLARE, 0); }
		public TerminalNode T_DEFAULT() { return getToken(HplsqlParser.T_DEFAULT, 0); }
		public TerminalNode T_DEFERRED() { return getToken(HplsqlParser.T_DEFERRED, 0); }
		public TerminalNode T_DEFINED() { return getToken(HplsqlParser.T_DEFINED, 0); }
		public TerminalNode T_DEFINER() { return getToken(HplsqlParser.T_DEFINER, 0); }
		public TerminalNode T_DEFINITION() { return getToken(HplsqlParser.T_DEFINITION, 0); }
		public TerminalNode T_DELETE() { return getToken(HplsqlParser.T_DELETE, 0); }
		public TerminalNode T_DELIMITED() { return getToken(HplsqlParser.T_DELIMITED, 0); }
		public TerminalNode T_DELIMITER() { return getToken(HplsqlParser.T_DELIMITER, 0); }
		public TerminalNode T_DENSE_RANK() { return getToken(HplsqlParser.T_DENSE_RANK, 0); }
		public TerminalNode T_DESC() { return getToken(HplsqlParser.T_DESC, 0); }
		public TerminalNode T_DESCRIBE() { return getToken(HplsqlParser.T_DESCRIBE, 0); }
		public TerminalNode T_DIAGNOSTICS() { return getToken(HplsqlParser.T_DIAGNOSTICS, 0); }
		public TerminalNode T_DIR() { return getToken(HplsqlParser.T_DIR, 0); }
		public TerminalNode T_DIRECTORY() { return getToken(HplsqlParser.T_DIRECTORY, 0); }
		public TerminalNode T_DISTINCT() { return getToken(HplsqlParser.T_DISTINCT, 0); }
		public TerminalNode T_DISTRIBUTE() { return getToken(HplsqlParser.T_DISTRIBUTE, 0); }
		public TerminalNode T_DO() { return getToken(HplsqlParser.T_DO, 0); }
		public TerminalNode T_DOUBLE() { return getToken(HplsqlParser.T_DOUBLE, 0); }
		public TerminalNode T_DROP() { return getToken(HplsqlParser.T_DROP, 0); }
		public TerminalNode T_DYNAMIC() { return getToken(HplsqlParser.T_DYNAMIC, 0); }
		public TerminalNode T_ENABLE() { return getToken(HplsqlParser.T_ENABLE, 0); }
		public TerminalNode T_ENGINE() { return getToken(HplsqlParser.T_ENGINE, 0); }
		public TerminalNode T_ESCAPED() { return getToken(HplsqlParser.T_ESCAPED, 0); }
		public TerminalNode T_EXCEPT() { return getToken(HplsqlParser.T_EXCEPT, 0); }
		public TerminalNode T_EXEC() { return getToken(HplsqlParser.T_EXEC, 0); }
		public TerminalNode T_EXECUTE() { return getToken(HplsqlParser.T_EXECUTE, 0); }
		public TerminalNode T_EXCEPTION() { return getToken(HplsqlParser.T_EXCEPTION, 0); }
		public TerminalNode T_EXCLUSIVE() { return getToken(HplsqlParser.T_EXCLUSIVE, 0); }
		public TerminalNode T_EXISTS() { return getToken(HplsqlParser.T_EXISTS, 0); }
		public TerminalNode T_EXIT() { return getToken(HplsqlParser.T_EXIT, 0); }
		public TerminalNode T_FALLBACK() { return getToken(HplsqlParser.T_FALLBACK, 0); }
		public TerminalNode T_FALSE() { return getToken(HplsqlParser.T_FALSE, 0); }
		public TerminalNode T_FETCH() { return getToken(HplsqlParser.T_FETCH, 0); }
		public TerminalNode T_FIELDS() { return getToken(HplsqlParser.T_FIELDS, 0); }
		public TerminalNode T_FILE() { return getToken(HplsqlParser.T_FILE, 0); }
		public TerminalNode T_FILES() { return getToken(HplsqlParser.T_FILES, 0); }
		public TerminalNode T_FIRST_VALUE() { return getToken(HplsqlParser.T_FIRST_VALUE, 0); }
		public TerminalNode T_FLOAT() { return getToken(HplsqlParser.T_FLOAT, 0); }
		public TerminalNode T_FOR() { return getToken(HplsqlParser.T_FOR, 0); }
		public TerminalNode T_FOREIGN() { return getToken(HplsqlParser.T_FOREIGN, 0); }
		public TerminalNode T_FORMAT() { return getToken(HplsqlParser.T_FORMAT, 0); }
		public TerminalNode T_FOUND() { return getToken(HplsqlParser.T_FOUND, 0); }
		public TerminalNode T_FROM() { return getToken(HplsqlParser.T_FROM, 0); }
		public TerminalNode T_FULL() { return getToken(HplsqlParser.T_FULL, 0); }
		public TerminalNode T_FUNCTION() { return getToken(HplsqlParser.T_FUNCTION, 0); }
		public TerminalNode T_GET() { return getToken(HplsqlParser.T_GET, 0); }
		public TerminalNode T_GLOBAL() { return getToken(HplsqlParser.T_GLOBAL, 0); }
		public TerminalNode T_GO() { return getToken(HplsqlParser.T_GO, 0); }
		public TerminalNode T_GRANT() { return getToken(HplsqlParser.T_GRANT, 0); }
		public TerminalNode T_GROUP() { return getToken(HplsqlParser.T_GROUP, 0); }
		public TerminalNode T_HANDLER() { return getToken(HplsqlParser.T_HANDLER, 0); }
		public TerminalNode T_HASH() { return getToken(HplsqlParser.T_HASH, 0); }
		public TerminalNode T_HAVING() { return getToken(HplsqlParser.T_HAVING, 0); }
		public TerminalNode T_HDFS() { return getToken(HplsqlParser.T_HDFS, 0); }
		public TerminalNode T_HIVE() { return getToken(HplsqlParser.T_HIVE, 0); }
		public TerminalNode T_HOST() { return getToken(HplsqlParser.T_HOST, 0); }
		public TerminalNode T_IDENTITY() { return getToken(HplsqlParser.T_IDENTITY, 0); }
		public TerminalNode T_IF() { return getToken(HplsqlParser.T_IF, 0); }
		public TerminalNode T_IGNORE() { return getToken(HplsqlParser.T_IGNORE, 0); }
		public TerminalNode T_IMMEDIATE() { return getToken(HplsqlParser.T_IMMEDIATE, 0); }
		public TerminalNode T_IN() { return getToken(HplsqlParser.T_IN, 0); }
		public TerminalNode T_INCLUDE() { return getToken(HplsqlParser.T_INCLUDE, 0); }
		public TerminalNode T_INDEX() { return getToken(HplsqlParser.T_INDEX, 0); }
		public TerminalNode T_INITRANS() { return getToken(HplsqlParser.T_INITRANS, 0); }
		public TerminalNode T_INNER() { return getToken(HplsqlParser.T_INNER, 0); }
		public TerminalNode T_INOUT() { return getToken(HplsqlParser.T_INOUT, 0); }
		public TerminalNode T_INSERT() { return getToken(HplsqlParser.T_INSERT, 0); }
		public TerminalNode T_INT2() { return getToken(HplsqlParser.T_INT2, 0); }
		public TerminalNode T_INT4() { return getToken(HplsqlParser.T_INT4, 0); }
		public TerminalNode T_INT8() { return getToken(HplsqlParser.T_INT8, 0); }
		public TerminalNode T_INTEGER() { return getToken(HplsqlParser.T_INTEGER, 0); }
		public TerminalNode T_INTERSECT() { return getToken(HplsqlParser.T_INTERSECT, 0); }
		public TerminalNode T_INTERVAL() { return getToken(HplsqlParser.T_INTERVAL, 0); }
		public TerminalNode T_INTO() { return getToken(HplsqlParser.T_INTO, 0); }
		public TerminalNode T_INVOKER() { return getToken(HplsqlParser.T_INVOKER, 0); }
		public TerminalNode T_ITEMS() { return getToken(HplsqlParser.T_ITEMS, 0); }
		public TerminalNode T_IS() { return getToken(HplsqlParser.T_IS, 0); }
		public TerminalNode T_ISOPEN() { return getToken(HplsqlParser.T_ISOPEN, 0); }
		public TerminalNode T_JOIN() { return getToken(HplsqlParser.T_JOIN, 0); }
		public TerminalNode T_KEEP() { return getToken(HplsqlParser.T_KEEP, 0); }
		public TerminalNode T_KEY() { return getToken(HplsqlParser.T_KEY, 0); }
		public TerminalNode T_KEYS() { return getToken(HplsqlParser.T_KEYS, 0); }
		public TerminalNode T_LAG() { return getToken(HplsqlParser.T_LAG, 0); }
		public TerminalNode T_LANGUAGE() { return getToken(HplsqlParser.T_LANGUAGE, 0); }
		public TerminalNode T_LAST_VALUE() { return getToken(HplsqlParser.T_LAST_VALUE, 0); }
		public TerminalNode T_LEAD() { return getToken(HplsqlParser.T_LEAD, 0); }
		public TerminalNode T_LEAVE() { return getToken(HplsqlParser.T_LEAVE, 0); }
		public TerminalNode T_LEFT() { return getToken(HplsqlParser.T_LEFT, 0); }
		public TerminalNode T_LIKE() { return getToken(HplsqlParser.T_LIKE, 0); }
		public TerminalNode T_LIMIT() { return getToken(HplsqlParser.T_LIMIT, 0); }
		public TerminalNode T_LINES() { return getToken(HplsqlParser.T_LINES, 0); }
		public TerminalNode T_LOCAL() { return getToken(HplsqlParser.T_LOCAL, 0); }
		public TerminalNode T_LOCATION() { return getToken(HplsqlParser.T_LOCATION, 0); }
		public TerminalNode T_LOCATOR() { return getToken(HplsqlParser.T_LOCATOR, 0); }
		public TerminalNode T_LOCATORS() { return getToken(HplsqlParser.T_LOCATORS, 0); }
		public TerminalNode T_LOCKS() { return getToken(HplsqlParser.T_LOCKS, 0); }
		public TerminalNode T_LOG() { return getToken(HplsqlParser.T_LOG, 0); }
		public TerminalNode T_LOGGED() { return getToken(HplsqlParser.T_LOGGED, 0); }
		public TerminalNode T_LOGGING() { return getToken(HplsqlParser.T_LOGGING, 0); }
		public TerminalNode T_LOOP() { return getToken(HplsqlParser.T_LOOP, 0); }
		public TerminalNode T_MAP() { return getToken(HplsqlParser.T_MAP, 0); }
		public TerminalNode T_MATCHED() { return getToken(HplsqlParser.T_MATCHED, 0); }
		public TerminalNode T_MAX() { return getToken(HplsqlParser.T_MAX, 0); }
		public TerminalNode T_MAXTRANS() { return getToken(HplsqlParser.T_MAXTRANS, 0); }
		public TerminalNode T_MERGE() { return getToken(HplsqlParser.T_MERGE, 0); }
		public TerminalNode T_MESSAGE_TEXT() { return getToken(HplsqlParser.T_MESSAGE_TEXT, 0); }
		public TerminalNode T_MICROSECOND() { return getToken(HplsqlParser.T_MICROSECOND, 0); }
		public TerminalNode T_MICROSECONDS() { return getToken(HplsqlParser.T_MICROSECONDS, 0); }
		public TerminalNode T_MIN() { return getToken(HplsqlParser.T_MIN, 0); }
		public TerminalNode T_MULTISET() { return getToken(HplsqlParser.T_MULTISET, 0); }
		public TerminalNode T_NCHAR() { return getToken(HplsqlParser.T_NCHAR, 0); }
		public TerminalNode T_NEW() { return getToken(HplsqlParser.T_NEW, 0); }
		public TerminalNode T_NVARCHAR() { return getToken(HplsqlParser.T_NVARCHAR, 0); }
		public TerminalNode T_NO() { return getToken(HplsqlParser.T_NO, 0); }
		public TerminalNode T_NOCOMPRESS() { return getToken(HplsqlParser.T_NOCOMPRESS, 0); }
		public TerminalNode T_NOCOUNT() { return getToken(HplsqlParser.T_NOCOUNT, 0); }
		public TerminalNode T_NOLOGGING() { return getToken(HplsqlParser.T_NOLOGGING, 0); }
		public TerminalNode T_NONE() { return getToken(HplsqlParser.T_NONE, 0); }
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public TerminalNode T_NOTFOUND() { return getToken(HplsqlParser.T_NOTFOUND, 0); }
		public TerminalNode T_NUMERIC() { return getToken(HplsqlParser.T_NUMERIC, 0); }
		public TerminalNode T_NUMBER() { return getToken(HplsqlParser.T_NUMBER, 0); }
		public TerminalNode T_OBJECT() { return getToken(HplsqlParser.T_OBJECT, 0); }
		public TerminalNode T_OFF() { return getToken(HplsqlParser.T_OFF, 0); }
		public TerminalNode T_ON() { return getToken(HplsqlParser.T_ON, 0); }
		public TerminalNode T_ONLY() { return getToken(HplsqlParser.T_ONLY, 0); }
		public TerminalNode T_OPEN() { return getToken(HplsqlParser.T_OPEN, 0); }
		public TerminalNode T_OR() { return getToken(HplsqlParser.T_OR, 0); }
		public TerminalNode T_ORDER() { return getToken(HplsqlParser.T_ORDER, 0); }
		public TerminalNode T_OUT() { return getToken(HplsqlParser.T_OUT, 0); }
		public TerminalNode T_OUTER() { return getToken(HplsqlParser.T_OUTER, 0); }
		public TerminalNode T_OVER() { return getToken(HplsqlParser.T_OVER, 0); }
		public TerminalNode T_OVERWRITE() { return getToken(HplsqlParser.T_OVERWRITE, 0); }
		public TerminalNode T_OWNER() { return getToken(HplsqlParser.T_OWNER, 0); }
		public TerminalNode T_PACKAGE() { return getToken(HplsqlParser.T_PACKAGE, 0); }
		public TerminalNode T_PART_COUNT() { return getToken(HplsqlParser.T_PART_COUNT, 0); }
		public TerminalNode T_PART_LOC() { return getToken(HplsqlParser.T_PART_LOC, 0); }
		public TerminalNode T_PARTITION() { return getToken(HplsqlParser.T_PARTITION, 0); }
		public TerminalNode T_PCTFREE() { return getToken(HplsqlParser.T_PCTFREE, 0); }
		public TerminalNode T_PCTUSED() { return getToken(HplsqlParser.T_PCTUSED, 0); }
		public TerminalNode T_PRECISION() { return getToken(HplsqlParser.T_PRECISION, 0); }
		public TerminalNode T_PRESERVE() { return getToken(HplsqlParser.T_PRESERVE, 0); }
		public TerminalNode T_PRIMARY() { return getToken(HplsqlParser.T_PRIMARY, 0); }
		public TerminalNode T_PRINT() { return getToken(HplsqlParser.T_PRINT, 0); }
		public TerminalNode T_PROC() { return getToken(HplsqlParser.T_PROC, 0); }
		public TerminalNode T_PROCEDURE() { return getToken(HplsqlParser.T_PROCEDURE, 0); }
		public TerminalNode T_PWD() { return getToken(HplsqlParser.T_PWD, 0); }
		public TerminalNode T_QUALIFY() { return getToken(HplsqlParser.T_QUALIFY, 0); }
		public TerminalNode T_QUERY_BAND() { return getToken(HplsqlParser.T_QUERY_BAND, 0); }
		public TerminalNode T_QUIT() { return getToken(HplsqlParser.T_QUIT, 0); }
		public TerminalNode T_QUOTED_IDENTIFIER() { return getToken(HplsqlParser.T_QUOTED_IDENTIFIER, 0); }
		public TerminalNode T_RAISE() { return getToken(HplsqlParser.T_RAISE, 0); }
		public TerminalNode T_RANK() { return getToken(HplsqlParser.T_RANK, 0); }
		public TerminalNode T_REFERENCES() { return getToken(HplsqlParser.T_REFERENCES, 0); }
		public TerminalNode T_REGEXP() { return getToken(HplsqlParser.T_REGEXP, 0); }
		public TerminalNode T_RR() { return getToken(HplsqlParser.T_RR, 0); }
		public TerminalNode T_REPLACE() { return getToken(HplsqlParser.T_REPLACE, 0); }
		public TerminalNode T_RESIGNAL() { return getToken(HplsqlParser.T_RESIGNAL, 0); }
		public TerminalNode T_RESTRICT() { return getToken(HplsqlParser.T_RESTRICT, 0); }
		public TerminalNode T_RESULT() { return getToken(HplsqlParser.T_RESULT, 0); }
		public TerminalNode T_RESULT_SET_LOCATOR() { return getToken(HplsqlParser.T_RESULT_SET_LOCATOR, 0); }
		public TerminalNode T_RETURN() { return getToken(HplsqlParser.T_RETURN, 0); }
		public TerminalNode T_RETURNS() { return getToken(HplsqlParser.T_RETURNS, 0); }
		public TerminalNode T_REVERSE() { return getToken(HplsqlParser.T_REVERSE, 0); }
		public TerminalNode T_RIGHT() { return getToken(HplsqlParser.T_RIGHT, 0); }
		public TerminalNode T_RLIKE() { return getToken(HplsqlParser.T_RLIKE, 0); }
		public TerminalNode T_RS() { return getToken(HplsqlParser.T_RS, 0); }
		public TerminalNode T_ROLE() { return getToken(HplsqlParser.T_ROLE, 0); }
		public TerminalNode T_ROLLBACK() { return getToken(HplsqlParser.T_ROLLBACK, 0); }
		public TerminalNode T_ROW() { return getToken(HplsqlParser.T_ROW, 0); }
		public TerminalNode T_ROWS() { return getToken(HplsqlParser.T_ROWS, 0); }
		public TerminalNode T_ROW_COUNT() { return getToken(HplsqlParser.T_ROW_COUNT, 0); }
		public TerminalNode T_ROW_NUMBER() { return getToken(HplsqlParser.T_ROW_NUMBER, 0); }
		public TerminalNode T_SCHEMA() { return getToken(HplsqlParser.T_SCHEMA, 0); }
		public TerminalNode T_SECOND() { return getToken(HplsqlParser.T_SECOND, 0); }
		public TerminalNode T_SECONDS() { return getToken(HplsqlParser.T_SECONDS, 0); }
		public TerminalNode T_SECURITY() { return getToken(HplsqlParser.T_SECURITY, 0); }
		public TerminalNode T_SEGMENT() { return getToken(HplsqlParser.T_SEGMENT, 0); }
		public TerminalNode T_SEL() { return getToken(HplsqlParser.T_SEL, 0); }
		public TerminalNode T_SELECT() { return getToken(HplsqlParser.T_SELECT, 0); }
		public TerminalNode T_SESSION() { return getToken(HplsqlParser.T_SESSION, 0); }
		public TerminalNode T_SESSIONS() { return getToken(HplsqlParser.T_SESSIONS, 0); }
		public TerminalNode T_SET() { return getToken(HplsqlParser.T_SET, 0); }
		public TerminalNode T_SETS() { return getToken(HplsqlParser.T_SETS, 0); }
		public TerminalNode T_SHARE() { return getToken(HplsqlParser.T_SHARE, 0); }
		public TerminalNode T_SIGNAL() { return getToken(HplsqlParser.T_SIGNAL, 0); }
		public TerminalNode T_SIMPLE_DOUBLE() { return getToken(HplsqlParser.T_SIMPLE_DOUBLE, 0); }
		public TerminalNode T_SIMPLE_FLOAT() { return getToken(HplsqlParser.T_SIMPLE_FLOAT, 0); }
		public TerminalNode T_SMALLDATETIME() { return getToken(HplsqlParser.T_SMALLDATETIME, 0); }
		public TerminalNode T_SMALLINT() { return getToken(HplsqlParser.T_SMALLINT, 0); }
		public TerminalNode T_SQL() { return getToken(HplsqlParser.T_SQL, 0); }
		public TerminalNode T_SQLEXCEPTION() { return getToken(HplsqlParser.T_SQLEXCEPTION, 0); }
		public TerminalNode T_SQLINSERT() { return getToken(HplsqlParser.T_SQLINSERT, 0); }
		public TerminalNode T_SQLSTATE() { return getToken(HplsqlParser.T_SQLSTATE, 0); }
		public TerminalNode T_SQLWARNING() { return getToken(HplsqlParser.T_SQLWARNING, 0); }
		public TerminalNode T_STATS() { return getToken(HplsqlParser.T_STATS, 0); }
		public TerminalNode T_STATISTICS() { return getToken(HplsqlParser.T_STATISTICS, 0); }
		public TerminalNode T_STEP() { return getToken(HplsqlParser.T_STEP, 0); }
		public TerminalNode T_STDEV() { return getToken(HplsqlParser.T_STDEV, 0); }
		public TerminalNode T_STORAGE() { return getToken(HplsqlParser.T_STORAGE, 0); }
		public TerminalNode T_STORED() { return getToken(HplsqlParser.T_STORED, 0); }
		public TerminalNode T_SUBDIR() { return getToken(HplsqlParser.T_SUBDIR, 0); }
		public TerminalNode T_SUBSTRING() { return getToken(HplsqlParser.T_SUBSTRING, 0); }
		public TerminalNode T_SUM() { return getToken(HplsqlParser.T_SUM, 0); }
		public TerminalNode T_SUMMARY() { return getToken(HplsqlParser.T_SUMMARY, 0); }
		public TerminalNode T_SYSDATE() { return getToken(HplsqlParser.T_SYSDATE, 0); }
		public TerminalNode T_SYS_REFCURSOR() { return getToken(HplsqlParser.T_SYS_REFCURSOR, 0); }
		public TerminalNode T_TABLE() { return getToken(HplsqlParser.T_TABLE, 0); }
		public TerminalNode T_TABLESPACE() { return getToken(HplsqlParser.T_TABLESPACE, 0); }
		public TerminalNode T_TEMPORARY() { return getToken(HplsqlParser.T_TEMPORARY, 0); }
		public TerminalNode T_TERMINATED() { return getToken(HplsqlParser.T_TERMINATED, 0); }
		public TerminalNode T_TEXTIMAGE_ON() { return getToken(HplsqlParser.T_TEXTIMAGE_ON, 0); }
		public TerminalNode T_THEN() { return getToken(HplsqlParser.T_THEN, 0); }
		public TerminalNode T_TIMESTAMP() { return getToken(HplsqlParser.T_TIMESTAMP, 0); }
		public TerminalNode T_TITLE() { return getToken(HplsqlParser.T_TITLE, 0); }
		public TerminalNode T_TO() { return getToken(HplsqlParser.T_TO, 0); }
		public TerminalNode T_TOP() { return getToken(HplsqlParser.T_TOP, 0); }
		public TerminalNode T_TRANSACTION() { return getToken(HplsqlParser.T_TRANSACTION, 0); }
		public TerminalNode T_TRIM() { return getToken(HplsqlParser.T_TRIM, 0); }
		public TerminalNode T_TRUE() { return getToken(HplsqlParser.T_TRUE, 0); }
		public TerminalNode T_TRUNCATE() { return getToken(HplsqlParser.T_TRUNCATE, 0); }
		public TerminalNode T_UNIQUE() { return getToken(HplsqlParser.T_UNIQUE, 0); }
		public TerminalNode T_UPDATE() { return getToken(HplsqlParser.T_UPDATE, 0); }
		public TerminalNode T_UR() { return getToken(HplsqlParser.T_UR, 0); }
		public TerminalNode T_USE() { return getToken(HplsqlParser.T_USE, 0); }
		public TerminalNode T_USER() { return getToken(HplsqlParser.T_USER, 0); }
		public TerminalNode T_USING() { return getToken(HplsqlParser.T_USING, 0); }
		public TerminalNode T_VALUE() { return getToken(HplsqlParser.T_VALUE, 0); }
		public TerminalNode T_VALUES() { return getToken(HplsqlParser.T_VALUES, 0); }
		public TerminalNode T_VAR() { return getToken(HplsqlParser.T_VAR, 0); }
		public TerminalNode T_VARCHAR() { return getToken(HplsqlParser.T_VARCHAR, 0); }
		public TerminalNode T_VARCHAR2() { return getToken(HplsqlParser.T_VARCHAR2, 0); }
		public TerminalNode T_VARYING() { return getToken(HplsqlParser.T_VARYING, 0); }
		public TerminalNode T_VARIANCE() { return getToken(HplsqlParser.T_VARIANCE, 0); }
		public TerminalNode T_VOLATILE() { return getToken(HplsqlParser.T_VOLATILE, 0); }
		public TerminalNode T_WHILE() { return getToken(HplsqlParser.T_WHILE, 0); }
		public TerminalNode T_WITH() { return getToken(HplsqlParser.T_WITH, 0); }
		public TerminalNode T_WITHOUT() { return getToken(HplsqlParser.T_WITHOUT, 0); }
		public TerminalNode T_WORK() { return getToken(HplsqlParser.T_WORK, 0); }
		public TerminalNode T_XACT_ABORT() { return getToken(HplsqlParser.T_XACT_ABORT, 0); }
		public TerminalNode T_XML() { return getToken(HplsqlParser.T_XML, 0); }
		public TerminalNode T_YES() { return getToken(HplsqlParser.T_YES, 0); }
		public Non_reserved_wordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_reserved_words; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterNon_reserved_words(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitNon_reserved_words(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitNon_reserved_words(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Non_reserved_wordsContext non_reserved_words() throws RecognitionException {
		Non_reserved_wordsContext _localctx = new Non_reserved_wordsContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_non_reserved_words);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2600);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_ADD2) | (1L << T_ALL) | (1L << T_ALLOCATE) | (1L << T_ALTER) | (1L << T_AND) | (1L << T_ANSI_NULLS) | (1L << T_ANSI_PADDING) | (1L << T_AS) | (1L << T_ASC) | (1L << T_ASSOCIATE) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BATCHSIZE) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CALLER) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLIENT) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECT) | (1L << T_COLLECTION) | (1L << T_COLUMN) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMMIT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COPY) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CREATION) | (1L << T_CREATOR) | (1L << T_CS) | (1L << T_CURRENT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_CURRENT_SCHEMA - 64)) | (1L << (T_CURSOR - 64)) | (1L << (T_DATABASE - 64)) | (1L << (T_DATA - 64)) | (1L << (T_DATE - 64)) | (1L << (T_DATETIME - 64)) | (1L << (T_DAY - 64)) | (1L << (T_DAYS - 64)) | (1L << (T_DEC - 64)) | (1L << (T_DECIMAL - 64)) | (1L << (T_DECLARE - 64)) | (1L << (T_DEFAULT - 64)) | (1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DELIMITER - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DESCRIBE - 64)) | (1L << (T_DIAGNOSTICS - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DIRECTORY - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DO - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DROP - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXEC - 64)) | (1L << (T_EXECUTE - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FETCH - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FILE - 64)) | (1L << (T_FILES - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GET - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)) | (1L << (T_GRANT - 64)) | (1L << (T_GROUP - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_HANDLER - 128)) | (1L << (T_HASH - 128)) | (1L << (T_HAVING - 128)) | (1L << (T_HDFS - 128)) | (1L << (T_HIVE - 128)) | (1L << (T_HOST - 128)) | (1L << (T_IDENTITY - 128)) | (1L << (T_IF - 128)) | (1L << (T_IGNORE - 128)) | (1L << (T_IMMEDIATE - 128)) | (1L << (T_IN - 128)) | (1L << (T_INCLUDE - 128)) | (1L << (T_INDEX - 128)) | (1L << (T_INITRANS - 128)) | (1L << (T_INNER - 128)) | (1L << (T_INOUT - 128)) | (1L << (T_INSERT - 128)) | (1L << (T_INT2 - 128)) | (1L << (T_INT4 - 128)) | (1L << (T_INT8 - 128)) | (1L << (T_INTEGER - 128)) | (1L << (T_INTERSECT - 128)) | (1L << (T_INTERVAL - 128)) | (1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCATOR - 128)) | (1L << (T_LOCATORS - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MATCHED - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MERGE - 128)) | (1L << (T_MESSAGE_TEXT - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NEW - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)) | (1L << (T_NOCOUNT - 128)) | (1L << (T_NOCOMPRESS - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_NOLOGGING - 192)) | (1L << (T_NONE - 192)) | (1L << (T_NOT - 192)) | (1L << (T_NOTFOUND - 192)) | (1L << (T_NUMERIC - 192)) | (1L << (T_NUMBER - 192)) | (1L << (T_OBJECT - 192)) | (1L << (T_OFF - 192)) | (1L << (T_ON - 192)) | (1L << (T_ONLY - 192)) | (1L << (T_OPEN - 192)) | (1L << (T_OR - 192)) | (1L << (T_ORDER - 192)) | (1L << (T_OUT - 192)) | (1L << (T_OUTER - 192)) | (1L << (T_OVER - 192)) | (1L << (T_OVERWRITE - 192)) | (1L << (T_OWNER - 192)) | (1L << (T_PACKAGE - 192)) | (1L << (T_PARTITION - 192)) | (1L << (T_PCTFREE - 192)) | (1L << (T_PCTUSED - 192)) | (1L << (T_PRECISION - 192)) | (1L << (T_PRESERVE - 192)) | (1L << (T_PRIMARY - 192)) | (1L << (T_PRINT - 192)) | (1L << (T_PROC - 192)) | (1L << (T_PROCEDURE - 192)) | (1L << (T_QUALIFY - 192)) | (1L << (T_QUERY_BAND - 192)) | (1L << (T_QUIT - 192)) | (1L << (T_QUOTED_IDENTIFIER - 192)) | (1L << (T_RAISE - 192)) | (1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESIGNAL - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROLE - 192)) | (1L << (T_ROLLBACK - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)) | (1L << (T_ROW_COUNT - 192)) | (1L << (T_RR - 192)) | (1L << (T_RS - 192)) | (1L << (T_PWD - 192)) | (1L << (T_TRIM - 192)) | (1L << (T_SCHEMA - 192)) | (1L << (T_SECOND - 192)) | (1L << (T_SECONDS - 192)) | (1L << (T_SECURITY - 192)) | (1L << (T_SEGMENT - 192)) | (1L << (T_SEL - 192)) | (1L << (T_SELECT - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_SET - 256)) | (1L << (T_SESSION - 256)) | (1L << (T_SESSIONS - 256)) | (1L << (T_SETS - 256)) | (1L << (T_SHARE - 256)) | (1L << (T_SIGNAL - 256)) | (1L << (T_SIMPLE_DOUBLE - 256)) | (1L << (T_SIMPLE_FLOAT - 256)) | (1L << (T_SMALLDATETIME - 256)) | (1L << (T_SMALLINT - 256)) | (1L << (T_SQL - 256)) | (1L << (T_SQLEXCEPTION - 256)) | (1L << (T_SQLINSERT - 256)) | (1L << (T_SQLSTATE - 256)) | (1L << (T_SQLWARNING - 256)) | (1L << (T_STATS - 256)) | (1L << (T_STATISTICS - 256)) | (1L << (T_STEP - 256)) | (1L << (T_STORAGE - 256)) | (1L << (T_STORED - 256)) | (1L << (T_SUBDIR - 256)) | (1L << (T_SUBSTRING - 256)) | (1L << (T_SUM - 256)) | (1L << (T_SUMMARY - 256)) | (1L << (T_SYS_REFCURSOR - 256)) | (1L << (T_TABLE - 256)) | (1L << (T_TABLESPACE - 256)) | (1L << (T_TEMPORARY - 256)) | (1L << (T_TERMINATED - 256)) | (1L << (T_TEXTIMAGE_ON - 256)) | (1L << (T_THEN - 256)) | (1L << (T_TIMESTAMP - 256)) | (1L << (T_TITLE - 256)) | (1L << (T_TO - 256)) | (1L << (T_TOP - 256)) | (1L << (T_TRANSACTION - 256)) | (1L << (T_TRUE - 256)) | (1L << (T_TRUNCATE - 256)) | (1L << (T_UNIQUE - 256)) | (1L << (T_UPDATE - 256)) | (1L << (T_UR - 256)) | (1L << (T_USE - 256)) | (1L << (T_USING - 256)) | (1L << (T_VALUE - 256)) | (1L << (T_VALUES - 256)) | (1L << (T_VAR - 256)) | (1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_VARYING - 256)) | (1L << (T_VOLATILE - 256)) | (1L << (T_WHILE - 256)) | (1L << (T_WITH - 256)) | (1L << (T_WITHOUT - 256)) | (1L << (T_WORK - 256)) | (1L << (T_XACT_ABORT - 256)) | (1L << (T_XML - 256)) | (1L << (T_YES - 256)))) != 0) || ((((_la - 321)) & ~0x3f) == 0 && ((1L << (_la - 321)) & ((1L << (T_ACTIVITY_COUNT - 321)) | (1L << (T_CUME_DIST - 321)) | (1L << (T_CURRENT_DATE - 321)) | (1L << (T_CURRENT_TIMESTAMP - 321)) | (1L << (T_CURRENT_USER - 321)) | (1L << (T_DENSE_RANK - 321)) | (1L << (T_FIRST_VALUE - 321)) | (1L << (T_LAG - 321)) | (1L << (T_LAST_VALUE - 321)) | (1L << (T_LEAD - 321)) | (1L << (T_PART_COUNT - 321)) | (1L << (T_PART_LOC - 321)) | (1L << (T_RANK - 321)) | (1L << (T_ROW_NUMBER - 321)) | (1L << (T_STDEV - 321)) | (1L << (T_SYSDATE - 321)) | (1L << (T_VARIANCE - 321)) | (1L << (T_USER - 321)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return block_b_end_sempred((Block_b_endContext)_localctx, predIndex);
		case 5:
			return block_end_sempred((Block_endContext)_localctx, predIndex);
		case 7:
			return block_b_end_function_sempred((Block_b_end_functionContext)_localctx, predIndex);
		case 80:
			return bool_expr_c_plus_plus_sempred((Bool_expr_c_plus_plusContext)_localctx, predIndex);
		case 84:
			return expr_cpp_sempred((Expr_cppContext)_localctx, predIndex);
		case 89:
			return create_routine_params_sempred((Create_routine_paramsContext)_localctx, predIndex);
		case 131:
			return from_alias_clause_sempred((From_alias_clauseContext)_localctx, predIndex);
		case 140:
			return bool_expr_sempred((Bool_exprContext)_localctx, predIndex);
		case 148:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean block_b_end_sempred(Block_b_endContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return !_input.LT(2).getText().equalsIgnoreCase("TRANSACTION");
		}
		return true;
	}
	private boolean block_end_sempred(Block_endContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return !_input.LT(2).getText().equalsIgnoreCase("TRANSACTION");
		}
		return true;
	}
	private boolean block_b_end_function_sempred(Block_b_end_functionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return !_input.LT(2).getText().equalsIgnoreCase("TRANSACTION");
		}
		return true;
	}
	private boolean bool_expr_c_plus_plus_sempred(Bool_expr_c_plus_plusContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expr_cpp_sempred(Expr_cppContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 8);
		case 8:
			return precpred(_ctx, 12);
		}
		return true;
	}
	private boolean create_routine_params_sempred(Create_routine_paramsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return !_input.LT(1).getText().equalsIgnoreCase("IS") &&
		        !_input.LT(1).getText().equalsIgnoreCase("AS") &&
		        !(_input.LT(1).getText().equalsIgnoreCase("DYNAMIC") && _input.LT(2).getText().equalsIgnoreCase("RESULT"))
		        ;
		}
		return true;
	}
	private boolean from_alias_clause_sempred(From_alias_clauseContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return !_input.LT(1).getText().equalsIgnoreCase("EXEC") &&
		        !_input.LT(1).getText().equalsIgnoreCase("EXECUTE") &&
		        !_input.LT(1).getText().equalsIgnoreCase("INNER") &&
		        !_input.LT(1).getText().equalsIgnoreCase("LEFT") &&
		        !_input.LT(1).getText().equalsIgnoreCase("GROUP") &&
		        !_input.LT(1).getText().equalsIgnoreCase("ORDER") &&
		        !_input.LT(1).getText().equalsIgnoreCase("LIMIT") &&
		        !_input.LT(1).getText().equalsIgnoreCase("WITH");
		}
		return true;
	}
	private boolean bool_expr_sempred(Bool_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 13);
		case 13:
			return precpred(_ctx, 12);
		case 14:
			return precpred(_ctx, 11);
		case 15:
			return precpred(_ctx, 10);
		case 16:
			return precpred(_ctx, 14);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0181\u0a2d\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\3\2\3\2\3\2\3\3\3\3\5\3\u0164\n\3\7\3"+
		"\u0166\n\3\f\3\16\3\u0169\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0173"+
		"\n\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u017e\n\6\5\6\u0180\n\6\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\5\n\u0190\n\n\3"+
		"\n\7\n\u0193\n\n\f\n\16\n\u0196\13\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u019e"+
		"\n\n\3\n\7\n\u01a1\n\n\f\n\16\n\u01a4\13\n\3\n\3\n\5\n\u01a8\n\n\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\5\r\u01c0\n\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\7\17"+
		"\u01c9\n\17\f\17\16\17\u01cc\13\17\3\20\3\20\3\20\3\20\3\20\5\20\u01d3"+
		"\n\20\3\21\3\21\3\21\7\21\u01d8\n\21\f\21\16\21\u01db\13\21\3\21\5\21"+
		"\u01de\n\21\3\21\3\21\5\21\u01e2\n\21\3\21\7\21\u01e5\n\21\f\21\16\21"+
		"\u01e8\13\21\3\21\5\21\u01eb\n\21\3\21\3\21\3\21\5\21\u01f0\n\21\3\21"+
		"\3\21\5\21\u01f4\n\21\3\21\3\21\5\21\u01f8\n\21\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\3\23\5\23\u0202\n\23\3\23\3\23\5\23\u0206\n\23\3\23\3\23"+
		"\3\23\5\23\u020b\n\23\3\24\3\24\3\24\5\24\u0210\n\24\3\24\3\24\5\24\u0214"+
		"\n\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0221"+
		"\n\26\3\26\3\26\3\27\5\27\u0226\n\27\3\27\3\27\3\27\3\27\5\27\u022c\n"+
		"\27\3\27\3\27\3\30\3\30\3\30\3\30\5\30\u0234\n\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\5\31\u023d\n\31\3\31\3\31\3\32\3\32\3\32\3\32\5\32\u0245"+
		"\n\32\3\32\5\32\u0248\n\32\3\32\3\32\3\32\5\32\u024d\n\32\3\32\3\32\3"+
		"\33\5\33\u0252\n\33\3\33\3\33\3\33\3\33\3\33\5\33\u0259\n\33\3\33\3\33"+
		"\3\33\3\33\3\33\5\33\u0260\n\33\3\33\5\33\u0263\n\33\3\34\5\34\u0266\n"+
		"\34\3\34\3\34\3\34\3\34\3\34\5\34\u026d\n\34\3\34\3\34\3\34\7\34\u0272"+
		"\n\34\f\34\16\34\u0275\13\34\3\34\5\34\u0278\n\34\3\34\5\34\u027b\n\34"+
		"\3\35\7\35\u027e\n\35\f\35\16\35\u0281\13\35\3\35\3\35\3\35\7\35\u0286"+
		"\n\35\f\35\16\35\u0289\13\35\3\36\3\36\3\36\3\37\3\37\3\37\7\37\u0291"+
		"\n\37\f\37\16\37\u0294\13\37\3 \3 \3 \3 \3 \5 \u029b\n \3 \5 \u029e\n"+
		" \3!\3!\3\"\3\"\5\"\u02a4\n\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\7\"\u02b0\n\"\f\"\16\"\u02b3\13\"\3\"\3\"\3\"\3\"\3\"\7\"\u02ba\n\"\f"+
		"\"\16\"\u02bd\13\"\3\"\3\"\3\"\5\"\u02c2\n\"\3#\3#\3#\5#\u02c7\n#\3#\3"+
		"#\3#\5#\u02cc\n#\3#\3#\3#\5#\u02d1\n#\7#\u02d3\n#\f#\16#\u02d6\13#\3#"+
		"\3#\5#\u02da\n#\3#\5#\u02dd\n#\3#\3#\3#\3#\3#\3#\7#\u02e5\n#\f#\16#\u02e8"+
		"\13#\3#\3#\3#\3#\3#\3#\3#\7#\u02f1\n#\f#\16#\u02f4\13#\3#\3#\7#\u02f8"+
		"\n#\f#\16#\u02fb\13#\5#\u02fd\n#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u0309"+
		"\n$\3%\6%\u030c\n%\r%\16%\u030d\3&\3&\3&\5&\u0313\n&\3\'\5\'\u0316\n\'"+
		"\3\'\3\'\3(\6(\u031b\n(\r(\16(\u031c\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*"+
		"\3*\3*\3*\3*\5*\u032e\n*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\6+\u033b\n+"+
		"\r+\16+\u033c\3+\3+\3+\5+\u0342\n+\3,\5,\u0345\n,\3,\3,\3,\3,\3,\3,\3"+
		",\3,\3,\3,\3,\7,\u0352\n,\f,\16,\u0355\13,\3,\3,\3,\5,\u035a\n,\3,\3,"+
		"\3,\3,\3,\3,\3,\3,\3,\5,\u0365\n,\3-\5-\u0368\n-\3-\3-\3-\3-\3-\3-\7-"+
		"\u0370\n-\f-\16-\u0373\13-\3-\3-\3-\3-\5-\u0379\n-\3.\3.\3.\3.\3.\3.\5"+
		".\u0381\n.\3/\3/\3/\3/\7/\u0387\n/\f/\16/\u038a\13/\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\5\60\u0394\n\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u03a8\n\60"+
		"\3\61\3\61\3\61\3\61\5\61\u03ae\n\61\3\62\3\62\5\62\u03b2\n\62\3\62\3"+
		"\62\3\62\5\62\u03b7\n\62\3\62\3\62\5\62\u03bb\n\62\3\62\3\62\3\62\5\62"+
		"\u03c0\n\62\3\62\5\62\u03c3\n\62\3\62\3\62\3\62\5\62\u03c8\n\62\3\62\5"+
		"\62\u03cb\n\62\3\63\3\63\3\63\5\63\u03d0\n\63\3\63\3\63\5\63\u03d4\n\63"+
		"\3\63\3\63\3\64\5\64\u03d9\n\64\3\64\3\64\3\64\3\64\3\64\5\64\u03e0\n"+
		"\64\3\64\5\64\u03e3\n\64\3\65\5\65\u03e6\n\65\3\65\3\65\3\65\5\65\u03eb"+
		"\n\65\3\65\3\65\5\65\u03ef\n\65\5\65\u03f1\n\65\3\66\3\66\3\66\3\66\5"+
		"\66\u03f7\n\66\3\66\3\66\5\66\u03fb\n\66\3\66\5\66\u03fe\n\66\3\66\3\66"+
		"\3\67\3\67\3\67\5\67\u0405\n\67\38\38\38\38\38\38\38\38\38\58\u0410\n"+
		"8\39\39\39\39\39\79\u0417\n9\f9\169\u041a\139\3:\3:\3:\3:\5:\u0420\n:"+
		"\3:\3:\3:\3:\3:\5:\u0427\n:\5:\u0429\n:\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;"+
		"\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\5;\u043f\n;\3<\3<\3=\3=\3=\3=\3=\3=\3="+
		"\3=\3=\3=\5=\u044d\n=\3>\3>\5>\u0451\n>\3?\3?\3?\3@\3@\3@\5@\u0459\n@"+
		"\3A\3A\3A\7A\u045e\nA\fA\16A\u0461\13A\3B\3B\3B\5B\u0466\nB\3C\3C\3C\3"+
		"D\3D\3D\5D\u046e\nD\3D\3D\3D\3D\3D\3D\3D\5D\u0477\nD\3D\3D\3D\5D\u047c"+
		"\nD\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F"+
		"\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\5F\u049e\nF\3G\3G\3G\3G\3H\3H\3H\3H\7H"+
		"\u04a8\nH\fH\16H\u04ab\13H\5H\u04ad\nH\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\7"+
		"H\u04b9\nH\fH\16H\u04bc\13H\5H\u04be\nH\3H\3H\3H\3H\7H\u04c4\nH\fH\16"+
		"H\u04c7\13H\5H\u04c9\nH\3H\3H\3I\3I\3I\5I\u04d0\nI\3I\5I\u04d3\nI\3J\3"+
		"J\3K\3K\3L\3L\3L\3L\3L\3M\3M\3M\3N\3N\3N\3O\3O\3O\5O\u04e7\nO\3P\3P\7"+
		"P\u04eb\nP\fP\16P\u04ee\13P\3P\5P\u04f1\nP\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\5Q"+
		"\u04fb\nQ\3R\3R\5R\u04ff\nR\3R\3R\3R\3R\3R\3R\5R\u0507\nR\3R\5R\u050a"+
		"\nR\3R\3R\3R\3R\7R\u0510\nR\fR\16R\u0513\13R\3S\3S\3T\3T\3T\3T\3U\3U\5"+
		"U\u051d\nU\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\6V\u052b\nV\rV\16V\u052c"+
		"\5V\u052f\nV\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\7V\u053f\nV\fV"+
		"\16V\u0542\13V\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\5W\u054e\nW\3X\3X\3X\3X\3"+
		"X\7X\u0555\nX\fX\16X\u0558\13X\3Y\3Y\3Y\5Y\u055d\nY\3Z\3Z\3Z\3Z\5Z\u0563"+
		"\nZ\3Z\5Z\u0566\nZ\3Z\5Z\u0569\nZ\3Z\5Z\u056c\nZ\3Z\5Z\u056f\nZ\3Z\3Z"+
		"\3Z\3Z\5Z\u0575\nZ\3[\3[\3[\3[\3[\3[\7[\u057d\n[\f[\16[\u0580\13[\3[\3"+
		"[\3[\3[\3[\3[\7[\u0588\n[\f[\16[\u058b\13[\5[\u058d\n[\3\\\3\\\3\\\3\\"+
		"\3\\\5\\\u0594\n\\\3\\\3\\\3\\\5\\\u0599\n\\\3\\\7\\\u059c\n\\\f\\\16"+
		"\\\u059f\13\\\3\\\5\\\u05a2\n\\\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u05aa\n\\"+
		"\3\\\3\\\5\\\u05ae\n\\\3\\\7\\\u05b1\n\\\f\\\16\\\u05b4\13\\\3\\\5\\\u05b7"+
		"\n\\\5\\\u05b9\n\\\3]\6]\u05bc\n]\r]\16]\u05bd\3^\3^\3^\3^\3^\3^\5^\u05c6"+
		"\n^\3^\3^\3^\5^\u05cb\n^\3_\3_\3_\5_\u05d0\n_\3`\3`\3`\3`\3`\7`\u05d7"+
		"\n`\f`\16`\u05da\13`\3`\5`\u05dd\n`\3`\3`\3`\3a\3a\3a\3a\3a\5a\u05e7\n"+
		"a\3b\3b\3b\3b\3b\3b\3c\3c\3c\3c\3c\3d\3d\3d\3e\3e\5e\u05f9\ne\3e\3e\3"+
		"e\3e\3e\3e\3e\3e\7e\u0603\ne\fe\16e\u0606\13e\3e\3e\3f\3f\5f\u060c\nf"+
		"\3g\3g\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\7h\u061a\nh\fh\16h\u061d\13h\3h\3"+
		"h\7h\u0621\nh\fh\16h\u0624\13h\3i\3i\3i\3i\5i\u062a\ni\3i\3i\5i\u062e"+
		"\ni\3i\3i\3i\3i\3i\3j\3j\3j\3j\5j\u0639\nj\3j\3j\3j\3j\3j\5j\u0640\nj"+
		"\3j\3j\3j\3j\3j\3k\3k\3k\3k\3k\3k\5k\u064d\nk\3l\5l\u0650\nl\3l\3l\3m"+
		"\3m\3m\3m\7m\u0658\nm\fm\16m\u065b\13m\3n\3n\5n\u065f\nn\3n\3n\3n\3n\3"+
		"n\3o\3o\3o\3o\7o\u066a\no\fo\16o\u066d\13o\3o\3o\3p\3p\3p\3p\7p\u0675"+
		"\np\fp\16p\u0678\13p\3q\3q\3q\3q\3q\5q\u067f\nq\3r\3r\5r\u0683\nr\3r\3"+
		"r\5r\u0687\nr\3r\3r\5r\u068b\nr\5r\u068d\nr\3s\3s\3s\5s\u0692\ns\3s\5"+
		"s\u0695\ns\3s\5s\u0698\ns\3s\5s\u069b\ns\3s\3s\5s\u069f\ns\3s\5s\u06a2"+
		"\ns\3s\5s\u06a5\ns\3t\5t\u06a8\nt\3t\5t\u06ab\nt\3t\3t\3t\7t\u06b0\nt"+
		"\ft\16t\u06b3\13t\3u\3u\3v\3v\3v\3w\7w\u06bb\nw\fw\16w\u06be\13w\3w\3"+
		"w\3w\3w\3w\5w\u06c5\nw\3w\3w\5w\u06c9\nw\3w\5w\u06cc\nw\5w\u06ce\nw\3"+
		"x\3x\5x\u06d2\nx\3y\3y\3z\5z\u06d7\nz\3z\3z\3z\3z\3z\5z\u06de\nz\3{\3"+
		"{\5{\u06e2\n{\3{\3{\3|\3|\3|\3|\7|\u06ea\n|\f|\16|\u06ed\13|\3}\3}\3}"+
		"\7}\u06f2\n}\f}\16}\u06f5\13}\3~\3~\3~\5~\u06fa\n~\3\177\3\177\5\177\u06fe"+
		"\n\177\3\u0080\3\u0080\3\u0080\3\u0080\5\u0080\u0704\n\u0080\3\u0081\3"+
		"\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\5\u0081\u070d\n\u0081\3"+
		"\u0082\5\u0082\u0710\n\u0082\3\u0082\3\u0082\3\u0082\5\u0082\u0715\n\u0082"+
		"\3\u0082\5\u0082\u0718\n\u0082\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\7\u0083\u0720\n\u0083\f\u0083\16\u0083\u0723\13\u0083\3\u0083"+
		"\3\u0083\5\u0083\u0727\n\u0083\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084"+
		"\7\u0084\u072e\n\u0084\f\u0084\16\u0084\u0731\13\u0084\3\u0084\3\u0084"+
		"\5\u0084\u0735\n\u0084\3\u0085\3\u0085\5\u0085\u0739\n\u0085\3\u0085\3"+
		"\u0085\3\u0085\3\u0085\3\u0085\7\u0085\u0740\n\u0085\f\u0085\16\u0085"+
		"\u0743\13\u0085\3\u0085\5\u0085\u0746\n\u0085\3\u0086\3\u0086\3\u0087"+
		"\3\u0087\3\u0087\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\7\u0088\u0752"+
		"\n\u0088\f\u0088\16\u0088\u0755\13\u0088\3\u0089\3\u0089\3\u0089\3\u008a"+
		"\3\u008a\3\u008a\3\u008b\3\u008b\3\u008b\3\u008b\5\u008b\u0761\n\u008b"+
		"\3\u008b\3\u008b\3\u008b\5\u008b\u0766\n\u008b\7\u008b\u0768\n\u008b\f"+
		"\u008b\16\u008b\u076b\13\u008b\3\u008b\3\u008b\3\u008b\5\u008b\u0770\n"+
		"\u008b\3\u008c\6\u008c\u0773\n\u008c\r\u008c\16\u008c\u0774\3\u008d\3"+
		"\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\5\u008d"+
		"\u0780\n\u008d\5\u008d\u0782\n\u008d\3\u008e\3\u008e\5\u008e\u0786\n\u008e"+
		"\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\5\u008e\u078d\n\u008e\3\u008e"+
		"\3\u008e\3\u008e\3\u008e\7\u008e\u0793\n\u008e\f\u008e\16\u008e\u0796"+
		"\13\u008e\3\u008f\3\u008f\3\u008f\5\u008f\u079b\n\u008f\3\u0090\3\u0090"+
		"\3\u0090\5\u0090\u07a0\n\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090"+
		"\3\u0090\3\u0090\3\u0090\3\u0090\5\u0090\u07ab\n\u0090\3\u0090\3\u0090"+
		"\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\5\u0090\u07b4\n\u0090\3\u0091"+
		"\3\u0091\5\u0091\u07b8\n\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\7\u0091\u07bf\n\u0091\f\u0091\16\u0091\u07c2\13\u0091\3\u0091\5\u0091"+
		"\u07c5\n\u0091\3\u0091\3\u0091\3\u0092\3\u0092\3\u0092\3\u0092\7\u0092"+
		"\u07cd\n\u0092\f\u0092\16\u0092\u07d0\13\u0092\3\u0092\3\u0092\5\u0092"+
		"\u07d4\n\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0093\3\u0093"+
		"\3\u0093\3\u0093\3\u0093\5\u0093\u07e0\n\u0093\3\u0094\3\u0094\3\u0095"+
		"\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\5\u0095\u07f4\n\u0095"+
		"\3\u0095\5\u0095\u07f7\n\u0095\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096"+
		"\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096"+
		"\3\u0096\3\u0096\5\u0096\u0809\n\u0096\3\u0096\3\u0096\3\u0096\3\u0096"+
		"\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096"+
		"\3\u0096\7\u0096\u0819\n\u0096\f\u0096\16\u0096\u081c\13\u0096\3\u0097"+
		"\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\5\u0097\u0826"+
		"\n\u0097\3\u0098\3\u0098\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\7\u0099"+
		"\u082f\n\u0099\f\u0099\16\u0099\u0832\13\u0099\3\u009a\3\u009a\3\u009a"+
		"\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\5\u009a\u083d\n\u009a"+
		"\3\u009b\3\u009b\5\u009b\u0841\n\u009b\3\u009c\3\u009c\3\u009c\3\u009c"+
		"\3\u009c\3\u009c\3\u009c\6\u009c\u084a\n\u009c\r\u009c\16\u009c\u084b"+
		"\3\u009c\3\u009c\5\u009c\u0850\n\u009c\3\u009c\3\u009c\3\u009d\3\u009d"+
		"\3\u009d\3\u009d\3\u009d\3\u009d\6\u009d\u085a\n\u009d\r\u009d\16\u009d"+
		"\u085b\3\u009d\3\u009d\5\u009d\u0860\n\u009d\3\u009d\3\u009d\3\u009e\3"+
		"\u009e\3\u009e\3\u009e\3\u009f\3\u009f\3\u009f\5\u009f\u086b\n\u009f\3"+
		"\u009f\3\u009f\3\u009f\5\u009f\u0870\n\u009f\3\u009f\3\u009f\3\u009f\5"+
		"\u009f\u0875\n\u009f\3\u009f\3\u009f\5\u009f\u0879\n\u009f\3\u009f\3\u009f"+
		"\5\u009f\u087d\n\u009f\3\u009f\3\u009f\3\u009f\5\u009f\u0882\n\u009f\3"+
		"\u009f\3\u009f\5\u009f\u0886\n\u009f\3\u009f\3\u009f\5\u009f\u088a\n\u009f"+
		"\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f"+
		"\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f"+
		"\3\u009f\3\u009f\3\u009f\5\u009f\u08a1\n\u009f\5\u009f\u08a3\n\u009f\3"+
		"\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f"+
		"\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\5\u009f\u08b5"+
		"\n\u009f\5\u009f\u08b7\n\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f"+
		"\3\u009f\5\u009f\u08bf\n\u009f\3\u009f\3\u009f\3\u009f\5\u009f\u08c4\n"+
		"\u009f\3\u009f\3\u009f\3\u009f\5\u009f\u08c9\n\u009f\3\u009f\3\u009f\3"+
		"\u009f\5\u009f\u08ce\n\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3"+
		"\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\5\u009f\u08db\n\u009f\3"+
		"\u009f\3\u009f\3\u009f\5\u009f\u08e0\n\u009f\3\u009f\3\u009f\3\u009f\5"+
		"\u009f\u08e5\n\u009f\3\u009f\3\u009f\3\u009f\5\u009f\u08ea\n\u009f\3\u009f"+
		"\3\u009f\3\u009f\5\u009f\u08ef\n\u009f\3\u009f\3\u009f\3\u009f\5\u009f"+
		"\u08f4\n\u009f\3\u009f\3\u009f\3\u009f\5\u009f\u08f9\n\u009f\3\u009f\3"+
		"\u009f\3\u009f\5\u009f\u08fe\n\u009f\5\u009f\u0900\n\u009f\3\u00a0\3\u00a0"+
		"\3\u00a1\3\u00a1\3\u00a1\5\u00a1\u0907\n\u00a1\3\u00a1\5\u00a1\u090a\n"+
		"\u00a1\3\u00a1\3\u00a1\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\7\u00a2"+
		"\u0913\n\u00a2\f\u00a2\16\u00a2\u0916\13\u00a2\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a3\3\u00a3\3\u00a3\5\u00a3\u091f\n\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a3\3\u00a3\3\u00a3\5\u00a3\u0927\n\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\5\u00a3\u0930\n\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a3\3\u00a3\5\u00a3\u0936\n\u00a3\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\7\u00a3\u0945\n\u00a3\f\u00a3\16\u00a3\u0948\13\u00a3\5\u00a3"+
		"\u094a\n\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\7\u00a3\u0958\n\u00a3\f\u00a3"+
		"\16\u00a3\u095b\13\u00a3\5\u00a3\u095d\n\u00a3\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3"+
		"\7\u00a3\u096b\n\u00a3\f\u00a3\16\u00a3\u096e\13\u00a3\5\u00a3\u0970\n"+
		"\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a3\3\u00a3\3\u00a3\7\u00a3\u097e\n\u00a3\f\u00a3\16\u00a3"+
		"\u0981\13\u00a3\5\u00a3\u0983\n\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\7\u00a3"+
		"\u0991\n\u00a3\f\u00a3\16\u00a3\u0994\13\u00a3\5\u00a3\u0996\n\u00a3\3"+
		"\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a3\3\u00a3\7\u00a3\u09a4\n\u00a3\f\u00a3\16\u00a3\u09a7"+
		"\13\u00a3\5\u00a3\u09a9\n\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\7\u00a3\u09b5\n\u00a3\f\u00a3"+
		"\16\u00a3\u09b8\13\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a3\3\u00a3\3\u00a3\6\u00a3\u09c4\n\u00a3\r\u00a3\16\u00a3"+
		"\u09c5\3\u00a3\3\u00a3\5\u00a3\u09ca\n\u00a3\3\u00a3\3\u00a3\3\u00a3\3"+
		"\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a3\5\u00a3\u09da\n\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3"+
		"\5\u00a3\u09e0\n\u00a3\3\u00a4\3\u00a4\3\u00a4\5\u00a4\u09e5\n\u00a4\3"+
		"\u00a4\3\u00a4\3\u00a5\3\u00a5\3\u00a5\7\u00a5\u09ec\n\u00a5\f\u00a5\16"+
		"\u00a5\u09ef\13\u00a5\3\u00a6\3\u00a6\5\u00a6\u09f3\n\u00a6\3\u00a6\3"+
		"\u00a6\3\u00a6\5\u00a6\u09f8\n\u00a6\5\u00a6\u09fa\n\u00a6\3\u00a6\5\u00a6"+
		"\u09fd\n\u00a6\3\u00a7\3\u00a7\3\u00a7\3\u00a8\3\u00a8\3\u00a8\3\u00a9"+
		"\3\u00a9\3\u00a9\5\u00a9\u0a08\n\u00a9\3\u00a9\3\u00a9\3\u00a9\5\u00a9"+
		"\u0a0d\n\u00a9\7\u00a9\u0a0f\n\u00a9\f\u00a9\16\u00a9\u0a12\13\u00a9\3"+
		"\u00a9\5\u00a9\u0a15\n\u00a9\5\u00a9\u0a17\n\u00a9\3\u00aa\3\u00aa\5\u00aa"+
		"\u0a1b\n\u00aa\3\u00ab\5\u00ab\u0a1e\n\u00ab\3\u00ab\3\u00ab\3\u00ac\5"+
		"\u00ac\u0a23\n\u00ac\3\u00ac\3\u00ac\3\u00ad\3\u00ad\3\u00ae\3\u00ae\3"+
		"\u00af\3\u00af\3\u00af\2\6\u00a2\u00aa\u011a\u012a\u00b0\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd"+
		"fhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa"+
		"\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2"+
		"\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da"+
		"\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2"+
		"\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a"+
		"\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122"+
		"\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a"+
		"\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152"+
		"\u0154\u0156\u0158\u015a\u015c\2)\5\2\3\4\u015f\u015f\u0170\u0170\5\2"+
		"\20\20vv\u009c\u009c\4\2##++\4\299mm\4\2\u00bb\u00bb\u0102\u0102\4\2\21"+
		"\21UU\4\2RR\u012e\u012e\4\2nn\u00ae\u00ae\4\2RR\u00db\u00db\4\2NN\u008b"+
		"\u008b\5\2\u008f\u008f\u00b5\u00b5\u00d7\u00d8\4\2\u00b0\u00b0\u00c2\u00c2"+
		"\4\2\u00bf\u00bf\u0141\u0141\4\2\u00b4\u00b4\u017a\u017a\4\2!!((\4\2&"+
		"&@@\4\2\20\20\u009c\u009c\3\2\u00ec\u00ed\3\2\u00de\u00df\t\2\31\31]]"+
		"tu\u0093\u0093\u0117\u0117\u0134\u0134\u0173\u0173\4\2\u015d\u015e\u0175"+
		"\u0175\4\2\u0161\u0161\u0165\u0168\4\2\u015e\u015e\u0175\u0175\6\2??P"+
		"P\u009b\u009b\u00d4\u00d4\3\2ab\4\2  \u0114\u0114\4\2\t\tZZ\5\2{{\u00a5"+
		"\u00a5\u00ef\u00ef\5\2@@\u00f7\u00f8\u012f\u012f\5\2kk\u0106\u0106\u012e"+
		"\u012e\4\2\u00c6\u00c6\u0129\u0129\4\2\f\f\u00ce\u00ce\5\2\u00a6\u00a6"+
		"\u00e6\u00e6\u00f0\u00f0\5\2HI\u00b8\u00b9\u00fc\u00fd\4\2\66\66\u015e"+
		"\u015e\5\2yy\u009d\u009d\u00c5\u00c5\4\2\u015b\u015b\u0171\u0171\4\2o"+
		"o\u0129\u0129\23\2\7\16\20\33\35_ccetv\u0092\u0094\u00c5\u00c7\u00d8\u00da"+
		"\u00f4\u00f6\u0109\u010b\u0116\u0118\u0123\u0125\u012a\u012d\u0138\u013b"+
		"\u0141\u0143\u014c\u0153\u015a\2\u0b59\2\u015e\3\2\2\2\4\u0167\3\2\2\2"+
		"\6\u0172\3\2\2\2\b\u0174\3\2\2\2\n\u017f\3\2\2\2\f\u0181\3\2\2\2\16\u0184"+
		"\3\2\2\2\20\u0188\3\2\2\2\22\u01a7\3\2\2\2\24\u01a9\3\2\2\2\26\u01ab\3"+
		"\2\2\2\30\u01bf\3\2\2\2\32\u01c1\3\2\2\2\34\u01c3\3\2\2\2\36\u01d2\3\2"+
		"\2\2 \u01f7\3\2\2\2\"\u01f9\3\2\2\2$\u0201\3\2\2\2&\u020c\3\2\2\2(\u0215"+
		"\3\2\2\2*\u0218\3\2\2\2,\u0225\3\2\2\2.\u022f\3\2\2\2\60\u0237\3\2\2\2"+
		"\62\u0240\3\2\2\2\64\u025f\3\2\2\2\66\u0277\3\2\2\28\u027f\3\2\2\2:\u028a"+
		"\3\2\2\2<\u028d\3\2\2\2>\u029d\3\2\2\2@\u029f\3\2\2\2B\u02c1\3\2\2\2D"+
		"\u02fc\3\2\2\2F\u02fe\3\2\2\2H\u030b\3\2\2\2J\u0312\3\2\2\2L\u0315\3\2"+
		"\2\2N\u031a\3\2\2\2P\u031e\3\2\2\2R\u032d\3\2\2\2T\u0341\3\2\2\2V\u0364"+
		"\3\2\2\2X\u0378\3\2\2\2Z\u0380\3\2\2\2\\\u0382\3\2\2\2^\u03a7\3\2\2\2"+
		"`\u03ad\3\2\2\2b\u03ca\3\2\2\2d\u03cc\3\2\2\2f\u03e2\3\2\2\2h\u03f0\3"+
		"\2\2\2j\u03f2\3\2\2\2l\u0401\3\2\2\2n\u0406\3\2\2\2p\u0411\3\2\2\2r\u0428"+
		"\3\2\2\2t\u043e\3\2\2\2v\u0440\3\2\2\2x\u044c\3\2\2\2z\u044e\3\2\2\2|"+
		"\u0452\3\2\2\2~\u0455\3\2\2\2\u0080\u045a\3\2\2\2\u0082\u0462\3\2\2\2"+
		"\u0084\u0467\3\2\2\2\u0086\u047b\3\2\2\2\u0088\u047d\3\2\2\2\u008a\u049d"+
		"\3\2\2\2\u008c\u049f\3\2\2\2\u008e\u04a3\3\2\2\2\u0090\u04d2\3\2\2\2\u0092"+
		"\u04d4\3\2\2\2\u0094\u04d6\3\2\2\2\u0096\u04d8\3\2\2\2\u0098\u04dd\3\2"+
		"\2\2\u009a\u04e0\3\2\2\2\u009c\u04e3\3\2\2\2\u009e\u04e8\3\2\2\2\u00a0"+
		"\u04fa\3\2\2\2\u00a2\u0509\3\2\2\2\u00a4\u0514\3\2\2\2\u00a6\u0516\3\2"+
		"\2\2\u00a8\u051c\3\2\2\2\u00aa\u052e\3\2\2\2\u00ac\u0543\3\2\2\2\u00ae"+
		"\u054f\3\2\2\2\u00b0\u055c\3\2\2\2\u00b2\u055e\3\2\2\2\u00b4\u058c\3\2"+
		"\2\2\u00b6\u05b8\3\2\2\2\u00b8\u05bb\3\2\2\2\u00ba\u05ca\3\2\2\2\u00bc"+
		"\u05cf\3\2\2\2\u00be\u05d1\3\2\2\2\u00c0\u05e1\3\2\2\2\u00c2\u05e8\3\2"+
		"\2\2\u00c4\u05ee\3\2\2\2\u00c6\u05f3\3\2\2\2\u00c8\u05f6\3\2\2\2\u00ca"+
		"\u0609\3\2\2\2\u00cc\u060d\3\2\2\2\u00ce\u060f\3\2\2\2\u00d0\u0625\3\2"+
		"\2\2\u00d2\u0634\3\2\2\2\u00d4\u064c\3\2\2\2\u00d6\u064f\3\2\2\2\u00d8"+
		"\u0653\3\2\2\2\u00da\u065c\3\2\2\2\u00dc\u0665\3\2\2\2\u00de\u0670\3\2"+
		"\2\2\u00e0\u067e\3\2\2\2\u00e2\u068c\3\2\2\2\u00e4\u068e\3\2\2\2\u00e6"+
		"\u06a7\3\2\2\2\u00e8\u06b4\3\2\2\2\u00ea\u06b6\3\2\2\2\u00ec\u06cd\3\2"+
		"\2\2\u00ee\u06cf\3\2\2\2\u00f0\u06d3\3\2\2\2\u00f2\u06dd\3\2\2\2\u00f4"+
		"\u06e1\3\2\2\2\u00f6\u06e5\3\2\2\2\u00f8\u06ee\3\2\2\2\u00fa\u06f9\3\2"+
		"\2\2\u00fc\u06fb\3\2\2\2\u00fe\u06ff\3\2\2\2\u0100\u070c\3\2\2\2\u0102"+
		"\u0717\3\2\2\2\u0104\u0719\3\2\2\2\u0106\u0734\3\2\2\2\u0108\u0736\3\2"+
		"\2\2\u010a\u0747\3\2\2\2\u010c\u0749\3\2\2\2\u010e\u074c\3\2\2\2\u0110"+
		"\u0756\3\2\2\2\u0112\u0759\3\2\2\2\u0114\u076f\3\2\2\2\u0116\u0772\3\2"+
		"\2\2\u0118\u0781\3\2\2\2\u011a\u078c\3\2\2\2\u011c\u079a\3\2\2\2\u011e"+
		"\u07b3\3\2\2\2\u0120\u07b5\3\2\2\2\u0122\u07c8\3\2\2\2\u0124\u07df\3\2"+
		"\2\2\u0126\u07e1\3\2\2\2\u0128\u07f6\3\2\2\2\u012a\u0808\3\2\2\2\u012c"+
		"\u0825\3\2\2\2\u012e\u0827\3\2\2\2\u0130\u0829\3\2\2\2\u0132\u083c\3\2"+
		"\2\2\u0134\u0840\3\2\2\2\u0136\u0842\3\2\2\2\u0138\u0853\3\2\2\2\u013a"+
		"\u0863\3\2\2\2\u013c\u08ff\3\2\2\2\u013e\u0901\3\2\2\2\u0140\u0903\3\2"+
		"\2\2\u0142\u090d\3\2\2\2\u0144\u09df\3\2\2\2\u0146\u09e1\3\2\2\2\u0148"+
		"\u09e8\3\2\2\2\u014a\u09fc\3\2\2\2\u014c\u09fe\3\2\2\2\u014e\u0a01\3\2"+
		"\2\2\u0150\u0a16\3\2\2\2\u0152\u0a1a\3\2\2\2\u0154\u0a1d\3\2\2\2\u0156"+
		"\u0a22\3\2\2\2\u0158\u0a26\3\2\2\2\u015a\u0a28\3\2\2\2\u015c\u0a2a\3\2"+
		"\2\2\u015e\u015f\5\4\3\2\u015f\u0160\7\2\2\3\u0160\3\3\2\2\2\u0161\u0164"+
		"\5\6\4\2\u0162\u0164\5\30\r\2\u0163\u0161\3\2\2\2\u0163\u0162\3\2\2\2"+
		"\u0164\u0166\3\2\2\2\u0165\u0163\3\2\2\2\u0166\u0169\3\2\2\2\u0167\u0165"+
		"\3\2\2\2\u0167\u0168\3\2\2\2\u0168\5\3\2\2\2\u0169\u0167\3\2\2\2\u016a"+
		"\u016b\7\27\2\2\u016b\u016c\5\4\3\2\u016c\u016d\5\f\7\2\u016d\u0173\3"+
		"\2\2\2\u016e\u016f\7\u016a\2\2\u016f\u0170\5\4\3\2\u0170\u0171\5\b\5\2"+
		"\u0171\u0173\3\2\2\2\u0172\u016a\3\2\2\2\u0172\u016e\3\2\2\2\u0173\7\3"+
		"\2\2\2\u0174\u0175\6\5\2\2\u0175\u0176\7\u016d\2\2\u0176\t\3\2\2\2\u0177"+
		"\u0178\7\27\2\2\u0178\u0179\5\4\3\2\u0179\u017a\5\f\7\2\u017a\u0180\3"+
		"\2\2\2\u017b\u017d\5\30\r\2\u017c\u017e\7\u0170\2\2\u017d\u017c\3\2\2"+
		"\2\u017d\u017e\3\2\2\2\u017e\u0180\3\2\2\2\u017f\u0177\3\2\2\2\u017f\u017b"+
		"\3\2\2\2\u0180\13\3\2\2\2\u0181\u0182\6\7\3\2\u0182\u0183\7d\2\2\u0183"+
		"\r\3\2\2\2\u0184\u0185\7\u016a\2\2\u0185\u0186\5\4\3\2\u0186\u0187\5\20"+
		"\t\2\u0187\17\3\2\2\2\u0188\u0189\6\t\4\2\u0189\u018a\5\26\f\2\u018a\u018b"+
		"\7\u016d\2\2\u018b\21\3\2\2\2\u018c\u018d\5\u0150\u00a9\2\u018d\u0194"+
		"\7\u016b\2\2\u018e\u0190\7\u015b\2\2\u018f\u018e\3\2\2\2\u018f\u0190\3"+
		"\2\2\2\u0190\u0191\3\2\2\2\u0191\u0193\5\u0150\u00a9\2\u0192\u018f\3\2"+
		"\2\2\u0193\u0196\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195"+
		"\u0197\3\2\2\2\u0196\u0194\3\2\2\2\u0197\u0198\7\u016e\2\2\u0198\u0199"+
		"\7\u0170\2\2\u0199\u01a8\3\2\2\2\u019a\u019b\7\u0174\2\2\u019b\u01a2\7"+
		"\u016b\2\2\u019c\u019e\7\u015b\2\2\u019d\u019c\3\2\2\2\u019d\u019e\3\2"+
		"\2\2\u019e\u019f\3\2\2\2\u019f\u01a1\5\u0150\u00a9\2\u01a0\u019d\3\2\2"+
		"\2\u01a1\u01a4\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a5"+
		"\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a5\u01a6\7\u016e\2\2\u01a6\u01a8\7\u0170"+
		"\2\2\u01a7\u018c\3\2\2\2\u01a7\u019a\3\2\2\2\u01a8\23\3\2\2\2\u01a9\u01aa"+
		"\5\6\4\2\u01aa\25\3\2\2\2\u01ab\u01ac\7\u00ec\2\2\u01ac\u01ad\5\u012a"+
		"\u0096\2\u01ad\u01ae\5\32\16\2\u01ae\27\3\2\2\2\u01af\u01c0\5\60\31\2"+
		"\u01b0\u01c0\5j\66\2\u01b1\u01c0\5\u00c8e\2\u01b2\u01c0\5\62\32\2\u01b3"+
		"\u01c0\5n8\2\u01b4\u01c0\5\u00acW\2\u01b5\u01c0\5\u00b2Z\2\u01b6\u01c0"+
		"\5.\30\2\u01b7\u01c0\5\u00d0i\2\u01b8\u01c0\5\u00d2j\2\u01b9\u01c0\5\u00bc"+
		"_\2\u01ba\u01c0\5\u00d6l\2\u01bb\u01c0\5\32\16\2\u01bc\u01c0\5\u0086D"+
		"\2\u01bd\u01c0\5x=\2\u01be\u01c0\5\22\n\2\u01bf\u01af\3\2\2\2\u01bf\u01b0"+
		"\3\2\2\2\u01bf\u01b1\3\2\2\2\u01bf\u01b2\3\2\2\2\u01bf\u01b3\3\2\2\2\u01bf"+
		"\u01b4\3\2\2\2\u01bf\u01b5\3\2\2\2\u01bf\u01b6\3\2\2\2\u01bf\u01b7\3\2"+
		"\2\2\u01bf\u01b8\3\2\2\2\u01bf\u01b9\3\2\2\2\u01bf\u01ba\3\2\2\2\u01bf"+
		"\u01bb\3\2\2\2\u01bf\u01bc\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01be\3\2"+
		"\2\2\u01c0\31\3\2\2\2\u01c1\u01c2\t\2\2\2\u01c2\33\3\2\2\2\u01c3\u01c4"+
		"\5\36\20\2\u01c4\u01ca\7\u0170\2\2\u01c5\u01c6\5\36\20\2\u01c6\u01c7\7"+
		"\u0170\2\2\u01c7\u01c9\3\2\2\2\u01c8\u01c5\3\2\2\2\u01c9\u01cc\3\2\2\2"+
		"\u01ca\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\35\3\2\2\2\u01cc\u01ca"+
		"\3\2\2\2\u01cd\u01d3\5$\23\2\u01ce\u01d3\5\"\22\2\u01cf\u01d3\5*\26\2"+
		"\u01d0\u01d3\5 \21\2\u01d1\u01d3\5,\27\2\u01d2\u01cd\3\2\2\2\u01d2\u01ce"+
		"\3\2\2\2\u01d2\u01cf\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d2\u01d1\3\2\2\2\u01d3"+
		"\37\3\2\2\2\u01d4\u01d9\5\u0150\u00a9\2\u01d5\u01d6\7\u015d\2\2\u01d6"+
		"\u01d8\5\u0150\u00a9\2\u01d7\u01d5\3\2\2\2\u01d8\u01db\3\2\2\2\u01d9\u01d7"+
		"\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01dd\3\2\2\2\u01db\u01d9\3\2\2\2\u01dc"+
		"\u01de\7\20\2\2\u01dd\u01dc\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01df\3"+
		"\2\2\2\u01df\u01e1\5v<\2\u01e0\u01e2\5d\63\2\u01e1\u01e0\3\2\2\2\u01e1"+
		"\u01e2\3\2\2\2\u01e2\u01e6\3\2\2\2\u01e3\u01e5\5f\64\2\u01e4\u01e3\3\2"+
		"\2\2\u01e5\u01e8\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7"+
		"\u01ea\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e9\u01eb\5h\65\2\u01ea\u01e9\3\2"+
		"\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01f8\3\2\2\2\u01ec\u01ed\5\u0150\u00a9"+
		"\2\u01ed\u01ef\7\63\2\2\u01ee\u01f0\7\20\2\2\u01ef\u01ee\3\2\2\2\u01ef"+
		"\u01f0\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f3\5v<\2\u01f2\u01f4\5d\63"+
		"\2\u01f3\u01f2\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f6"+
		"\5h\65\2\u01f6\u01f8\3\2\2\2\u01f7\u01d4\3\2\2\2\u01f7\u01ec\3\2\2\2\u01f8"+
		"!\3\2\2\2\u01f9\u01fa\5\u0150\u00a9\2\u01fa\u01fb\7\67\2\2\u01fb#\3\2"+
		"\2\2\u01fc\u01fd\7C\2\2\u01fd\u0202\5\u0150\u00a9\2\u01fe\u01ff\5\u0150"+
		"\u00a9\2\u01ff\u0200\7C\2\2\u0200\u0202\3\2\2\2\u0201\u01fc\3\2\2\2\u0201"+
		"\u01fe\3\2\2\2\u0202\u0205\3\2\2\2\u0203\u0206\5&\24\2\u0204\u0206\5("+
		"\25\2\u0205\u0203\3\2\2\2\u0205\u0204\3\2\2\2\u0205\u0206\3\2\2\2\u0206"+
		"\u0207\3\2\2\2\u0207\u020a\t\3\2\2\u0208\u020b\5\u00d6l\2\u0209\u020b"+
		"\5\u012a\u0096\2\u020a\u0208\3\2\2\2\u020a\u0209\3\2\2\2\u020b%\3\2\2"+
		"\2\u020c\u020d\7\u013c\2\2\u020d\u020f\7\u00ec\2\2\u020e\u0210\7\u00cc"+
		"\2\2\u020f\u020e\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0213\3\2\2\2\u0211"+
		"\u0212\7\u0126\2\2\u0212\u0214\t\4\2\2\u0213\u0211\3\2\2\2\u0213\u0214"+
		"\3\2\2\2\u0214\'\3\2\2\2\u0215\u0216\7\u013d\2\2\u0216\u0217\7\u00ec\2"+
		"\2\u0217)\3\2\2\2\u0218\u0219\t\5\2\2\u0219\u021a\7\u0082\2\2\u021a\u0220"+
		"\7v\2\2\u021b\u0221\7\u010e\2\2\u021c\u0221\7\u0111\2\2\u021d\u021e\7"+
		"\u00c4\2\2\u021e\u0221\7y\2\2\u021f\u0221\5\u0150\u00a9\2\u0220\u021b"+
		"\3\2\2\2\u0220\u021c\3\2\2\2\u0220\u021d\3\2\2\2\u0220\u021f\3\2\2\2\u0221"+
		"\u0222\3\2\2\2\u0222\u0223\5\n\6\2\u0223+\3\2\2\2\u0224\u0226\7~\2\2\u0225"+
		"\u0224\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0228\7\u011f"+
		"\2\2\u0228\u0229\7\u011d\2\2\u0229\u022b\5\u0150\u00a9\2\u022a\u022c\5"+
		"H%\2\u022b\u022a\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022d\3\2\2\2\u022d"+
		"\u022e\5\64\33\2\u022e-\3\2\2\2\u022f\u0230\7=\2\2\u0230\u0231\7\u011d"+
		"\2\2\u0231\u0233\5\u010a\u0086\2\u0232\u0234\5H%\2\u0233\u0232\3\2\2\2"+
		"\u0233\u0234\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0236\5\64\33\2\u0236/"+
		"\3\2\2\2\u0237\u0238\7=\2\2\u0238\u0239\7\u0142\2\2\u0239\u023a\7\u011d"+
		"\2\2\u023a\u023c\5\u010a\u0086\2\u023b\u023d\5H%\2\u023c\u023b\3\2\2\2"+
		"\u023c\u023d\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u023f\5\66\34\2\u023f\61"+
		"\3\2\2\2\u0240\u0247\7=\2\2\u0241\u0242\7\u00a9\2\2\u0242\u0248\7\u011f"+
		"\2\2\u0243\u0245\t\6\2\2\u0244\u0243\3\2\2\2\u0244\u0245\3\2\2\2\u0245"+
		"\u0246\3\2\2\2\u0246\u0248\7\u0138\2\2\u0247\u0241\3\2\2\2\u0247\u0244"+
		"\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024a\7\u011d\2\2\u024a\u024c\5\u0150"+
		"\u00a9\2\u024b\u024d\5H%\2\u024c\u024b\3\2\2\2\u024c\u024d\3\2\2\2\u024d"+
		"\u024e\3\2\2\2\u024e\u024f\5\64\33\2\u024f\63\3\2\2\2\u0250\u0252\7\20"+
		"\2\2\u0251\u0250\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0253\3\2\2\2\u0253"+
		"\u0254\7\u016b\2\2\u0254\u0255\5\u00d6l\2\u0255\u0256\7\u016e\2\2\u0256"+
		"\u0260\3\2\2\2\u0257\u0259\7\20\2\2\u0258\u0257\3\2\2\2\u0258\u0259\3"+
		"\2\2\2\u0259\u025a\3\2\2\2\u025a\u0260\5\u00d6l\2\u025b\u025c\7\u016b"+
		"\2\2\u025c\u025d\5<\37\2\u025d\u025e\7\u016e\2\2\u025e\u0260\3\2\2\2\u025f"+
		"\u0251\3\2\2\2\u025f\u0258\3\2\2\2\u025f\u025b\3\2\2\2\u0260\u0262\3\2"+
		"\2\2\u0261\u0263\5N(\2\u0262\u0261\3\2\2\2\u0262\u0263\3\2\2\2\u0263\65"+
		"\3\2\2\2\u0264\u0266\7\20\2\2\u0265\u0264\3\2\2\2\u0265\u0266\3\2\2\2"+
		"\u0266\u0267\3\2\2\2\u0267\u0268\7\u016b\2\2\u0268\u0269\5\u00d6l\2\u0269"+
		"\u026a\7\u016e\2\2\u026a\u0278\3\2\2\2\u026b\u026d\7\20\2\2\u026c\u026b"+
		"\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u0278\5\u00d6l"+
		"\2\u026f\u0273\7\u016b\2\2\u0270\u0272\58\35\2\u0271\u0270\3\2\2\2\u0272"+
		"\u0275\3\2\2\2\u0273\u0271\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0276\3\2"+
		"\2\2\u0275\u0273\3\2\2\2\u0276\u0278\7\u016e\2\2\u0277\u0265\3\2\2\2\u0277"+
		"\u026c\3\2\2\2\u0277\u026f\3\2\2\2\u0278\u027a\3\2\2\2\u0279\u027b\5N"+
		"(\2\u027a\u0279\3\2\2\2\u027a\u027b\3\2\2\2\u027b\67\3\2\2\2\u027c\u027e"+
		"\7\u015d\2\2\u027d\u027c\3\2\2\2\u027e\u0281\3\2\2\2\u027f\u027d\3\2\2"+
		"\2\u027f\u0280\3\2\2\2\u0280\u0282\3\2\2\2\u0281\u027f\3\2\2\2\u0282\u0287"+
		"\5:\36\2\u0283\u0284\7\62\2\2\u0284\u0286\5\u0152\u00aa\2\u0285\u0283"+
		"\3\2\2\2\u0286\u0289\3\2\2\2\u0287\u0285\3\2\2\2\u0287\u0288\3\2\2\2\u0288"+
		"9\3\2\2\2\u0289\u0287\3\2\2\2\u028a\u028b\5@!\2\u028b\u028c\5v<\2\u028c"+
		";\3\2\2\2\u028d\u0292\5> \2\u028e\u028f\7\u015d\2\2\u028f\u0291\5> \2"+
		"\u0290\u028e\3\2\2\2\u0291\u0294\3\2\2\2\u0292\u0290\3\2\2\2\u0292\u0293"+
		"\3\2\2\2\u0293=\3\2\2\2\u0294\u0292\3\2\2\2\u0295\u0296\5v<\2\u0296\u0297"+
		"\5@!\2\u0297\u029e\3\2\2\2\u0298\u0299\78\2\2\u0299\u029b\5\u0150\u00a9"+
		"\2\u029a\u0298\3\2\2\2\u029a\u029b\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u029e"+
		"\5D#\2\u029d\u0295\3\2\2\2\u029d\u029a\3\2\2\2\u029e?\3\2\2\2\u029f\u02a0"+
		"\5\u0150\u00a9\2\u02a0A\3\2\2\2\u02a1\u02c2\5h\65\2\u02a2\u02a4\7\u00c4"+
		"\2\2\u02a3\u02a2\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5"+
		"\u02c2\7\u00c6\2\2\u02a6\u02a7\7\u00dc\2\2\u02a7\u02c2\7\u00a1\2\2\u02a8"+
		"\u02c2\7\u012d\2\2\u02a9\u02aa\7\u00e5\2\2\u02aa\u02ab\5\u010a\u0086\2"+
		"\u02ab\u02ac\7\u016b\2\2\u02ac\u02ad\5\u0150\u00a9\2\u02ad\u02b1\7\u016e"+
		"\2\2\u02ae\u02b0\5F$\2\u02af\u02ae\3\2\2\2\u02b0\u02b3\3\2\2\2\u02b1\u02af"+
		"\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02c2\3\2\2\2\u02b3\u02b1\3\2\2\2\u02b4"+
		"\u02b5\7\u0088\2\2\u02b5\u02b6\7\u016b\2\2\u02b6\u02bb\7\u017a\2\2\u02b7"+
		"\u02b8\7\u015d\2\2\u02b8\u02ba\7\u017a\2\2\u02b9\u02b7\3\2\2\2\u02ba\u02bd"+
		"\3\2\2\2\u02bb\u02b9\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc\u02be\3\2\2\2\u02bd"+
		"\u02bb\3\2\2\2\u02be\u02c2\7\u016e\2\2\u02bf\u02c2\7\24\2\2\u02c0\u02c2"+
		"\7c\2\2\u02c1\u02a1\3\2\2\2\u02c1\u02a3\3\2\2\2\u02c1\u02a6\3\2\2\2\u02c1"+
		"\u02a8\3\2\2\2\u02c1\u02a9\3\2\2\2\u02c1\u02b4\3\2\2\2\u02c1\u02bf\3\2"+
		"\2\2\u02c1\u02c0\3\2\2\2\u02c2C\3\2\2\2\u02c3\u02c4\7\u00dc\2\2\u02c4"+
		"\u02c6\7\u00a1\2\2\u02c5\u02c7\7-\2\2\u02c6\u02c5\3\2\2\2\u02c6\u02c7"+
		"\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8\u02c9\7\u016b\2\2\u02c9\u02cb\5\u0150"+
		"\u00a9\2\u02ca\u02cc\t\7\2\2\u02cb\u02ca\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc"+
		"\u02d4\3\2\2\2\u02cd\u02ce\7\u015d\2\2\u02ce\u02d0\5\u0150\u00a9\2\u02cf"+
		"\u02d1\t\7\2\2\u02d0\u02cf\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02d3\3\2"+
		"\2\2\u02d2\u02cd\3\2\2\2\u02d3\u02d6\3\2\2\2\u02d4\u02d2\3\2\2\2\u02d4"+
		"\u02d5\3\2\2\2\u02d5\u02d7\3\2\2\2\u02d6\u02d4\3\2\2\2\u02d7\u02d9\7\u016e"+
		"\2\2\u02d8\u02da\7c\2\2\u02d9\u02d8\3\2\2\2\u02d9\u02da\3\2\2\2\u02da"+
		"\u02dc\3\2\2\2\u02db\u02dd\5\u00ccg\2\u02dc\u02db\3\2\2\2\u02dc\u02dd"+
		"\3\2\2\2\u02dd\u02fd\3\2\2\2\u02de\u02df\7w\2\2\u02df\u02e0\7\u00a1\2"+
		"\2\u02e0\u02e1\7\u016b\2\2\u02e1\u02e6\5\u0150\u00a9\2\u02e2\u02e3\7\u015d"+
		"\2\2\u02e3\u02e5\5\u0150\u00a9\2\u02e4\u02e2\3\2\2\2\u02e5\u02e8\3\2\2"+
		"\2\u02e6\u02e4\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7\u02e9\3\2\2\2\u02e8\u02e6"+
		"\3\2\2\2\u02e9\u02ea\7\u016e\2\2\u02ea\u02eb\7\u00e5\2\2\u02eb\u02ec\5"+
		"\u010a\u0086\2\u02ec\u02ed\7\u016b\2\2\u02ed\u02f2\5\u0150\u00a9\2\u02ee"+
		"\u02ef\7\u015d\2\2\u02ef\u02f1\5\u0150\u00a9\2\u02f0\u02ee\3\2\2\2\u02f1"+
		"\u02f4\3\2\2\2\u02f2\u02f0\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02f5\3\2"+
		"\2\2\u02f4\u02f2\3\2\2\2\u02f5\u02f9\7\u016e\2\2\u02f6\u02f8\5F$\2\u02f7"+
		"\u02f6\3\2\2\2\u02f8\u02fb\3\2\2\2\u02f9\u02f7\3\2\2\2\u02f9\u02fa\3\2"+
		"\2\2\u02fa\u02fd\3\2\2\2\u02fb\u02f9\3\2\2\2\u02fc\u02c3\3\2\2\2\u02fc"+
		"\u02de\3\2\2\2\u02fdE\3\2\2\2\u02fe\u02ff\7\u00cb\2\2\u02ff\u0308\t\b"+
		"\2\2\u0300\u0301\7\u00bf\2\2\u0301\u0309\7\7\2\2\u0302\u0309\7\u00e9\2"+
		"\2\u0303\u0304\7\u0102\2\2\u0304\u0309\7\u00c6\2\2\u0305\u0306\7\u0102"+
		"\2\2\u0306\u0309\7M\2\2\u0307\u0309\7$\2\2\u0308\u0300\3\2\2\2\u0308\u0302"+
		"\3\2\2\2\u0308\u0303\3\2\2\2\u0308\u0305\3\2\2\2\u0308\u0307\3\2\2\2\u0309"+
		"G\3\2\2\2\u030a\u030c\5J&\2\u030b\u030a\3\2\2\2\u030c\u030d\3\2\2\2\u030d"+
		"\u030b\3\2\2\2\u030d\u030e\3\2\2\2\u030eI\3\2\2\2\u030f\u0310\7\u015d"+
		"\2\2\u0310\u0313\5L\'\2\u0311\u0313\5Z.\2\u0312\u030f\3\2\2\2\u0312\u0311"+
		"\3\2\2\2\u0313K\3\2\2\2\u0314\u0316\7\u00bf\2\2\u0315\u0314\3\2\2\2\u0315"+
		"\u0316\3\2\2\2\u0316\u0317\3\2\2\2\u0317\u0318\t\t\2\2\u0318M\3\2\2\2"+
		"\u0319\u031b\5R*\2\u031a\u0319\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u031a"+
		"\3\2\2\2\u031c\u031d\3\2\2\2\u031dO\3\2\2\2\u031e\u031f\7\u00aa\2\2\u031f"+
		"\u0320\5\u0152\u00aa\2\u0320Q\3\2\2\2\u0321\u0322\7\u00cb\2\2\u0322\u0323"+
		"\7\64\2\2\u0323\u0324\t\n\2\2\u0324\u032e\7\u00f4\2\2\u0325\u0326\7\62"+
		"\2\2\u0326\u032e\5\u0152\u00aa\2\u0327\u032e\5T+\2\u0328\u032e\5V,\2\u0329"+
		"\u032e\5X-\2\u032a\u032e\5Z.\2\u032b\u032e\5`\61\2\u032c\u032e\5b\62\2"+
		"\u032d\u0321\3\2\2\2\u032d\u0325\3\2\2\2\u032d\u0327\3\2\2\2\u032d\u0328"+
		"\3\2\2\2\u032d\u0329\3\2\2\2\u032d\u032a\3\2\2\2\u032d\u032b\3\2\2\2\u032d"+
		"\u032c\3\2\2\2\u032eS\3\2\2\2\u032f\u0330\7\u00ff\2\2\u0330\u0331\7>\2"+
		"\2\u0331\u0342\t\13\2\2\u0332\u0333\t\f\2\2\u0333\u0342\7\u017a\2\2\u0334"+
		"\u0342\7\u00c1\2\2\u0335\u0342\t\r\2\2\u0336\u0337\7\u0115\2\2\u0337\u033a"+
		"\7\u016b\2\2\u0338\u033b\5\u0150\u00a9\2\u0339\u033b\7\u017a\2\2\u033a"+
		"\u0338\3\2\2\2\u033a\u0339\3\2\2\2\u033b\u033c\3\2\2\2\u033c\u033a\3\2"+
		"\2\2\u033c\u033d\3\2\2\2\u033d\u033e\3\2\2\2\u033e\u0342\7\u016e\2\2\u033f"+
		"\u0340\7\u011e\2\2\u0340\u0342\5\u0150\u00a9\2\u0341\u032f\3\2\2\2\u0341"+
		"\u0332\3\2\2\2\u0341\u0334\3\2\2\2\u0341\u0335\3\2\2\2\u0341\u0336\3\2"+
		"\2\2\u0341\u033f\3\2\2\2\u0342U\3\2\2\2\u0343\u0345\7\u008e\2\2\u0344"+
		"\u0343\3\2\2\2\u0344\u0345\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u0347\7\u008c"+
		"\2\2\u0347\u0365\5\u0150\u00a9\2\u0348\u0349\7\u013c\2\2\u0349\u0365\7"+
		"\u00e7\2\2\u034a\u034b\7[\2\2\u034b\u034c\7 \2\2\u034c\u034d\7\u0083\2"+
		"\2\u034d\u034e\7\u016b\2\2\u034e\u0353\5\u0150\u00a9\2\u034f\u0350\7\u015d"+
		"\2\2\u0350\u0352\5\u0150\u00a9\2\u0351\u034f\3\2\2\2\u0352\u0355\3\2\2"+
		"\2\u0353\u0351\3\2\2\2\u0353\u0354\3\2\2\2\u0354\u0356\3\2\2\2\u0355\u0353"+
		"\3\2\2\2\u0356\u0357\7\u016e\2\2\u0357\u0365\3\2\2\2\u0358\u035a\7\u00c4"+
		"\2\2\u0359\u0358\3\2\2\2\u0359\u035a\3\2\2\2\u035a\u035b\3\2\2\2\u035b"+
		"\u0365\7\u00af\2\2\u035c\u035d\7\65\2\2\u035d\u0365\t\16\2\2\u035e\u035f"+
		"\7Q\2\2\u035f\u0365\7\u00cc\2\2\u0360\u0361\7\u013c\2\2\u0361\u0362\7"+
		"\u00e9\2\2\u0362\u0363\7\u00cb\2\2\u0363\u0365\7^\2\2\u0364\u0344\3\2"+
		"\2\2\u0364\u0348\3\2\2\2\u0364\u034a\3\2\2\2\u0364\u0359\3\2\2\2\u0364"+
		"\u035c\3\2\2\2\u0364\u035e\3\2\2\2\u0364\u0360\3\2\2\2\u0365W\3\2\2\2"+
		"\u0366\u0368\7\u012d\2\2\u0367\u0366\3\2\2\2\u0367\u0368\3\2\2\2\u0368"+
		"\u0369\3\2\2\2\u0369\u036a\7\u00dc\2\2\u036a\u036b\7\u008e\2\2\u036b\u036c"+
		"\7\u016b\2\2\u036c\u0371\5\u0150\u00a9\2\u036d\u036e\7\u015d\2\2\u036e"+
		"\u0370\5\u0150\u00a9\2\u036f\u036d\3\2\2\2\u0370\u0373\3\2\2\2\u0371\u036f"+
		"\3\2\2\2\u0371\u0372\3\2\2\2\u0372\u0374\3\2\2\2\u0373\u0371\3\2\2\2\u0374"+
		"\u0375\7\u016e\2\2\u0375\u0379\3\2\2\2\u0376\u0377\7\u013c\2\2\u0377\u0379"+
		"\7E\2\2\u0378\u0367\3\2\2\2\u0378\u0376\3\2\2\2\u0379Y\3\2\2\2\u037a\u0381"+
		"\5\\/\2\u037b\u037c\7\u0116\2\2\u037c\u037d\7\20\2\2\u037d\u037e\5\u0150"+
		"\u00a9\2\u037e\u037f\5\\/\2\u037f\u0381\3\2\2\2\u0380\u037a\3\2\2\2\u0380"+
		"\u037b\3\2\2\2\u0381[\3\2\2\2\u0382\u0383\7\u00f3\2\2\u0383\u0384\7x\2"+
		"\2\u0384\u0388\7S\2\2\u0385\u0387\5^\60\2\u0386\u0385\3\2\2\2\u0387\u038a"+
		"\3\2\2\2\u0388\u0386\3\2\2\2\u0388\u0389\3\2\2\2\u0389]\3\2\2\2\u038a"+
		"\u0388\3\2\2\2\u038b\u038c\7q\2\2\u038c\u038d\7\u0120\2\2\u038d\u038e"+
		"\7 \2\2\u038e\u038f\5\u0150\u00a9\2\u038f\u0393\5P)\2\u0390\u0391\7f\2"+
		"\2\u0391\u0392\7 \2\2\u0392\u0394\5\u012a\u0096\2\u0393\u0390\3\2\2\2"+
		"\u0393\u0394\3\2\2\2\u0394\u03a8\3\2\2\2\u0395\u0396\7\60\2\2\u0396\u0397"+
		"\7\u009e\2\2\u0397\u0398\7\u0120\2\2\u0398\u0399\7 \2\2\u0399\u03a8\5"+
		"\u012a\u0096\2\u039a\u039b\7\u00b2\2\2\u039b\u039c\7\u00a2\2\2\u039c\u039d"+
		"\7\u0120\2\2\u039d\u039e\7 \2\2\u039e\u03a8\5\u012a\u0096\2\u039f\u03a0"+
		"\7\u00a8\2\2\u03a0\u03a1\7\u0120\2\2\u03a1\u03a2\7 \2\2\u03a2\u03a8\5"+
		"\u012a\u0096\2\u03a3\u03a4\7\u00c6\2\2\u03a4\u03a5\7O\2\2\u03a5\u03a6"+
		"\7\20\2\2\u03a6\u03a8\5\u012a\u0096\2\u03a7\u038b\3\2\2\2\u03a7\u0395"+
		"\3\2\2\2\u03a7\u039a\3\2\2\2\u03a7\u039f\3\2\2\2\u03a7\u03a3\3\2\2\2\u03a8"+
		"_\3\2\2\2\u03a9\u03aa\7\u00cb\2\2\u03aa\u03ae\5\u0150\u00a9\2\u03ab\u03ac"+
		"\7\u0121\2\2\u03ac\u03ae\5\u0150\u00a9\2\u03ad\u03a9\3\2\2\2\u03ad\u03ab"+
		"\3\2\2\2\u03aea\3\2\2\2\u03af\u03b1\7\24\2\2\u03b0\u03b2\7\u0161\2\2\u03b1"+
		"\u03b0\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3\u03cb\5\u012a"+
		"\u0096\2\u03b4\u03b6\7\62\2\2\u03b5\u03b7\7\u0161\2\2\u03b6\u03b5\3\2"+
		"\2\2\u03b6\u03b7\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8\u03cb\5\u012a\u0096"+
		"\2\u03b9\u03bb\7M\2\2\u03ba\u03b9\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03bf"+
		"\3\2\2\2\u03bc\u03bd\7)\2\2\u03bd\u03c0\7\u0102\2\2\u03be\u03c0\7*\2\2"+
		"\u03bf\u03bc\3\2\2\2\u03bf\u03be\3\2\2\2\u03c0\u03c2\3\2\2\2\u03c1\u03c3"+
		"\7\u0161\2\2\u03c2\u03c1\3\2\2\2\u03c2\u03c3\3\2\2\2\u03c3\u03c4\3\2\2"+
		"\2\u03c4\u03cb\5\u012a\u0096\2\u03c5\u03c7\7e\2\2\u03c6\u03c8\7\u0161"+
		"\2\2\u03c7\u03c6\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8\u03c9\3\2\2\2\u03c9"+
		"\u03cb\5\u012a\u0096\2\u03ca\u03af\3\2\2\2\u03ca\u03b4\3\2\2\2\u03ca\u03ba"+
		"\3\2\2\2\u03ca\u03c5\3\2\2\2\u03cbc\3\2\2\2\u03cc\u03cd\7\u016b\2\2\u03cd"+
		"\u03cf\t\17\2\2\u03ce\u03d0\t\20\2\2\u03cf\u03ce\3\2\2\2\u03cf\u03d0\3"+
		"\2\2\2\u03d0\u03d3\3\2\2\2\u03d1\u03d2\7\u015d\2\2\u03d2\u03d4\7\u017a"+
		"\2\2\u03d3\u03d1\3\2\2\2\u03d3\u03d4\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5"+
		"\u03d6\7\u016e\2\2\u03d6e\3\2\2\2\u03d7\u03d9\7\u00c4\2\2\u03d8\u03d7"+
		"\3\2\2\2\u03d8\u03d9\3\2\2\2\u03d9\u03da\3\2\2\2\u03da\u03e3\7\u00c6\2"+
		"\2\u03db\u03dc\7)\2\2\u03dc\u03dd\7\u0102\2\2\u03dd\u03e3\5\u0150\u00a9"+
		"\2\u03de\u03e0\7\u00c4\2\2\u03df\u03de\3\2\2\2\u03df\u03e0\3\2\2\2\u03e0"+
		"\u03e1\3\2\2\2\u03e1\u03e3\t\21\2\2\u03e2\u03d8\3\2\2\2\u03e2\u03db\3"+
		"\2\2\2\u03e2\u03df\3\2\2\2\u03e3g\3\2\2\2\u03e4\u03e6\7\u015c\2\2\u03e5"+
		"\u03e4\3\2\2\2\u03e5\u03e6\3\2\2\2\u03e6\u03e7\3\2\2\2\u03e7\u03e8\7\u0161"+
		"\2\2\u03e8\u03f1\5\u012a\u0096\2\u03e9\u03eb\7\u013c\2\2\u03ea\u03e9\3"+
		"\2\2\2\u03ea\u03eb\3\2\2\2\u03eb\u03ec\3\2\2\2\u03ec\u03ee\7M\2\2\u03ed"+
		"\u03ef\5\u012a\u0096\2\u03ee\u03ed\3\2\2\2\u03ee\u03ef\3\2\2\2\u03ef\u03f1"+
		"\3\2\2\2\u03f0\u03e5\3\2\2\2\u03f0\u03ea\3\2\2\2\u03f1i\3\2\2\2\u03f2"+
		"\u03f3\7=\2\2\u03f3\u03f4\7|\2\2\u03f4\u03f6\5\u0150\u00a9\2\u03f5\u03f7"+
		"\5\u00b4[\2\u03f6\u03f5\3\2\2\2\u03f6\u03f7\3\2\2\2\u03f7\u03f8\3\2\2"+
		"\2\u03f8\u03fa\5l\67\2\u03f9\u03fb\t\22\2\2\u03fa\u03f9\3\2\2\2\u03fa"+
		"\u03fb\3\2\2\2\u03fb\u03fd\3\2\2\2\u03fc\u03fe\5\34\17\2\u03fd\u03fc\3"+
		"\2\2\2\u03fd\u03fe\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ff\u0400\5\n\6\2\u0400"+
		"k\3\2\2\2\u0401\u0402\t\23\2\2\u0402\u0404\5v<\2\u0403\u0405\5d\63\2\u0404"+
		"\u0403\3\2\2\2\u0404\u0405\3\2\2\2\u0405m\3\2\2\2\u0406\u0407\7=\2\2\u0407"+
		"\u0408\7\u00d5\2\2\u0408\u0409\5\u0150\u00a9\2\u0409\u040a\t\22\2\2\u040a"+
		"\u040b\5p9\2\u040b\u040f\7d\2\2\u040c\u040d\5\u0150\u00a9\2\u040d\u040e"+
		"\7\u0170\2\2\u040e\u0410\3\2\2\2\u040f\u040c\3\2\2\2\u040f\u0410\3\2\2"+
		"\2\u0410o\3\2\2\2\u0411\u0412\5r:\2\u0412\u0418\7\u0170\2\2\u0413\u0414"+
		"\5r:\2\u0414\u0415\7\u0170\2\2\u0415\u0417\3\2\2\2\u0416\u0413\3\2\2\2"+
		"\u0417\u041a\3\2\2\2\u0418\u0416\3\2\2\2\u0418\u0419\3\2\2\2\u0419q\3"+
		"\2\2\2\u041a\u0418\3\2\2\2\u041b\u0429\5\36\20\2\u041c\u041d\7|\2\2\u041d"+
		"\u041f\5\u0150\u00a9\2\u041e\u0420\5\u00b4[\2\u041f\u041e\3\2\2\2\u041f"+
		"\u0420\3\2\2\2\u0420\u0421\3\2\2\2\u0421\u0422\5l\67\2\u0422\u0429\3\2"+
		"\2\2\u0423\u0424\t\24\2\2\u0424\u0426\5\u0150\u00a9\2\u0425\u0427\5\u00b4"+
		"[\2\u0426\u0425\3\2\2\2\u0426\u0427\3\2\2\2\u0427\u0429\3\2\2\2\u0428"+
		"\u041b\3\2\2\2\u0428\u041c\3\2\2\2\u0428\u0423\3\2\2\2\u0429s\3\2\2\2"+
		"\u042a\u042b\5v<\2\u042b\u042c\5\u0150\u00a9\2\u042c\u042d\7\u016c\2\2"+
		"\u042d\u042e\7\u016f\2\2\u042e\u043f\3\2\2\2\u042f\u0430\5v<\2\u0430\u0431"+
		"\5\u0150\u00a9\2\u0431\u0432\7\u016c\2\2\u0432\u0433\5\u0150\u00a9\2\u0433"+
		"\u0434\7\u016f\2\2\u0434\u043f\3\2\2\2\u0435\u0436\5v<\2\u0436\u0437\5"+
		"\u0150\u00a9\2\u0437\u0438\7\u0161\2\2\u0438\u0439\5\u0150\u00a9\2\u0439"+
		"\u043a\7\u016c\2\2\u043a\u043b\5\u0150\u00a9\2\u043b\u043c\7\u016f\2\2"+
		"\u043c\u043d\7\u0170\2\2\u043d\u043f\3\2\2\2\u043e\u042a\3\2\2\2\u043e"+
		"\u042f\3\2\2\2\u043e\u0435\3\2\2\2\u043fu\3\2\2\2\u0440\u0441\t\25\2\2"+
		"\u0441w\3\2\2\2\u0442\u0443\5z>\2\u0443\u0444\7\u0170\2\2\u0444\u044d"+
		"\3\2\2\2\u0445\u0446\5\u0088E\2\u0446\u0447\7\u0170\2\2\u0447\u044d\3"+
		"\2\2\2\u0448\u044d\5\u008cG\2\u0449\u044d\5\u009eP\2\u044a\u044d\5t;\2"+
		"\u044b\u044d\5\u008aF\2\u044c\u0442\3\2\2\2\u044c\u0445\3\2\2\2\u044c"+
		"\u0448\3\2\2\2\u044c\u0449\3\2\2\2\u044c\u044a\3\2\2\2\u044c\u044b\3\2"+
		"\2\2\u044dy\3\2\2\2\u044e\u0450\5|?\2\u044f\u0451\5~@\2\u0450\u044f\3"+
		"\2\2\2\u0450\u0451\3\2\2\2\u0451{\3\2\2\2\u0452\u0453\5v<\2\u0453\u0454"+
		"\5\u0150\u00a9\2\u0454}\3\2\2\2\u0455\u0458\7\u0161\2\2\u0456\u0459\5"+
		"\u00aaV\2\u0457\u0459\5\30\r\2\u0458\u0456\3\2\2\2\u0458\u0457\3\2\2\2"+
		"\u0459\177\3\2\2\2\u045a\u045f\5\u0082B\2\u045b\u045c\7\u015d\2\2\u045c"+
		"\u045e\5\u0082B\2\u045d\u045b\3\2\2\2\u045e\u0461\3\2\2\2\u045f\u045d"+
		"\3\2\2\2\u045f\u0460\3\2\2\2\u0460\u0081\3\2\2\2\u0461\u045f\3\2\2\2\u0462"+
		"\u0463\5v<\2\u0463\u0465\5\u0150\u00a9\2\u0464\u0466\5~@\2\u0465\u0464"+
		"\3\2\2\2\u0465\u0466\3\2\2\2\u0466\u0083\3\2\2\2\u0467\u0468\5v<\2\u0468"+
		"\u0469\5\u0092J\2\u0469\u0085\3\2\2\2\u046a\u046b\5\u0084C\2\u046b\u046d"+
		"\7\u016b\2\2\u046c\u046e\5\u0080A\2\u046d\u046c\3\2\2\2\u046d\u046e\3"+
		"\2\2\2\u046e\u046f\3\2\2\2\u046f\u0470\7\u016e\2\2\u0470\u0471\5\16\b"+
		"\2\u0471\u047c\3\2\2\2\u0472\u0473\7\17\2\2\u0473\u0474\5\u0092J\2\u0474"+
		"\u0476\7\u016b\2\2\u0475\u0477\5\u0080A\2\u0476\u0475\3\2\2\2\u0476\u0477"+
		"\3\2\2\2\u0477\u0478\3\2\2\2\u0478\u0479\7\u016e\2\2\u0479\u047a\5\6\4"+
		"\2\u047a\u047c\3\2\2\2\u047b\u046a\3\2\2\2\u047b\u0472\3\2\2\2\u047c\u0087"+
		"\3\2\2\2\u047d\u047e\5\u0150\u00a9\2\u047e\u047f\7\u0161\2\2\u047f\u0480"+
		"\5\u00aaV\2\u0480\u0089\3\2\2\2\u0481\u0482\5\u0092J\2\u0482\u0483\7\u015b"+
		"\2\2\u0483\u0484\7\u015b\2\2\u0484\u049e\3\2\2\2\u0485\u0486\5\u0092J"+
		"\2\u0486\u0487\7\u0171\2\2\u0487\u0488\7\u0171\2\2\u0488\u049e\3\2\2\2"+
		"\u0489\u048a\5\u0092J\2\u048a\u048b\7\u015b\2\2\u048b\u048c\7\u0161\2"+
		"\2\u048c\u048d\5\u0092J\2\u048d\u049e\3\2\2\2\u048e\u048f\5\u0092J\2\u048f"+
		"\u0490\7\u0171\2\2\u0490\u0491\7\u0161\2\2\u0491\u0492\5\u0092J\2\u0492"+
		"\u049e\3\2\2\2\u0493\u0494\5\u0092J\2\u0494\u0495\7\u0169\2\2\u0495\u0496"+
		"\7\u0161\2\2\u0496\u0497\5\u0092J\2\u0497\u049e\3\2\2\2\u0498\u0499\5"+
		"\u0092J\2\u0499\u049a\7\u015f\2\2\u049a\u049b\7\u0161\2\2\u049b\u049c"+
		"\5\u0092J\2\u049c\u049e\3\2\2\2\u049d\u0481\3\2\2\2\u049d\u0485\3\2\2"+
		"\2\u049d\u0489\3\2\2\2\u049d\u048e\3\2\2\2\u049d\u0493\3\2\2\2\u049d\u0498"+
		"\3\2\2\2\u049e\u008b\3\2\2\2\u049f\u04a0\7v\2\2\u04a0\u04a1\5\u008eH\2"+
		"\u04a1\u04a2\5\6\4\2\u04a2\u008d\3\2\2\2\u04a3\u04ac\7\u016b\2\2\u04a4"+
		"\u04a9\5\u0090I\2\u04a5\u04a6\7\u015d\2\2\u04a6\u04a8\5\u0090I\2\u04a7"+
		"\u04a5\3\2\2\2\u04a8\u04ab\3\2\2\2\u04a9\u04a7\3\2\2\2\u04a9\u04aa\3\2"+
		"\2\2\u04aa\u04ad\3\2\2\2\u04ab\u04a9\3\2\2\2\u04ac\u04a4\3\2\2\2\u04ac"+
		"\u04ad\3\2\2\2\u04ad\u04ae\3\2\2\2\u04ae\u04bd\7\u0170\2\2\u04af\u04b0"+
		"\5\u0092J\2\u04b0\u04b1\5\u0094K\2\u04b1\u04ba\5\u0150\u00a9\2\u04b2\u04b3"+
		"\t\26\2\2\u04b3\u04b4\5\u0092J\2\u04b4\u04b5\5\u0094K\2\u04b5\u04b6\5"+
		"\u0150\u00a9\2\u04b6\u04b7\7;\2\2\u04b7\u04b9\3\2\2\2\u04b8\u04b2\3\2"+
		"\2\2\u04b9\u04bc\3\2\2\2\u04ba\u04b8\3\2\2\2\u04ba\u04bb\3\2\2\2\u04bb"+
		"\u04be\3\2\2\2\u04bc\u04ba\3\2\2\2\u04bd\u04af\3\2\2\2\u04bd\u04be\3\2"+
		"\2\2\u04be\u04bf\3\2\2\2\u04bf\u04c8\7\u0170\2\2\u04c0\u04c5\5\u008aF"+
		"\2\u04c1\u04c2\7\u015d\2\2\u04c2\u04c4\5\u008aF\2\u04c3\u04c1\3\2\2\2"+
		"\u04c4\u04c7\3\2\2\2\u04c5\u04c3\3\2\2\2\u04c5\u04c6\3\2\2\2\u04c6\u04c9"+
		"\3\2\2\2\u04c7\u04c5\3\2\2\2\u04c8\u04c0\3\2\2\2\u04c8\u04c9\3\2\2\2\u04c9"+
		"\u04ca\3\2\2\2\u04ca\u04cb\7\u016e\2\2\u04cb\u008f\3\2\2\2\u04cc\u04cd"+
		"\5v<\2\u04cd\u04cf\5\u0150\u00a9\2\u04ce\u04d0\5~@\2\u04cf\u04ce\3\2\2"+
		"\2\u04cf\u04d0\3\2\2\2\u04d0\u04d3\3\2\2\2\u04d1\u04d3\5\u0088E\2\u04d2"+
		"\u04cc\3\2\2\2\u04d2\u04d1\3\2\2\2\u04d3\u0091\3\2\2\2\u04d4\u04d5\5\u0150"+
		"\u00a9\2\u04d5\u0093\3\2\2\2\u04d6\u04d7\t\27\2\2\u04d7\u0095\3\2\2\2"+
		"\u04d8\u04d9\7\u0089\2\2\u04d9\u04da\7\u016b\2\2\u04da\u04db\5\u00a2R"+
		"\2\u04db\u04dc\7\u016e\2\2\u04dc\u0097\3\2\2\2\u04dd\u04de\5\u0096L\2"+
		"\u04de\u04df\5\6\4\2\u04df\u0099\3\2\2\2\u04e0\u04e1\7`\2\2\u04e1\u04e2"+
		"\5\u0098M\2\u04e2\u009b\3\2\2\2\u04e3\u04e6\7`\2\2\u04e4\u04e7\5\6\4\2"+
		"\u04e5\u04e7\5\30\r\2\u04e6\u04e4\3\2\2\2\u04e6\u04e5\3\2\2\2\u04e7\u009d"+
		"\3\2\2\2\u04e8\u04ec\5\u0098M\2\u04e9\u04eb\5\u009aN\2\u04ea\u04e9\3\2"+
		"\2\2\u04eb\u04ee\3\2\2\2\u04ec\u04ea\3\2\2\2\u04ec\u04ed\3\2\2\2\u04ed"+
		"\u04f0\3\2\2\2\u04ee\u04ec\3\2\2\2\u04ef\u04f1\5\u009cO\2\u04f0\u04ef"+
		"\3\2\2\2\u04f0\u04f1\3\2\2\2\u04f1\u009f\3\2\2\2\u04f2\u04fb\3\2\2\2\u04f3"+
		"\u04fb\7\u0162\2\2\u04f4\u04fb\7\u0163\2\2\u04f5\u04fb\7\u0164\2\2\u04f6"+
		"\u04fb\7\u0167\2\2\u04f7\u04fb\7\u0168\2\2\u04f8\u04fb\7\u0165\2\2\u04f9"+
		"\u04fb\7\u0166\2\2\u04fa\u04f2\3\2\2\2\u04fa\u04f3\3\2\2\2\u04fa\u04f4"+
		"\3\2\2\2\u04fa\u04f5\3\2\2\2\u04fa\u04f6\3\2\2\2\u04fa\u04f7\3\2\2\2\u04fa"+
		"\u04f8\3\2\2\2\u04fa\u04f9\3\2\2\2\u04fb\u00a1\3\2\2\2\u04fc\u04fe\bR"+
		"\1\2\u04fd\u04ff\7\u0172\2\2\u04fe\u04fd\3\2\2\2\u04fe\u04ff\3\2\2\2\u04ff"+
		"\u0500\3\2\2\2\u0500\u0501\7\u016b\2\2\u0501\u0502\5\u00a2R\2\u0502\u0503"+
		"\7\u016e\2\2\u0503\u050a\3\2\2\2\u0504\u050a\5\u00a8U\2\u0505\u0507\7"+
		"\u0172\2\2\u0506\u0505\3\2\2\2\u0506\u0507\3\2\2\2\u0507\u0508\3\2\2\2"+
		"\u0508\u050a\5\u00a8U\2\u0509\u04fc\3\2\2\2\u0509\u0504\3\2\2\2\u0509"+
		"\u0506\3\2\2\2\u050a\u0511\3\2\2\2\u050b\u050c\f\5\2\2\u050c\u050d\5\u00a4"+
		"S\2\u050d\u050e\5\u00a2R\6\u050e\u0510\3\2\2\2\u050f\u050b\3\2\2\2\u0510"+
		"\u0513\3\2\2\2\u0511\u050f\3\2\2\2\u0511\u0512\3\2\2\2\u0512\u00a3\3\2"+
		"\2\2\u0513\u0511\3\2\2\2\u0514\u0515\t\30\2\2\u0515\u00a5\3\2\2\2\u0516"+
		"\u0517\5\u00aaV\2\u0517\u0518\5\u00a0Q\2\u0518\u0519\5\u00aaV\2\u0519"+
		"\u00a7\3\2\2\2\u051a\u051d\5\u00a6T\2\u051b\u051d\5\u00aaV\2\u051c\u051a"+
		"\3\2\2\2\u051c\u051b\3\2\2\2\u051d\u00a9\3\2\2\2\u051e\u051f\bV\1\2\u051f"+
		"\u0520\7\u016b\2\2\u0520\u0521\5\u00aaV\2\u0521\u0522\7\u016e\2\2\u0522"+
		"\u052f\3\2\2\2\u0523\u052f\5\u0134\u009b\2\u0524\u052f\5\u013a\u009e\2"+
		"\u0525\u052f\5\u013c\u009f\2\u0526\u052f\5\u0144\u00a3\2\u0527\u052f\5"+
		"\u0146\u00a4\2\u0528\u052f\5\u012c\u0097\2\u0529\u052b\7\u0176\2\2\u052a"+
		"\u0529\3\2\2\2\u052b\u052c\3\2\2\2\u052c\u052a\3\2\2\2\u052c\u052d\3\2"+
		"\2\2\u052d\u052f\3\2\2\2\u052e\u051e\3\2\2\2\u052e\u0523\3\2\2\2\u052e"+
		"\u0524\3\2\2\2\u052e\u0525\3\2\2\2\u052e\u0526\3\2\2\2\u052e\u0527\3\2"+
		"\2\2\u052e\u0528\3\2\2\2\u052e\u052a\3\2\2\2\u052f\u0540\3\2\2\2\u0530"+
		"\u0531\f\r\2\2\u0531\u0532\7\u0169\2\2\u0532\u053f\5\u00aaV\16\u0533\u0534"+
		"\f\f\2\2\u0534\u0535\7\u015f\2\2\u0535\u053f\5\u00aaV\r\u0536\u0537\f"+
		"\13\2\2\u0537\u0538\7\u015b\2\2\u0538\u053f\5\u00aaV\f\u0539\u053a\f\n"+
		"\2\2\u053a\u053b\7\u0171\2\2\u053b\u053f\5\u00aaV\13\u053c\u053d\f\16"+
		"\2\2\u053d\u053f\5\u012e\u0098\2\u053e\u0530\3\2\2\2\u053e\u0533\3\2\2"+
		"\2\u053e\u0536\3\2\2\2\u053e\u0539\3\2\2\2\u053e\u053c\3\2\2\2\u053f\u0542"+
		"\3\2\2\2\u0540\u053e\3\2\2\2\u0540\u0541\3\2\2\2\u0541\u00ab\3\2\2\2\u0542"+
		"\u0540\3\2\2\2\u0543\u0544\7=\2\2\u0544\u0545\7\u00d5\2\2\u0545\u0546"+
		"\7\36\2\2\u0546\u0547\5\u0150\u00a9\2\u0547\u0548\t\22\2\2\u0548\u0549"+
		"\5\u00aeX\2\u0549\u054d\7d\2\2\u054a\u054b\5\u0150\u00a9\2\u054b\u054c"+
		"\7\u0170\2\2\u054c\u054e\3\2\2\2\u054d\u054a\3\2\2\2\u054d\u054e\3\2\2"+
		"\2\u054e\u00ad\3\2\2\2\u054f\u0550\5\u00b0Y\2\u0550\u0556\7\u0170\2\2"+
		"\u0551\u0552\5\u00b0Y\2\u0552\u0553\7\u0170\2\2\u0553\u0555\3\2\2\2\u0554"+
		"\u0551\3\2\2\2\u0555\u0558\3\2\2\2\u0556\u0554\3\2\2\2\u0556\u0557\3\2"+
		"\2\2\u0557\u00af\3\2\2\2\u0558\u0556\3\2\2\2\u0559\u055d\5\36\20\2\u055a"+
		"\u055d\5j\66\2\u055b\u055d\5\u00b2Z\2\u055c\u0559\3\2\2\2\u055c\u055a"+
		"\3\2\2\2\u055c\u055b\3\2\2\2\u055d\u00b1\3\2\2\2\u055e\u055f\7=\2\2\u055f"+
		"\u0560\t\24\2\2\u0560\u0562\5\u0150\u00a9\2\u0561\u0563\5\u00b4[\2\u0562"+
		"\u0561\3\2\2\2\u0562\u0563\3\2\2\2\u0563\u0565\3\2\2\2\u0564\u0566\5\u00b8"+
		"]\2\u0565\u0564\3\2\2\2\u0565\u0566\3\2\2\2\u0566\u0568\3\2\2\2\u0567"+
		"\u0569\t\22\2\2\u0568\u0567\3\2\2\2\u0568\u0569\3\2\2\2\u0569\u056b\3"+
		"\2\2\2\u056a\u056c\5\34\17\2\u056b\u056a\3\2\2\2\u056b\u056c\3\2\2\2\u056c"+
		"\u056e\3\2\2\2\u056d\u056f\5\u00d4k\2\u056e\u056d\3\2\2\2\u056e\u056f"+
		"\3\2\2\2\u056f\u0570\3\2\2\2\u0570\u0574\5\24\13\2\u0571\u0572\5\u0150"+
		"\u00a9\2\u0572\u0573\7\u0170\2\2\u0573\u0575\3\2\2\2\u0574\u0571\3\2\2"+
		"\2\u0574\u0575\3\2\2\2\u0575\u00b3\3\2\2\2\u0576\u0577\7\u016b\2\2\u0577"+
		"\u058d\7\u016e\2\2\u0578\u0579\7\u016b\2\2\u0579\u057e\5\u00b6\\\2\u057a"+
		"\u057b\7\u015d\2\2\u057b\u057d\5\u00b6\\\2\u057c\u057a\3\2\2\2\u057d\u0580"+
		"\3\2\2\2\u057e\u057c\3\2\2\2\u057e\u057f\3\2\2\2\u057f\u0581\3\2\2\2\u0580"+
		"\u057e\3\2\2\2\u0581\u0582\7\u016e\2\2\u0582\u058d\3\2\2\2\u0583\u0584"+
		"\6[\13\2\u0584\u0589\5\u00b6\\\2\u0585\u0586\7\u015d\2\2\u0586\u0588\5"+
		"\u00b6\\\2\u0587\u0585\3\2\2\2\u0588\u058b\3\2\2\2\u0589\u0587\3\2\2\2"+
		"\u0589\u058a\3\2\2\2\u058a\u058d\3\2\2\2\u058b\u0589\3\2\2\2\u058c\u0576"+
		"\3\2\2\2\u058c\u0578\3\2\2\2\u058c\u0583\3\2\2\2\u058d\u00b5\3\2\2\2\u058e"+
		"\u0594\7\u008c\2\2\u058f\u0594\7\u00d0\2\2\u0590\u0594\7\u0091\2\2\u0591"+
		"\u0592\7\u008c\2\2\u0592\u0594\7\u00d0\2\2\u0593\u058e\3\2\2\2\u0593\u058f"+
		"\3\2\2\2\u0593\u0590\3\2\2\2\u0593\u0591\3\2\2\2\u0593\u0594\3\2\2\2\u0594"+
		"\u0595\3\2\2\2\u0595\u0596\5\u0150\u00a9\2\u0596\u0598\5v<\2\u0597\u0599"+
		"\5d\63\2\u0598\u0597\3\2\2\2\u0598\u0599\3\2\2\2\u0599\u059d\3\2\2\2\u059a"+
		"\u059c\5f\64\2\u059b\u059a\3\2\2\2\u059c\u059f\3\2\2\2\u059d\u059b\3\2"+
		"\2\2\u059d\u059e\3\2\2\2\u059e\u05a1\3\2\2\2\u059f\u059d\3\2\2\2\u05a0"+
		"\u05a2\5h\65\2\u05a1\u05a0\3\2\2\2\u05a1\u05a2\3\2\2\2\u05a2\u05b9\3\2"+
		"\2\2\u05a3\u05a9\5\u0150\u00a9\2\u05a4\u05aa\7\u008c\2\2\u05a5\u05aa\7"+
		"\u00d0\2\2\u05a6\u05aa\7\u0091\2\2\u05a7\u05a8\7\u008c\2\2\u05a8\u05aa"+
		"\7\u00d0\2\2\u05a9\u05a4\3\2\2\2\u05a9\u05a5\3\2\2\2\u05a9\u05a6\3\2\2"+
		"\2\u05a9\u05a7\3\2\2\2\u05a9\u05aa\3\2\2\2\u05aa\u05ab\3\2\2\2\u05ab\u05ad"+
		"\5v<\2\u05ac\u05ae\5d\63\2\u05ad\u05ac\3\2\2\2\u05ad\u05ae\3\2\2\2\u05ae"+
		"\u05b2\3\2\2\2\u05af\u05b1\5f\64\2\u05b0\u05af\3\2\2\2\u05b1\u05b4\3\2"+
		"\2\2\u05b2\u05b0\3\2\2\2\u05b2\u05b3\3\2\2\2\u05b3\u05b6\3\2\2\2\u05b4"+
		"\u05b2\3\2\2\2\u05b5\u05b7\5h\65\2\u05b6\u05b5\3\2\2\2\u05b6\u05b7\3\2"+
		"\2\2\u05b7\u05b9\3\2\2\2\u05b8\u0593\3\2\2\2\u05b8\u05a3\3\2\2\2\u05b9"+
		"\u00b7\3\2\2\2\u05ba\u05bc\5\u00ba^\2\u05bb\u05ba\3\2\2\2\u05bc\u05bd"+
		"\3\2\2\2\u05bd\u05bb\3\2\2\2\u05bd\u05be\3\2\2\2\u05be\u00b9\3\2\2\2\u05bf"+
		"\u05c0\7\u00a3\2\2\u05c0\u05cb\7\u010d\2\2\u05c1\u05c2\7\u010d\2\2\u05c2"+
		"\u05c3\7\u00fe\2\2\u05c3\u05cb\t\31\2\2\u05c4\u05c6\7_\2\2\u05c5\u05c4"+
		"\3\2\2\2\u05c5\u05c6\3\2\2\2\u05c6\u05c7\3\2\2\2\u05c7\u05c8\7\u00ea\2"+
		"\2\u05c8\u05c9\7\u0105\2\2\u05c9\u05cb\7\u017a\2\2\u05ca\u05bf\3\2\2\2"+
		"\u05ca\u05c1\3\2\2\2\u05ca\u05c5\3\2\2\2\u05cb\u00bb\3\2\2\2\u05cc\u05d0"+
		"\5\u00be`\2\u05cd\u05d0\5\u00c0a\2\u05ce\u05d0\5\u00c2b\2\u05cf\u05cc"+
		"\3\2\2\2\u05cf\u05cd\3\2\2\2\u05cf\u05ce\3\2\2\2\u05d0\u00bd\3\2\2\2\u05d1"+
		"\u05d2\7\u0089\2\2\u05d2\u05d3\5\u011a\u008e\2\u05d3\u05d4\7\u0122\2\2"+
		"\u05d4\u05d8\5\4\3\2\u05d5\u05d7\5\u00c4c\2\u05d6\u05d5\3\2\2\2\u05d7"+
		"\u05da\3\2\2\2\u05d8\u05d6\3\2\2\2\u05d8\u05d9\3\2\2\2\u05d9\u05dc\3\2"+
		"\2\2\u05da\u05d8\3\2\2\2\u05db\u05dd\5\u00c6d\2\u05dc\u05db\3\2\2\2\u05dc"+
		"\u05dd\3\2\2\2\u05dd\u05de\3\2\2\2\u05de\u05df\7d\2\2\u05df\u05e0\7\u0089"+
		"\2\2\u05e0\u00bf\3\2\2\2\u05e1\u05e2\7\u0089\2\2\u05e2\u05e3\5\u011a\u008e"+
		"\2\u05e3\u05e6\5\n\6\2\u05e4\u05e5\7`\2\2\u05e5\u05e7\5\n\6\2\u05e6\u05e4"+
		"\3\2\2\2\u05e6\u05e7\3\2\2\2\u05e7\u00c1\3\2\2\2\u05e8\u05e9\7\5\2\2\u05e9"+
		"\u05ea\7\u0089\2\2\u05ea\u05eb\5\u011a\u008e\2\u05eb\u05ec\7\u0122\2\2"+
		"\u05ec\u05ed\5\n\6\2\u05ed\u00c3\3\2\2\2\u05ee\u05ef\t\32\2\2\u05ef\u05f0"+
		"\5\u011a\u008e\2\u05f0\u05f1\7\u0122\2\2\u05f1\u05f2\5\4\3\2\u05f2\u00c5"+
		"\3\2\2\2\u05f3\u05f4\7`\2\2\u05f4\u05f5\5\4\3\2\u05f5\u00c7\3\2\2\2\u05f6"+
		"\u05f8\7=\2\2\u05f7\u05f9\7\u012d\2\2\u05f8\u05f7\3\2\2\2\u05f8\u05f9"+
		"\3\2\2\2\u05f9\u05fa\3\2\2\2\u05fa\u05fb\7\u008e\2\2\u05fb\u05fc\5\u0150"+
		"\u00a9\2\u05fc\u05fd\7\u00cb\2\2\u05fd\u05fe\5\u010a\u0086\2\u05fe\u05ff"+
		"\7\u016b\2\2\u05ff\u0604\5\u00caf\2\u0600\u0601\7\u015d\2\2\u0601\u0603"+
		"\5\u00caf\2\u0602\u0600\3\2\2\2\u0603\u0606\3\2\2\2\u0604\u0602\3\2\2"+
		"\2\u0604\u0605\3\2\2\2\u0605\u0607\3\2\2\2\u0606\u0604\3\2\2\2\u0607\u0608"+
		"\7\u016e\2\2\u0608\u00c9\3\2\2\2\u0609\u060b\5\u0150\u00a9\2\u060a\u060c"+
		"\t\7\2\2\u060b\u060a\3\2\2\2\u060b\u060c\3\2\2\2\u060c\u00cb\3\2\2\2\u060d"+
		"\u060e\5\u00ceh\2\u060e\u00cd\3\2\2\2\u060f\u0610\7\u013c\2\2\u0610\u0611"+
		"\7\u016b\2\2\u0611\u0612\5\u0150\u00a9\2\u0612\u0613\7\u0161\2\2\u0613"+
		"\u061b\5\u0150\u00a9\2\u0614\u0615\7\u015d\2\2\u0615\u0616\5\u0150\u00a9"+
		"\2\u0616\u0617\7\u0161\2\2\u0617\u0618\5\u0150\u00a9\2\u0618\u061a\3\2"+
		"\2\2\u0619\u0614\3\2\2\2\u061a\u061d\3\2\2\2\u061b\u0619\3\2\2\2\u061b"+
		"\u061c\3\2\2\2\u061c\u061e\3\2\2\2\u061d\u061b\3\2\2\2\u061e\u0622\7\u016e"+
		"\2\2\u061f\u0621\5`\61\2\u0620\u061f\3\2\2\2\u0621\u0624\3\2\2\2\u0622"+
		"\u0620\3\2\2\2\u0622\u0623\3\2\2\2\u0623\u00cf\3\2\2\2\u0624\u0622\3\2"+
		"\2\2\u0625\u0626\7v\2\2\u0626\u0627\7\u0177\2\2\u0627\u0629\7\u008c\2"+
		"\2\u0628\u062a\7\u016b\2\2\u0629\u0628\3\2\2\2\u0629\u062a\3\2\2\2\u062a"+
		"\u062b\3\2\2\2\u062b\u062d\5\u00d6l\2\u062c\u062e\7\u016e\2\2\u062d\u062c"+
		"\3\2\2\2\u062d\u062e\3\2\2\2\u062e\u062f\3\2\2\2\u062f\u0630\7\u00b1\2"+
		"\2\u0630\u0631\5\4\3\2\u0631\u0632\7d\2\2\u0632\u0633\7\u00b1\2\2\u0633"+
		"\u00d1\3\2\2\2\u0634\u0635\7v\2\2\u0635\u0636\7\u0177\2\2\u0636\u0638"+
		"\7\u008c\2\2\u0637\u0639\7\u00ee\2\2\u0638\u0637\3\2\2\2\u0638\u0639\3"+
		"\2\2\2\u0639\u063a\3\2\2\2\u063a\u063b\5\u012a\u0096\2\u063b\u063c\7\u0160"+
		"\2\2\u063c\u063f\5\u012a\u0096\2\u063d\u063e\t\33\2\2\u063e\u0640\5\u012a"+
		"\u0096\2\u063f\u063d\3\2\2\2\u063f\u0640\3\2\2\2\u0640\u0641\3\2\2\2\u0641"+
		"\u0642\7\u00b1\2\2\u0642\u0643\5\4\3\2\u0643\u0644\7d\2\2\u0644\u0645"+
		"\7\u00b1\2\2\u0645\u00d3\3\2\2\2\u0646\u064d\7\u0180\2\2\u0647\u0648\7"+
		"\u0167\2\2\u0648\u0649\7\u0167\2\2\u0649\u064a\7\u0177\2\2\u064a\u064b"+
		"\7\u0165\2\2\u064b\u064d\7\u0165\2\2\u064c\u0646\3\2\2\2\u064c\u0647\3"+
		"\2\2\2\u064d\u00d5\3\2\2\2\u064e\u0650\5\u00d8m\2\u064f\u064e\3\2\2\2"+
		"\u064f\u0650\3\2\2\2\u0650\u0651\3\2\2\2\u0651\u0652\5\u00dep\2\u0652"+
		"\u00d7\3\2\2\2\u0653\u0654\7\u013c\2\2\u0654\u0659\5\u00dan\2\u0655\u0656"+
		"\7\u015d\2\2\u0656\u0658\5\u00dan\2\u0657\u0655\3\2\2\2\u0658\u065b\3"+
		"\2\2\2\u0659\u0657\3\2\2\2\u0659\u065a\3\2\2\2\u065a\u00d9\3\2\2\2\u065b"+
		"\u0659\3\2\2\2\u065c\u065e\5\u0150\u00a9\2\u065d\u065f\5\u00dco\2\u065e"+
		"\u065d\3\2\2\2\u065e\u065f\3\2\2\2\u065f\u0660\3\2\2\2\u0660\u0661\7\20"+
		"\2\2\u0661\u0662\7\u016b\2\2\u0662\u0663\5\u00dep\2\u0663\u0664\7\u016e"+
		"\2\2\u0664\u00db\3\2\2\2\u0665\u0666\7\u016b\2\2\u0666\u066b\5\u0150\u00a9"+
		"\2\u0667\u0668\7\u015d\2\2\u0668\u066a\5\u0150\u00a9\2\u0669\u0667\3\2"+
		"\2\2\u066a\u066d\3\2\2\2\u066b\u0669\3\2\2\2\u066b\u066c\3\2\2\2\u066c"+
		"\u066e\3\2\2\2\u066d\u066b\3\2\2\2\u066e\u066f\7\u016e\2\2\u066f\u00dd"+
		"\3\2\2\2\u0670\u0676\5\u00e0q\2\u0671\u0672\5\u00e2r\2\u0672\u0673\5\u00e0"+
		"q\2\u0673\u0675\3\2\2\2\u0674\u0671\3\2\2\2\u0675\u0678\3\2\2\2\u0676"+
		"\u0674\3\2\2\2\u0676\u0677\3\2\2\2\u0677\u00df\3\2\2\2\u0678\u0676\3\2"+
		"\2\2\u0679\u067f\5\u00e4s\2\u067a\u067b\7\u016b\2\2\u067b\u067c\5\u00de"+
		"p\2\u067c\u067d\7\u016e\2\2\u067d\u067f\3\2\2\2\u067e\u0679\3\2\2\2\u067e"+
		"\u067a\3\2\2\2\u067f\u00e1\3\2\2\2\u0680\u0682\7\u012c\2\2\u0681\u0683"+
		"\7\t\2\2\u0682\u0681\3\2\2\2\u0682\u0683\3\2\2\2\u0683\u068d\3\2\2\2\u0684"+
		"\u0686\7g\2\2\u0685\u0687\7\t\2\2\u0686\u0685\3\2\2\2\u0686\u0687\3\2"+
		"\2\2\u0687\u068d\3\2\2\2\u0688\u068a\7\u0098\2\2\u0689\u068b\7\t\2\2\u068a"+
		"\u0689\3\2\2\2\u068a\u068b\3\2\2\2\u068b\u068d\3\2\2\2\u068c\u0680\3\2"+
		"\2\2\u068c\u0684\3\2\2\2\u068c\u0688\3\2\2\2\u068d\u00e3\3\2\2\2\u068e"+
		"\u068f\7\u0101\2\2\u068f\u0691\5\u00e6t\2\u0690\u0692\5\u00f6|\2\u0691"+
		"\u0690\3\2\2\2\u0691\u0692\3\2\2\2\u0692\u0694\3\2\2\2\u0693\u0695\5\u00f8"+
		"}\2\u0694\u0693\3\2\2\2\u0694\u0695\3\2\2\2\u0695\u0697\3\2\2\2\u0696"+
		"\u0698\5\u010c\u0087\2\u0697\u0696\3\2\2\2\u0697\u0698\3\2\2\2\u0698\u069a"+
		"\3\2\2\2\u0699\u069b\5\u010e\u0088\2\u069a\u0699\3\2\2\2\u069a\u069b\3"+
		"\2\2\2\u069b\u069e\3\2\2\2\u069c\u069f\5\u0110\u0089\2\u069d\u069f\5\u0112"+
		"\u008a\2\u069e\u069c\3\2\2\2\u069e\u069d\3\2\2\2\u069e\u069f\3\2\2\2\u069f"+
		"\u06a1\3\2\2\2\u06a0\u06a2\5\u0114\u008b\2\u06a1\u06a0\3\2\2\2\u06a1\u06a2"+
		"\3\2\2\2\u06a2\u06a4\3\2\2\2\u06a3\u06a5\5\u0116\u008c\2\u06a4\u06a3\3"+
		"\2\2\2\u06a4\u06a5\3\2\2\2\u06a5\u00e5\3\2\2\2\u06a6\u06a8\5\u00e8u\2"+
		"\u06a7\u06a6\3\2\2\2\u06a7\u06a8\3\2\2\2\u06a8\u06aa\3\2\2\2\u06a9\u06ab"+
		"\5\u00eav\2\u06aa\u06a9\3\2\2\2\u06aa\u06ab\3\2\2\2\u06ab\u06ac\3\2\2"+
		"\2\u06ac\u06b1\5\u00ecw\2\u06ad\u06ae\7\u015d\2\2\u06ae\u06b0\5\u00ec"+
		"w\2\u06af\u06ad\3\2\2\2\u06b0\u06b3\3\2\2\2\u06b1\u06af\3\2\2\2\u06b1"+
		"\u06b2\3\2\2\2\u06b2\u00e7\3\2\2\2\u06b3\u06b1\3\2\2\2\u06b4\u06b5\t\34"+
		"\2\2\u06b5\u00e9\3\2\2\2\u06b6\u06b7\7\u0127\2\2\u06b7\u06b8\5\u012a\u0096"+
		"\2\u06b8\u00eb\3\2\2\2\u06b9\u06bb\5\u00eex\2\u06ba\u06b9\3\2\2\2\u06bb"+
		"\u06be\3\2\2\2\u06bc\u06ba\3\2\2\2\u06bc\u06bd\3\2\2\2\u06bd\u06bf\3\2"+
		"\2\2\u06be\u06bc\3\2\2\2\u06bf\u06c0\7z\2\2\u06c0\u06ce\5\u00f0y\2\u06c1"+
		"\u06c2\5\u0150\u00a9\2\u06c2\u06c3\7\u0161\2\2\u06c3\u06c5\3\2\2\2\u06c4"+
		"\u06c1\3\2\2\2\u06c4\u06c5\3\2\2\2\u06c5\u06c6\3\2\2\2\u06c6\u06c8\5\u012a"+
		"\u0096\2\u06c7\u06c9\5\u00f2z\2\u06c8\u06c7\3\2\2\2\u06c8\u06c9\3\2\2"+
		"\2\u06c9\u06cc\3\2\2\2\u06ca\u06cc\5\u00f4{\2\u06cb\u06c4\3\2\2\2\u06cb"+
		"\u06ca\3\2\2\2\u06cc\u06ce\3\2\2\2\u06cd\u06bc\3\2\2\2\u06cd\u06cb\3\2"+
		"\2\2\u06ce\u00ed\3\2\2\2\u06cf\u06d1\5\u0150\u00a9\2\u06d0\u06d2\7\u015d"+
		"\2\2\u06d1\u06d0\3\2\2\2\u06d1\u06d2\3\2\2\2\u06d2\u00ef\3\2\2\2\u06d3"+
		"\u06d4\5\u0150\u00a9\2\u06d4\u00f1\3\2\2\2\u06d5\u06d7\7\20\2\2\u06d6"+
		"\u06d5\3\2\2\2\u06d6\u06d7\3\2\2\2\u06d7\u06d8\3\2\2\2\u06d8\u06de\5\u0150"+
		"\u00a9\2\u06d9\u06da\7\u016b\2\2\u06da\u06db\7\u0125\2\2\u06db\u06dc\7"+
		"\u0178\2\2\u06dc\u06de\7\u016e\2\2\u06dd\u06d6\3\2\2\2\u06dd\u06d9\3\2"+
		"\2\2\u06de\u00f3\3\2\2\2\u06df\u06e0\7\u0177\2\2\u06e0\u06e2\7\5\2\2\u06e1"+
		"\u06df\3\2\2\2\u06e1\u06e2\3\2\2\2\u06e2\u06e3\3\2\2\2\u06e3\u06e4\7\u0169"+
		"\2\2\u06e4\u00f5\3\2\2\2\u06e5\u06e6\7\u009a\2\2\u06e6\u06eb\5\u0150\u00a9"+
		"\2\u06e7\u06e8\7\u015d\2\2\u06e8\u06ea\5\u0150\u00a9\2\u06e9\u06e7\3\2"+
		"\2\2\u06ea\u06ed\3\2\2\2\u06eb\u06e9\3\2\2\2\u06eb\u06ec\3\2\2\2\u06ec"+
		"\u00f7\3\2\2\2\u06ed\u06eb\3\2\2\2\u06ee\u06ef\7z\2\2\u06ef\u06f3\5\u00fa"+
		"~\2\u06f0\u06f2\5\u0100\u0081\2\u06f1\u06f0\3\2\2\2\u06f2\u06f5\3\2\2"+
		"\2\u06f3\u06f1\3\2\2\2\u06f3\u06f4\3\2\2\2\u06f4\u00f9\3\2\2\2\u06f5\u06f3"+
		"\3\2\2\2\u06f6\u06fa\5\u00fc\177\2\u06f7\u06fa\5\u00fe\u0080\2\u06f8\u06fa"+
		"\5\u0104\u0083\2\u06f9\u06f6\3\2\2\2\u06f9\u06f7\3\2\2\2\u06f9\u06f8\3"+
		"\2\2\2\u06fa\u00fb\3\2\2\2\u06fb\u06fd\5\u010a\u0086\2\u06fc\u06fe\5\u0108"+
		"\u0085\2\u06fd\u06fc\3\2\2\2\u06fd\u06fe\3\2\2\2\u06fe\u00fd\3\2\2\2\u06ff"+
		"\u0700\7\u016b\2\2\u0700\u0701\5\u00d6l\2\u0701\u0703\7\u016e\2\2\u0702"+
		"\u0704\5\u0108\u0085\2\u0703\u0702\3\2\2\2\u0703\u0704\3\2\2\2\u0704\u00ff"+
		"\3\2\2\2\u0705\u0706\7\u015d\2\2\u0706\u070d\5\u00fa~\2\u0707\u0708\5"+
		"\u0102\u0082\2\u0708\u0709\5\u00fa~\2\u0709\u070a\7\u00cb\2\2\u070a\u070b"+
		"\5\u011a\u008e\2\u070b\u070d\3\2\2\2\u070c\u0705\3\2\2\2\u070c\u0707\3"+
		"\2\2\2\u070d\u0101\3\2\2\2\u070e\u0710\7\u0090\2\2\u070f\u070e\3\2\2\2"+
		"\u070f\u0710\3\2\2\2\u0710\u0711\3\2\2\2\u0711\u0718\7\u009f\2\2\u0712"+
		"\u0714\t\35\2\2\u0713\u0715\7\u00d1\2\2\u0714\u0713\3\2\2\2\u0714\u0715"+
		"\3\2\2\2\u0715\u0716\3\2\2\2\u0716\u0718\7\u009f\2\2\u0717\u070f\3\2\2"+
		"\2\u0717\u0712\3\2\2\2\u0718\u0103\3\2\2\2\u0719\u071a\7\u011d\2\2\u071a"+
		"\u071b\7\u016b\2\2\u071b\u071c\7\u0133\2\2\u071c\u0721\5\u0106\u0084\2"+
		"\u071d\u071e\7\u015d\2\2\u071e\u0720\5\u0106\u0084\2\u071f\u071d\3\2\2"+
		"\2\u0720\u0723\3\2\2\2\u0721\u071f\3\2\2\2\u0721\u0722\3\2\2\2\u0722\u0724"+
		"\3\2\2\2\u0723\u0721\3\2\2\2\u0724\u0726\7\u016e\2\2\u0725\u0727\5\u0108"+
		"\u0085\2\u0726\u0725\3\2\2\2\u0726\u0727\3\2\2\2\u0727\u0105\3\2\2\2\u0728"+
		"\u0735\5\u012a\u0096\2\u0729\u072a\7\u016b\2\2\u072a\u072f\5\u012a\u0096"+
		"\2\u072b\u072c\7\u015d\2\2\u072c\u072e\5\u012a\u0096\2\u072d\u072b\3\2"+
		"\2\2\u072e\u0731\3\2\2\2\u072f\u072d\3\2\2\2\u072f\u0730\3\2\2\2\u0730"+
		"\u0732\3\2\2\2\u0731\u072f\3\2\2\2\u0732\u0733\7\u016e\2\2\u0733\u0735"+
		"\3\2\2\2\u0734\u0728\3\2\2\2\u0734\u0729\3\2\2\2\u0735\u0107\3\2\2\2\u0736"+
		"\u0738\6\u0085\f\2\u0737\u0739\7\20\2\2\u0738\u0737\3\2\2\2\u0738\u0739"+
		"\3\2\2\2\u0739\u073a\3\2\2\2\u073a\u0745\5\u0150\u00a9\2\u073b\u073c\7"+
		"\u016b\2\2\u073c\u0741\7\u0177\2\2\u073d\u073e\7\u015d\2\2\u073e\u0740"+
		"\7\u0177\2\2\u073f\u073d\3\2\2\2\u0740\u0743\3\2\2\2\u0741\u073f\3\2\2"+
		"\2\u0741\u0742\3\2\2\2\u0742\u0744\3\2\2\2\u0743\u0741\3\2\2\2\u0744\u0746"+
		"\7\u016e\2\2\u0745\u073b\3\2\2\2\u0745\u0746\3\2\2\2\u0746\u0109\3\2\2"+
		"\2\u0747\u0748\5\u0150\u00a9\2\u0748\u010b\3\2\2\2\u0749\u074a\7\u013a"+
		"\2\2\u074a\u074b\5\u011a\u008e\2\u074b\u010d\3\2\2\2\u074c\u074d\7\u0081"+
		"\2\2\u074d\u074e\7 \2\2\u074e\u0753\5\u012a\u0096\2\u074f\u0750\7\u015d"+
		"\2\2\u0750\u0752\5\u012a\u0096\2\u0751\u074f\3\2\2\2\u0752\u0755\3\2\2"+
		"\2\u0753\u0751\3\2\2\2\u0753\u0754\3\2\2\2\u0754\u010f\3\2\2\2\u0755\u0753"+
		"\3\2\2\2\u0756\u0757\7\u0084\2\2\u0757\u0758\5\u011a\u008e\2\u0758\u0111"+
		"\3\2\2\2\u0759\u075a\7\u00e0\2\2\u075a\u075b\5\u011a\u008e\2\u075b\u0113"+
		"\3\2\2\2\u075c\u075d\7\u00cf\2\2\u075d\u075e\7 \2\2\u075e\u0760\5\u012a"+
		"\u0096\2\u075f\u0761\t\7\2\2\u0760\u075f\3\2\2\2\u0760\u0761\3\2\2\2\u0761"+
		"\u0769\3\2\2\2\u0762\u0763\7\u015d\2\2\u0763\u0765\5\u012a\u0096\2\u0764"+
		"\u0766\t\7\2\2\u0765\u0764\3\2\2\2\u0765\u0766\3\2\2\2\u0766\u0768\3\2"+
		"\2\2\u0767\u0762\3\2\2\2\u0768\u076b\3\2\2\2\u0769\u0767\3\2\2\2\u0769"+
		"\u076a\3\2\2\2\u076a\u0770\3\2\2\2\u076b\u0769\3\2\2\2\u076c\u076d\7\u00cf"+
		"\2\2\u076d\u076e\7 \2\2\u076e\u0770\7\u0176\2\2\u076f\u075c\3\2\2\2\u076f"+
		"\u076c\3\2\2\2\u0770\u0115\3\2\2\2\u0771\u0773\5\u0118\u008d\2\u0772\u0771"+
		"\3\2\2\2\u0773\u0774\3\2\2\2\u0774\u0772\3\2\2\2\u0774\u0775\3\2\2\2\u0775"+
		"\u0117\3\2\2\2\u0776\u0777\7\u00a7\2\2\u0777\u0782\5\u012a\u0096\2\u0778"+
		"\u0779\7\u013c\2\2\u0779\u077f\t\36\2\2\u077a\u077b\7\u0130\2\2\u077b"+
		"\u077c\7\f\2\2\u077c\u077d\7\u00a0\2\2\u077d\u077e\t\37\2\2\u077e\u0780"+
		"\7\u00ad\2\2\u077f\u077a\3\2\2\2\u077f\u0780\3\2\2\2\u0780\u0782\3\2\2"+
		"\2\u0781\u0776\3\2\2\2\u0781\u0778\3\2\2\2\u0782\u0119\3\2\2\2\u0783\u0785"+
		"\b\u008e\1\2\u0784\u0786\7\u00c4\2\2\u0785\u0784\3\2\2\2\u0785\u0786\3"+
		"\2\2\2\u0786\u0787\3\2\2\2\u0787\u0788\7\u016b\2\2\u0788\u0789\5\u011a"+
		"\u008e\2\u0789\u078a\7\u016e\2\2\u078a\u078d\3\2\2\2\u078b\u078d\5\u011c"+
		"\u008f\2\u078c\u0783\3\2\2\2\u078c\u078b\3\2\2\2\u078d\u0794\3\2\2\2\u078e"+
		"\u078f\f\4\2\2\u078f\u0790\5\u0126\u0094\2\u0790\u0791\5\u011a\u008e\5"+
		"\u0791\u0793\3\2\2\2\u0792\u078e\3\2\2\2\u0793\u0796\3\2\2\2\u0794\u0792"+
		"\3\2\2\2\u0794\u0795\3\2\2\2\u0795\u011b\3\2\2\2\u0796\u0794\3\2\2\2\u0797"+
		"\u079b\5\u011e\u0090\2\u0798\u079b\5\u0124\u0093\2\u0799\u079b\5\u012a"+
		"\u0096\2\u079a\u0797\3\2\2\2\u079a\u0798\3\2\2\2\u079a\u0799\3\2\2\2\u079b"+
		"\u011d\3\2\2\2\u079c\u079d\5\u012a\u0096\2\u079d\u079f\7\u009c\2\2\u079e"+
		"\u07a0\7\u00c4\2\2\u079f\u079e\3\2\2\2\u079f\u07a0\3\2\2\2\u07a0\u07a1"+
		"\3\2\2\2\u07a1\u07a2\t \2\2\u07a2\u07b4\3\2\2\2\u07a3\u07a4\5\u012a\u0096"+
		"\2\u07a4\u07a5\7\30\2\2\u07a5\u07a6\5\u012a\u0096\2\u07a6\u07a7\7\f\2"+
		"\2\u07a7\u07a8\5\u012a\u0096\2\u07a8\u07b4\3\2\2\2\u07a9\u07ab\7\u00c4"+
		"\2\2\u07aa\u07a9\3\2\2\2\u07aa\u07ab\3\2\2\2\u07ab\u07ac\3\2\2\2\u07ac"+
		"\u07ad\7l\2\2\u07ad\u07ae\7\u016b\2\2\u07ae\u07af\5\u00d6l\2\u07af\u07b0"+
		"\7\u016e\2\2\u07b0\u07b4\3\2\2\2\u07b1\u07b4\5\u0120\u0091\2\u07b2\u07b4"+
		"\5\u0122\u0092\2\u07b3\u079c\3\2\2\2\u07b3\u07a3\3\2\2\2\u07b3\u07aa\3"+
		"\2\2\2\u07b3\u07b1\3\2\2\2\u07b3\u07b2\3\2\2\2\u07b4\u011f\3\2\2\2\u07b5"+
		"\u07b7\5\u012a\u0096\2\u07b6\u07b8\7\u00c4\2\2\u07b7\u07b6\3\2\2\2\u07b7"+
		"\u07b8\3\2\2\2\u07b8\u07b9\3\2\2\2\u07b9\u07ba\7\u008c\2\2\u07ba\u07c4"+
		"\7\u016b\2\2\u07bb\u07c0\5\u012a\u0096\2\u07bc\u07bd\7\u015d\2\2\u07bd"+
		"\u07bf\5\u012a\u0096\2\u07be\u07bc\3\2\2\2\u07bf\u07c2\3\2\2\2\u07c0\u07be"+
		"\3\2\2\2\u07c0\u07c1\3\2\2\2\u07c1\u07c5\3\2\2\2\u07c2\u07c0\3\2\2\2\u07c3"+
		"\u07c5\5\u00d6l\2\u07c4\u07bb\3\2\2\2\u07c4\u07c3\3\2\2\2\u07c5\u07c6"+
		"\3\2\2\2\u07c6\u07c7\7\u016e\2\2\u07c7\u0121\3\2\2\2\u07c8\u07c9\7\u016b"+
		"\2\2\u07c9\u07ce\5\u012a\u0096\2\u07ca\u07cb\7\u015d\2\2\u07cb\u07cd\5"+
		"\u012a\u0096\2\u07cc\u07ca\3\2\2\2\u07cd\u07d0\3\2\2\2\u07ce\u07cc\3\2"+
		"\2\2\u07ce\u07cf\3\2\2\2\u07cf\u07d1\3\2\2\2\u07d0\u07ce\3\2\2\2\u07d1"+
		"\u07d3\7\u016e\2\2\u07d2\u07d4\7\u00c4\2\2\u07d3\u07d2\3\2\2\2\u07d3\u07d4"+
		"\3\2\2\2\u07d4\u07d5\3\2\2\2\u07d5\u07d6\7\u008c\2\2\u07d6\u07d7\7\u016b"+
		"\2\2\u07d7\u07d8\5\u00d6l\2\u07d8\u07d9\7\u016e\2\2\u07d9\u0123\3\2\2"+
		"\2\u07da\u07e0\5\u0128\u0095\2\u07db\u07dc\5\u012a\u0096\2\u07dc\u07dd"+
		"\5\u0128\u0095\2\u07dd\u07de\5\u012a\u0096\2\u07de\u07e0\3\2\2\2\u07df"+
		"\u07da\3\2\2\2\u07df\u07db\3\2\2\2\u07e0\u0125\3\2\2\2\u07e1\u07e2\t!"+
		"\2\2\u07e2\u0127\3\2\2\2\u07e3\u07e4\5\u0150\u00a9\2\u07e4\u07e5\7\u0161"+
		"\2\2\u07e5\u07e6\5\u012a\u0096\2\u07e6\u07f7\3\2\2\2\u07e7\u07e8\5\u012a"+
		"\u0096\2\u07e8\u07e9\7\u0161\2\2\u07e9\u07ea\5\u0150\u00a9\2\u07ea\u07f7"+
		"\3\2\2\2\u07eb\u07f7\7\u0162\2\2\u07ec\u07f7\7\u0163\2\2\u07ed\u07f7\7"+
		"\u0164\2\2\u07ee\u07f7\7\u0167\2\2\u07ef\u07f7\7\u0168\2\2\u07f0\u07f7"+
		"\7\u0165\2\2\u07f1\u07f7\7\u0166\2\2\u07f2\u07f4\7\u00c4\2\2\u07f3\u07f2"+
		"\3\2\2\2\u07f3\u07f4\3\2\2\2\u07f4\u07f5\3\2\2\2\u07f5\u07f7\t\"\2\2\u07f6"+
		"\u07e3\3\2\2\2\u07f6\u07e7\3\2\2\2\u07f6\u07eb\3\2\2\2\u07f6\u07ec\3\2"+
		"\2\2\u07f6\u07ed\3\2\2\2\u07f6\u07ee\3\2\2\2\u07f6\u07ef\3\2\2\2\u07f6"+
		"\u07f0\3\2\2\2\u07f6\u07f1\3\2\2\2\u07f6\u07f3\3\2\2\2\u07f7\u0129\3\2"+
		"\2\2\u07f8\u07f9\b\u0096\1\2\u07f9\u07fa\7\u016b\2\2\u07fa\u07fb\5\u00d6"+
		"l\2\u07fb\u07fc\7\u016e\2\2\u07fc\u0809\3\2\2\2\u07fd\u07fe\7\u016b\2"+
		"\2\u07fe\u07ff\5\u012a\u0096\2\u07ff\u0800\7\u016e\2\2\u0800\u0809\3\2"+
		"\2\2\u0801\u0809\5\u0130\u0099\2\u0802\u0809\5\u0134\u009b\2\u0803\u0809"+
		"\5\u013a\u009e\2\u0804\u0809\5\u013c\u009f\2\u0805\u0809\5\u0144\u00a3"+
		"\2\u0806\u0809\5\u0146\u00a4\2\u0807\u0809\5\u012c\u0097\2\u0808\u07f8"+
		"\3\2\2\2\u0808\u07fd\3\2\2\2\u0808\u0801\3\2\2\2\u0808\u0802\3\2\2\2\u0808"+
		"\u0803\3\2\2\2\u0808\u0804\3\2\2\2\u0808\u0805\3\2\2\2\u0808\u0806\3\2"+
		"\2\2\u0808\u0807\3\2\2\2\u0809\u081a\3\2\2\2\u080a\u080b\f\17\2\2\u080b"+
		"\u080c\7\u0169\2\2\u080c\u0819\5\u012a\u0096\20\u080d\u080e\f\16\2\2\u080e"+
		"\u080f\7\u015f\2\2\u080f\u0819\5\u012a\u0096\17\u0810\u0811\f\r\2\2\u0811"+
		"\u0812\7\u015b\2\2\u0812\u0819\5\u012a\u0096\16\u0813\u0814\f\f\2\2\u0814"+
		"\u0815\7\u0171\2\2\u0815\u0819\5\u012a\u0096\r\u0816\u0817\f\20\2\2\u0817"+
		"\u0819\5\u012e\u0098\2\u0818\u080a\3\2\2\2\u0818\u080d\3\2\2\2\u0818\u0810"+
		"\3\2\2\2\u0818\u0813\3\2\2\2\u0818\u0816\3\2\2\2\u0819\u081c\3\2\2\2\u081a"+
		"\u0818\3\2\2\2\u081a\u081b\3\2\2\2\u081b\u012b\3\2\2\2\u081c\u081a\3\2"+
		"\2\2\u081d\u0826\5\u014c\u00a7\2\u081e\u0826\5\u014e\u00a8\2\u081f\u0826"+
		"\5\u0158\u00ad\2\u0820\u0826\5\u0092J\2\u0821\u0826\5\u0152\u00aa\2\u0822"+
		"\u0826\5\u0156\u00ac\2\u0823\u0826\5\u0154\u00ab\2\u0824\u0826\5\u015a"+
		"\u00ae\2\u0825\u081d\3\2\2\2\u0825\u081e\3\2\2\2\u0825\u081f\3\2\2\2\u0825"+
		"\u0820\3\2\2\2\u0825\u0821\3\2\2\2\u0825\u0822\3\2\2\2\u0825\u0823\3\2"+
		"\2\2\u0825\u0824\3\2\2\2\u0826\u012d\3\2\2\2\u0827\u0828\t#\2\2\u0828"+
		"\u012f\3\2\2\2\u0829\u082a\5\u0132\u009a\2\u082a\u082b\t$\2\2\u082b\u0830"+
		"\5\u0132\u009a\2\u082c\u082d\t$\2\2\u082d\u082f\5\u0132\u009a\2\u082e"+
		"\u082c\3\2\2\2\u082f\u0832\3\2\2\2\u0830\u082e\3\2\2\2\u0830\u0831\3\2"+
		"\2\2\u0831\u0131\3\2\2\2\u0832\u0830\3\2\2\2\u0833\u0834\7\u016b\2\2\u0834"+
		"\u0835\5\u012a\u0096\2\u0835\u0836\7\u016e\2\2\u0836\u083d\3\2\2\2\u0837"+
		"\u083d\5\u0134\u009b\2\u0838\u083d\5\u013c\u009f\2\u0839\u083d\5\u0144"+
		"\u00a3\2\u083a\u083d\5\u0146\u00a4\2\u083b\u083d\5\u012c\u0097\2\u083c"+
		"\u0833\3\2\2\2\u083c\u0837\3\2\2\2\u083c\u0838\3\2\2\2\u083c\u0839\3\2"+
		"\2\2\u083c\u083a\3\2\2\2\u083c\u083b\3\2\2\2\u083d\u0133\3\2\2\2\u083e"+
		"\u0841\5\u0136\u009c\2\u083f\u0841\5\u0138\u009d\2\u0840\u083e\3\2\2\2"+
		"\u0840\u083f\3\2\2\2\u0841\u0135\3\2\2\2\u0842\u0843\7%\2\2\u0843\u0849"+
		"\5\u012a\u0096\2\u0844\u0845\7\u0139\2\2\u0845\u0846\5\u012a\u0096\2\u0846"+
		"\u0847\7\u0122\2\2\u0847\u0848\5\u012a\u0096\2\u0848\u084a\3\2\2\2\u0849"+
		"\u0844\3\2\2\2\u084a\u084b\3\2\2\2\u084b\u0849\3\2\2\2\u084b\u084c\3\2"+
		"\2\2\u084c\u084f\3\2\2\2\u084d\u084e\7`\2\2\u084e\u0850\5\u012a\u0096"+
		"\2\u084f\u084d\3\2\2\2\u084f\u0850\3\2\2\2\u0850\u0851\3\2\2\2\u0851\u0852"+
		"\7d\2\2\u0852\u0137\3\2\2\2\u0853\u0859\7%\2\2\u0854\u0855\7\u0139\2\2"+
		"\u0855\u0856\5\u011a\u008e\2\u0856\u0857\7\u0122\2\2\u0857\u0858\5\u012a"+
		"\u0096\2\u0858\u085a\3\2\2\2\u0859\u0854\3\2\2\2\u085a\u085b\3\2\2\2\u085b"+
		"\u0859\3\2\2\2\u085b\u085c\3\2\2\2\u085c\u085f\3\2\2\2\u085d\u085e\7`"+
		"\2\2\u085e\u0860\5\u012a\u0096\2\u085f\u085d\3\2\2\2\u085f\u0860\3\2\2"+
		"\2\u0860\u0861\3\2\2\2\u0861\u0862\7d\2\2\u0862\u0139\3\2\2\2\u0863\u0864"+
		"\5\u0150\u00a9\2\u0864\u0865\7\6\2\2\u0865\u0866\t%\2\2\u0866\u013b\3"+
		"\2\2\2\u0867\u0868\7\25\2\2\u0868\u086a\7\u016b\2\2\u0869\u086b\5\u013e"+
		"\u00a0\2\u086a\u0869\3\2\2\2\u086a\u086b\3\2\2\2\u086b\u086c\3\2\2\2\u086c"+
		"\u086d\5\u012a\u0096\2\u086d\u086f\7\u016e\2\2\u086e\u0870\5\u0140\u00a1"+
		"\2\u086f\u086e\3\2\2\2\u086f\u0870\3\2\2\2\u0870\u0900\3\2\2\2\u0871\u0872"+
		"\7;\2\2\u0872\u0878\7\u016b\2\2\u0873\u0875\5\u013e\u00a0\2\u0874\u0873"+
		"\3\2\2\2\u0874\u0875\3\2\2\2\u0875\u0876\3\2\2\2\u0876\u0879\5\u012a\u0096"+
		"\2\u0877\u0879\7\u0169\2\2\u0878\u0874\3\2\2\2\u0878\u0877\3\2\2\2\u0879"+
		"\u087a\3\2\2\2\u087a\u087c\7\u016e\2\2\u087b\u087d\5\u0140\u00a1\2\u087c"+
		"\u087b\3\2\2\2\u087c\u087d\3\2\2\2\u087d\u0900\3\2\2\2\u087e\u087f\7<"+
		"\2\2\u087f\u0885\7\u016b\2\2\u0880\u0882\5\u013e\u00a0\2\u0881\u0880\3"+
		"\2\2\2\u0881\u0882\3\2\2\2\u0882\u0883\3\2\2\2\u0883\u0886\5\u012a\u0096"+
		"\2\u0884\u0886\7\u0169\2\2\u0885\u0881\3\2\2\2\u0885\u0884\3\2\2\2\u0886"+
		"\u0887\3\2\2\2\u0887\u0889\7\u016e\2\2\u0888\u088a\5\u0140\u00a1\2\u0889"+
		"\u0888\3\2\2\2\u0889\u088a\3\2\2\2\u088a\u0900\3\2\2\2\u088b\u088c\7\u0144"+
		"\2\2\u088c\u088d\7\u016b\2\2\u088d\u088e\7\u016e\2\2\u088e\u0900\5\u0140"+
		"\u00a1\2\u088f\u0890\7\u0148\2\2\u0890\u0891\7\u016b\2\2\u0891\u0892\7"+
		"\u016e\2\2\u0892\u0900\5\u0140\u00a1\2\u0893\u0894\7\u0149\2\2\u0894\u0895"+
		"\7\u016b\2\2\u0895\u0896\5\u012a\u0096\2\u0896\u0897\7\u016e\2\2\u0897"+
		"\u0898\5\u0140\u00a1\2\u0898\u0900\3\2\2\2\u0899\u089a\7\u014a\2\2\u089a"+
		"\u089b\7\u016b\2\2\u089b\u08a2\5\u012a\u0096\2\u089c\u089d\7\u015d\2\2"+
		"\u089d\u08a0\5\u012a\u0096\2\u089e\u089f\7\u015d\2\2\u089f\u08a1\5\u012a"+
		"\u0096\2\u08a0\u089e\3\2\2\2\u08a0\u08a1\3\2\2\2\u08a1\u08a3\3\2\2\2\u08a2"+
		"\u089c\3\2\2\2\u08a2\u08a3\3\2\2\2\u08a3\u08a4\3\2\2\2\u08a4\u08a5\7\u016e"+
		"\2\2\u08a5\u08a6\5\u0140\u00a1\2\u08a6\u0900\3\2\2\2\u08a7\u08a8\7\u014b"+
		"\2\2\u08a8\u08a9\7\u016b\2\2\u08a9\u08aa\5\u012a\u0096\2\u08aa\u08ab\7"+
		"\u016e\2\2\u08ab\u08ac\5\u0140\u00a1\2\u08ac\u0900\3\2\2\2\u08ad\u08ae"+
		"\7\u014c\2\2\u08ae\u08af\7\u016b\2\2\u08af\u08b6\5\u012a\u0096\2\u08b0"+
		"\u08b1\7\u015d\2\2\u08b1\u08b4\5\u012a\u0096\2\u08b2\u08b3\7\u015d\2\2"+
		"\u08b3\u08b5\5\u012a\u0096\2\u08b4\u08b2\3\2\2\2\u08b4\u08b5\3\2\2\2\u08b5"+
		"\u08b7\3\2\2\2\u08b6\u08b0\3\2\2\2\u08b6\u08b7\3\2\2\2\u08b7\u08b8\3\2"+
		"\2\2\u08b8\u08b9\7\u016e\2\2\u08b9\u08ba\5\u0140\u00a1\2\u08ba\u0900\3"+
		"\2\2\2\u08bb\u08bc\7\u00b4\2\2\u08bc\u08be\7\u016b\2\2\u08bd\u08bf\5\u013e"+
		"\u00a0\2\u08be\u08bd\3\2\2\2\u08be\u08bf\3\2\2\2\u08bf\u08c0\3\2\2\2\u08c0"+
		"\u08c1\5\u012a\u0096\2\u08c1\u08c3\7\u016e\2\2\u08c2\u08c4\5\u0140\u00a1"+
		"\2\u08c3\u08c2\3\2\2\2\u08c3\u08c4\3\2\2\2\u08c4\u0900\3\2\2\2\u08c5\u08c6"+
		"\7\u00ba\2\2\u08c6\u08c8\7\u016b\2\2\u08c7\u08c9\5\u013e\u00a0\2\u08c8"+
		"\u08c7\3\2\2\2\u08c8\u08c9\3\2\2\2\u08c9\u08ca\3\2\2\2\u08ca\u08cb\5\u012a"+
		"\u0096\2\u08cb\u08cd\7\u016e\2\2\u08cc\u08ce\5\u0140\u00a1\2\u08cd\u08cc"+
		"\3\2\2\2\u08cd\u08ce\3\2\2\2\u08ce\u0900\3\2\2\2\u08cf\u08d0\7\u0155\2"+
		"\2\u08d0\u08d1\7\u016b\2\2\u08d1\u08d2\7\u016e\2\2\u08d2\u0900\5\u0140"+
		"\u00a1\2\u08d3\u08d4\7\u0156\2\2\u08d4\u08d5\7\u016b\2\2\u08d5\u08d6\7"+
		"\u016e\2\2\u08d6\u0900\5\u0140\u00a1\2\u08d7\u08d8\7\u0157\2\2\u08d8\u08da"+
		"\7\u016b\2\2\u08d9\u08db\5\u013e\u00a0\2\u08da\u08d9\3\2\2\2\u08da\u08db"+
		"\3\2\2\2\u08db\u08dc\3\2\2\2\u08dc\u08dd\5\u012a\u0096\2\u08dd\u08df\7"+
		"\u016e\2\2\u08de\u08e0\5\u0140\u00a1\2\u08df\u08de\3\2\2\2\u08df\u08e0"+
		"\3\2\2\2\u08e0\u0900\3\2\2\2\u08e1\u08e2\7\u011a\2\2\u08e2\u08e4\7\u016b"+
		"\2\2\u08e3\u08e5\5\u013e\u00a0\2\u08e4\u08e3\3\2\2\2\u08e4\u08e5\3\2\2"+
		"\2\u08e5\u08e6\3\2\2\2\u08e6\u08e7\5\u012a\u0096\2\u08e7\u08e9\7\u016e"+
		"\2\2\u08e8\u08ea\5\u0140\u00a1\2\u08e9\u08e8\3\2\2\2\u08e9\u08ea\3\2\2"+
		"\2\u08ea\u0900\3\2\2\2\u08eb\u08ec\7\u0134\2\2\u08ec\u08ee\7\u016b\2\2"+
		"\u08ed\u08ef\5\u013e\u00a0\2\u08ee\u08ed\3\2\2\2\u08ee\u08ef\3\2\2\2\u08ef"+
		"\u08f0\3\2\2\2\u08f0\u08f1\5\u012a\u0096\2\u08f1\u08f3\7\u016e\2\2\u08f2"+
		"\u08f4\5\u0140\u00a1\2\u08f3\u08f2\3\2\2\2\u08f3\u08f4\3\2\2\2\u08f4\u0900"+
		"\3\2\2\2\u08f5\u08f6\7\u0159\2\2\u08f6\u08f8\7\u016b\2\2\u08f7\u08f9\5"+
		"\u013e\u00a0\2\u08f8\u08f7\3\2\2\2\u08f8\u08f9\3\2\2\2\u08f9\u08fa\3\2"+
		"\2\2\u08fa\u08fb\5\u012a\u0096\2\u08fb\u08fd\7\u016e\2\2\u08fc\u08fe\5"+
		"\u0140\u00a1\2\u08fd\u08fc\3\2\2\2\u08fd\u08fe\3\2\2\2\u08fe\u0900\3\2"+
		"\2\2\u08ff\u0867\3\2\2\2\u08ff\u0871\3\2\2\2\u08ff\u087e\3\2\2\2\u08ff"+
		"\u088b\3\2\2\2\u08ff\u088f\3\2\2\2\u08ff\u0893\3\2\2\2\u08ff\u0899\3\2"+
		"\2\2\u08ff\u08a7\3\2\2\2\u08ff\u08ad\3\2\2\2\u08ff\u08bb\3\2\2\2\u08ff"+
		"\u08c5\3\2\2\2\u08ff\u08cf\3\2\2\2\u08ff\u08d3\3\2\2\2\u08ff\u08d7\3\2"+
		"\2\2\u08ff\u08e1\3\2\2\2\u08ff\u08eb\3\2\2\2\u08ff\u08f5\3\2\2\2\u0900"+
		"\u013d\3\2\2\2\u0901\u0902\t\34\2\2\u0902\u013f\3\2\2\2\u0903\u0904\7"+
		"\u00d2\2\2\u0904\u0906\7\u016b\2\2\u0905\u0907\5\u0142\u00a2\2\u0906\u0905"+
		"\3\2\2\2\u0906\u0907\3\2\2\2\u0907\u0909\3\2\2\2\u0908\u090a\5\u0114\u008b"+
		"\2\u0909\u0908\3\2\2\2\u0909\u090a\3\2\2\2\u090a\u090b\3\2\2\2\u090b\u090c"+
		"\7\u016e\2\2\u090c\u0141\3\2\2\2\u090d\u090e\7\u00d6\2\2\u090e\u090f\7"+
		" \2\2\u090f\u0914\5\u012a\u0096\2\u0910\u0911\7\u015d\2\2\u0911\u0913"+
		"\5\u012a\u0096\2\u0912\u0910\3\2\2\2\u0913\u0916\3\2\2\2\u0914\u0912\3"+
		"\2\2\2\u0914\u0915\3\2\2\2\u0915\u0143\3\2\2\2\u0916\u0914\3\2\2\2\u0917"+
		"\u09e0\7\u0143\2\2\u0918\u0919\7\'\2\2\u0919\u091a\7\u016b\2\2\u091a\u091b"+
		"\5\u012a\u0096\2\u091b\u091c\7\20\2\2\u091c\u091e\5v<\2\u091d\u091f\5"+
		"d\63\2\u091e\u091d\3\2\2\2\u091e\u091f\3\2\2\2\u091f\u0920\3\2\2\2\u0920"+
		"\u0921\7\u016e\2\2\u0921\u09e0\3\2\2\2\u0922\u0923\7;\2\2\u0923\u0926"+
		"\7\u016b\2\2\u0924\u0927\5\u012a\u0096\2\u0925\u0927\7\u0169\2\2\u0926"+
		"\u0924\3\2\2\2\u0926\u0925\3\2\2\2\u0927\u0928\3\2\2\2\u0928\u09e0\7\u016e"+
		"\2\2\u0929\u09e0\7\u0145\2\2\u092a\u092b\7A\2\2\u092b\u09e0\7F\2\2\u092c"+
		"\u0930\7\u0146\2\2\u092d\u092e\7A\2\2\u092e\u0930\7\u0123\2\2\u092f\u092c"+
		"\3\2\2\2\u092f\u092d\3\2\2\2\u0930\u0935\3\2\2\2\u0931\u0932\7\u016b\2"+
		"\2\u0932\u0933\5\u012a\u0096\2\u0933\u0934\7\u016e\2\2\u0934\u0936\3\2"+
		"\2\2\u0935\u0931\3\2\2\2\u0935\u0936\3\2\2\2\u0936\u09e0\3\2\2\2\u0937"+
		"\u09e0\7\u0147\2\2\u0938\u0939\7A\2\2\u0939\u09e0\7\u015a\2\2\u093a\u093b"+
		"\7\u014d\2\2\u093b\u093c\7\u016b\2\2\u093c\u0949\5\u012a\u0096\2\u093d"+
		"\u093e\7\u015d\2\2\u093e\u0946\5\u012a\u0096\2\u093f\u0940\7\u015d\2\2"+
		"\u0940\u0941\5\u012a\u0096\2\u0941\u0942\7\u0161\2\2\u0942\u0943\5\u012a"+
		"\u0096\2\u0943\u0945\3\2\2\2\u0944\u093f\3\2\2\2\u0945\u0948\3\2\2\2\u0946"+
		"\u0944\3\2\2\2\u0946\u0947\3\2\2\2\u0947\u094a\3\2\2\2\u0948\u0946";
	private static final String _serializedATNSegment1 =
		"\3\2\2\2\u0949\u093d\3\2\2\2\u0949\u094a\3\2\2\2\u094a\u094b\3\2\2\2\u094b"+
		"\u094c\7\u016e\2\2\u094c\u09e0\3\2\2\2\u094d\u094e\7\u014e\2\2\u094e\u094f"+
		"\7\u016b\2\2\u094f\u095c\5\u012a\u0096\2\u0950\u0951\7\u015d\2\2\u0951"+
		"\u0959\5\u012a\u0096\2\u0952\u0953\7\u015d\2\2\u0953\u0954\5\u012a\u0096"+
		"\2\u0954\u0955\7\u0161\2\2\u0955\u0956\5\u012a\u0096\2\u0956\u0958\3\2"+
		"\2\2\u0957\u0952\3\2\2\2\u0958\u095b\3\2\2\2\u0959\u0957\3\2\2\2\u0959"+
		"\u095a\3\2\2\2\u095a\u095d\3\2\2\2\u095b\u0959\3\2\2\2\u095c\u0950\3\2"+
		"\2\2\u095c\u095d\3\2\2\2\u095d\u095e\3\2\2\2\u095e\u095f\7\u016e\2\2\u095f"+
		"\u09e0\3\2\2\2\u0960\u0961\7\u014f\2\2\u0961\u0962\7\u016b\2\2\u0962\u096f"+
		"\5\u012a\u0096\2\u0963\u0964\7\u015d\2\2\u0964\u096c\5\u012a\u0096\2\u0965"+
		"\u0966\7\u015d\2\2\u0966\u0967\5\u012a\u0096\2\u0967\u0968\7\u0161\2\2"+
		"\u0968\u0969\5\u012a\u0096\2\u0969\u096b\3\2\2\2\u096a\u0965\3\2\2\2\u096b"+
		"\u096e\3\2\2\2\u096c\u096a\3\2\2\2\u096c\u096d\3\2\2\2\u096d\u0970\3\2"+
		"\2\2\u096e\u096c\3\2\2\2\u096f\u0963\3\2\2\2\u096f\u0970\3\2\2\2\u0970"+
		"\u0971\3\2\2\2\u0971\u0972\7\u016e\2\2\u0972\u09e0\3\2\2\2\u0973\u0974"+
		"\7\u0150\2\2\u0974\u0975\7\u016b\2\2\u0975\u0982\5\u012a\u0096\2\u0976"+
		"\u0977\7\u015d\2\2\u0977\u097f\5\u012a\u0096\2\u0978\u0979\7\u015d\2\2"+
		"\u0979\u097a\5\u012a\u0096\2\u097a\u097b\7\u0161\2\2\u097b\u097c\5\u012a"+
		"\u0096\2\u097c\u097e\3\2\2\2\u097d\u0978\3\2\2\2\u097e\u0981\3\2\2\2\u097f"+
		"\u097d\3\2\2\2\u097f\u0980\3\2\2\2\u0980\u0983\3\2\2\2\u0981\u097f\3\2"+
		"\2\2\u0982\u0976\3\2\2\2\u0982\u0983\3\2\2\2\u0983\u0984\3\2\2\2\u0984"+
		"\u0985\7\u016e\2\2\u0985\u09e0\3\2\2\2\u0986\u0987\7\u0151\2\2\u0987\u0988"+
		"\7\u016b\2\2\u0988\u0995\5\u012a\u0096\2\u0989\u098a\7\u015d\2\2\u098a"+
		"\u0992\5\u012a\u0096\2\u098b\u098c\7\u015d\2\2\u098c\u098d\5\u012a\u0096"+
		"\2\u098d\u098e\7\u0161\2\2\u098e\u098f\5\u012a\u0096\2\u098f\u0991\3\2"+
		"\2\2\u0990\u098b\3\2\2\2\u0991\u0994\3\2\2\2\u0992\u0990\3\2\2\2\u0992"+
		"\u0993\3\2\2\2\u0993\u0996\3\2\2\2\u0994\u0992\3\2\2\2\u0995\u0989\3\2"+
		"\2\2\u0995\u0996\3\2\2\2\u0996\u0997\3\2\2\2\u0997\u0998\7\u016e\2\2\u0998"+
		"\u09e0\3\2\2\2\u0999\u099a\7\u0152\2\2\u099a\u099b\7\u016b\2\2\u099b\u09a8"+
		"\5\u012a\u0096\2\u099c\u099d\7\u015d\2\2\u099d\u09a5\5\u012a\u0096\2\u099e"+
		"\u099f\7\u015d\2\2\u099f\u09a0\5\u012a\u0096\2\u09a0\u09a1\7\u0161\2\2"+
		"\u09a1\u09a2\5\u012a\u0096\2\u09a2\u09a4\3\2\2\2\u09a3\u099e\3\2\2\2\u09a4"+
		"\u09a7\3\2\2\2\u09a5\u09a3\3\2\2\2\u09a5\u09a6\3\2\2\2\u09a6\u09a9\3\2"+
		"\2\2\u09a7\u09a5\3\2\2\2\u09a8\u099c\3\2\2\2\u09a8\u09a9\3\2\2\2\u09a9"+
		"\u09aa\3\2\2\2\u09aa\u09ab\7\u016e\2\2\u09ab\u09e0\3\2\2\2\u09ac\u09ad"+
		"\7\u0153\2\2\u09ad\u09ae\7\u016b\2\2\u09ae\u09b6\5\u012a\u0096\2\u09af"+
		"\u09b0\7\u015d\2\2\u09b0\u09b1\5\u012a\u0096\2\u09b1\u09b2\7\u0161\2\2"+
		"\u09b2\u09b3\5\u012a\u0096\2\u09b3\u09b5\3\2\2\2\u09b4\u09af\3\2\2\2\u09b5"+
		"\u09b8\3\2\2\2\u09b6\u09b4\3\2\2\2\u09b6\u09b7\3\2\2\2\u09b7\u09b9\3\2"+
		"\2\2\u09b8\u09b6\3\2\2\2\u09b9\u09ba\7\u016e\2\2\u09ba\u09e0\3\2\2\2\u09bb"+
		"\u09bc\7\u0154\2\2\u09bc\u09bd\7\u016b\2\2\u09bd\u09c3\5\u012a\u0096\2"+
		"\u09be\u09bf\7\u015d\2\2\u09bf\u09c0\5\u012a\u0096\2\u09c0\u09c1\7\u0161"+
		"\2\2\u09c1\u09c2\5\u012a\u0096\2\u09c2\u09c4\3\2\2\2\u09c3\u09be\3\2\2"+
		"\2\u09c4\u09c5\3\2\2\2\u09c5\u09c3\3\2\2\2\u09c5\u09c6\3\2\2\2\u09c6\u09c9"+
		"\3\2\2\2\u09c7\u09c8\7\u015d\2\2\u09c8\u09ca\5\u012a\u0096\2\u09c9\u09c7"+
		"\3\2\2\2\u09c9\u09ca\3\2\2\2\u09ca\u09cb\3\2\2\2\u09cb\u09cc\7\u016e\2"+
		"\2\u09cc\u09e0\3\2\2\2\u09cd\u09ce\7\u00fa\2\2\u09ce\u09cf\7\u016b\2\2"+
		"\u09cf\u09d0\5\u012a\u0096\2\u09d0\u09d1\7\u016e\2\2\u09d1\u09e0\3\2\2"+
		"\2\u09d2\u09d3\7\u0119\2\2\u09d3\u09d4\7\u016b\2\2\u09d4\u09d5\5\u012a"+
		"\u0096\2\u09d5\u09d6\7z\2\2\u09d6\u09d9\5\u012a\u0096\2\u09d7\u09d8\7"+
		"v\2\2\u09d8\u09da\5\u012a\u0096\2\u09d9\u09d7\3\2\2\2\u09d9\u09da\3\2"+
		"\2\2\u09da\u09db\3\2\2\2\u09db\u09dc\7\u016e\2\2\u09dc\u09e0\3\2\2\2\u09dd"+
		"\u09e0\7\u0158\2\2\u09de\u09e0\7\u015a\2\2\u09df\u0917\3\2\2\2\u09df\u0918"+
		"\3\2\2\2\u09df\u0922\3\2\2\2\u09df\u0929\3\2\2\2\u09df\u092a\3\2\2\2\u09df"+
		"\u092f\3\2\2\2\u09df\u0937\3\2\2\2\u09df\u0938\3\2\2\2\u09df\u093a\3\2"+
		"\2\2\u09df\u094d\3\2\2\2\u09df\u0960\3\2\2\2\u09df\u0973\3\2\2\2\u09df"+
		"\u0986\3\2\2\2\u09df\u0999\3\2\2\2\u09df\u09ac\3\2\2\2\u09df\u09bb\3\2"+
		"\2\2\u09df\u09cd\3\2\2\2\u09df\u09d2\3\2\2\2\u09df\u09dd\3\2\2\2\u09df"+
		"\u09de\3\2\2\2\u09e0\u0145\3\2\2\2\u09e1\u09e2\5\u0150\u00a9\2\u09e2\u09e4"+
		"\7\u016b\2\2\u09e3\u09e5\5\u0148\u00a5\2\u09e4\u09e3\3\2\2\2\u09e4\u09e5"+
		"\3\2\2\2\u09e5\u09e6\3\2\2\2\u09e6\u09e7\7\u016e\2\2\u09e7\u0147\3\2\2"+
		"\2\u09e8\u09ed\5\u014a\u00a6\2\u09e9\u09ea\7\u015d\2\2\u09ea\u09ec\5\u014a"+
		"\u00a6\2\u09eb\u09e9\3\2\2\2\u09ec\u09ef\3\2\2\2\u09ed\u09eb\3\2\2\2\u09ed"+
		"\u09ee\3\2\2\2\u09ee\u0149\3\2\2\2\u09ef\u09ed\3\2\2\2\u09f0\u09f3\5\u0150"+
		"\u00a9\2\u09f1\u09f3\7\u0176\2\2\u09f2\u09f0\3\2\2\2\u09f2\u09f1\3\2\2"+
		"\2\u09f3\u09fd\3\2\2\2\u09f4\u09f5\5\u0150\u00a9\2\u09f5\u09f7\7\u0161"+
		"\2\2\u09f6\u09f8\7\u0165\2\2\u09f7\u09f6\3\2\2\2\u09f7\u09f8\3\2\2\2\u09f8"+
		"\u09fa\3\2\2\2\u09f9\u09f4\3\2\2\2\u09f9\u09fa\3\2\2\2\u09fa\u09fb\3\2"+
		"\2\2\u09fb\u09fd\5\u012a\u0096\2\u09fc\u09f2\3\2\2\2\u09fc\u09f9\3\2\2"+
		"\2\u09fd\u014b\3\2\2\2\u09fe\u09ff\7F\2\2\u09ff\u0a00\5\u0152\u00aa\2"+
		"\u0a00\u014d\3\2\2\2\u0a01\u0a02\7\u0123\2\2\u0a02\u0a03\5\u0152\u00aa"+
		"\2\u0a03\u014f\3\2\2\2\u0a04\u0a17\5\u0152\u00aa\2\u0a05\u0a08\7\u0177"+
		"\2\2\u0a06\u0a08\5\u015c\u00af\2\u0a07\u0a05\3\2\2\2\u0a07\u0a06\3\2\2"+
		"\2\u0a08\u0a10\3\2\2\2\u0a09\u0a0c\7\5\2\2\u0a0a\u0a0d\7\u0177\2\2\u0a0b"+
		"\u0a0d\5\u015c\u00af\2\u0a0c\u0a0a\3\2\2\2\u0a0c\u0a0b\3\2\2\2\u0a0d\u0a0f"+
		"\3\2\2\2\u0a0e\u0a09\3\2\2\2\u0a0f\u0a12\3\2\2\2\u0a10\u0a0e\3\2\2\2\u0a10"+
		"\u0a11\3\2\2\2\u0a11\u0a14\3\2\2\2\u0a12\u0a10\3\2\2\2\u0a13\u0a15\5\u0150"+
		"\u00a9\2\u0a14\u0a13\3\2\2\2\u0a14\u0a15\3\2\2\2\u0a15\u0a17\3\2\2\2\u0a16"+
		"\u0a04\3\2\2\2\u0a16\u0a07\3\2\2\2\u0a17\u0151\3\2\2\2\u0a18\u0a1b\7\u0178"+
		"\2\2\u0a19\u0a1b\7\u0179\2\2\u0a1a\u0a18\3\2\2\2\u0a1a\u0a19\3\2\2\2\u0a1b"+
		"\u0153\3\2\2\2\u0a1c\u0a1e\t&\2\2\u0a1d\u0a1c\3\2\2\2\u0a1d\u0a1e\3\2"+
		"\2\2\u0a1e\u0a1f\3\2\2\2\u0a1f\u0a20\7\u017a\2\2\u0a20\u0155\3\2\2\2\u0a21"+
		"\u0a23\t&\2\2\u0a22\u0a21\3\2\2\2\u0a22\u0a23\3\2\2\2\u0a23\u0a24\3\2"+
		"\2\2\u0a24\u0a25\7\u017b\2\2\u0a25\u0157\3\2\2\2\u0a26\u0a27\t\'\2\2\u0a27"+
		"\u0159\3\2\2\2\u0a28\u0a29\7\u00c6\2\2\u0a29\u015b\3\2\2\2\u0a2a\u0a2b"+
		"\t(\2\2\u0a2b\u015d\3\2\2\2\u0141\u0163\u0167\u0172\u017d\u017f\u018f"+
		"\u0194\u019d\u01a2\u01a7\u01bf\u01ca\u01d2\u01d9\u01dd\u01e1\u01e6\u01ea"+
		"\u01ef\u01f3\u01f7\u0201\u0205\u020a\u020f\u0213\u0220\u0225\u022b\u0233"+
		"\u023c\u0244\u0247\u024c\u0251\u0258\u025f\u0262\u0265\u026c\u0273\u0277"+
		"\u027a\u027f\u0287\u0292\u029a\u029d\u02a3\u02b1\u02bb\u02c1\u02c6\u02cb"+
		"\u02d0\u02d4\u02d9\u02dc\u02e6\u02f2\u02f9\u02fc\u0308\u030d\u0312\u0315"+
		"\u031c\u032d\u033a\u033c\u0341\u0344\u0353\u0359\u0364\u0367\u0371\u0378"+
		"\u0380\u0388\u0393\u03a7\u03ad\u03b1\u03b6\u03ba\u03bf\u03c2\u03c7\u03ca"+
		"\u03cf\u03d3\u03d8\u03df\u03e2\u03e5\u03ea\u03ee\u03f0\u03f6\u03fa\u03fd"+
		"\u0404\u040f\u0418\u041f\u0426\u0428\u043e\u044c\u0450\u0458\u045f\u0465"+
		"\u046d\u0476\u047b\u049d\u04a9\u04ac\u04ba\u04bd\u04c5\u04c8\u04cf\u04d2"+
		"\u04e6\u04ec\u04f0\u04fa\u04fe\u0506\u0509\u0511\u051c\u052c\u052e\u053e"+
		"\u0540\u054d\u0556\u055c\u0562\u0565\u0568\u056b\u056e\u0574\u057e\u0589"+
		"\u058c\u0593\u0598\u059d\u05a1\u05a9\u05ad\u05b2\u05b6\u05b8\u05bd\u05c5"+
		"\u05ca\u05cf\u05d8\u05dc\u05e6\u05f8\u0604\u060b\u061b\u0622\u0629\u062d"+
		"\u0638\u063f\u064c\u064f\u0659\u065e\u066b\u0676\u067e\u0682\u0686\u068a"+
		"\u068c\u0691\u0694\u0697\u069a\u069e\u06a1\u06a4\u06a7\u06aa\u06b1\u06bc"+
		"\u06c4\u06c8\u06cb\u06cd\u06d1\u06d6\u06dd\u06e1\u06eb\u06f3\u06f9\u06fd"+
		"\u0703\u070c\u070f\u0714\u0717\u0721\u0726\u072f\u0734\u0738\u0741\u0745"+
		"\u0753\u0760\u0765\u0769\u076f\u0774\u077f\u0781\u0785\u078c\u0794\u079a"+
		"\u079f\u07aa\u07b3\u07b7\u07c0\u07c4\u07ce\u07d3\u07df\u07f3\u07f6\u0808"+
		"\u0818\u081a\u0825\u0830\u083c\u0840\u084b\u084f\u085b\u085f\u086a\u086f"+
		"\u0874\u0878\u087c\u0881\u0885\u0889\u08a0\u08a2\u08b4\u08b6\u08be\u08c3"+
		"\u08c8\u08cd\u08da\u08df\u08e4\u08e9\u08ee\u08f3\u08f8\u08fd\u08ff\u0906"+
		"\u0909\u0914\u091e\u0926\u092f\u0935\u0946\u0949\u0959\u095c\u096c\u096f"+
		"\u097f\u0982\u0992\u0995\u09a5\u09a8\u09b6\u09c5\u09c9\u09d9\u09df\u09e4"+
		"\u09ed\u09f2\u09f7\u09f9\u09fc\u0a07\u0a0c\u0a10\u0a14\u0a16\u0a1a\u0a1d"+
		"\u0a22";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}