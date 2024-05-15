package transport.network.jsonprotocol;

public enum RequestType {
    LOGIN_TESTER,
    LOGIN_PROGRAMMER,
    ADD_TESTER,
    DELETE_TESTER,
    UPDATE_TESTER,
    ADD_PROGRAMMER,
    DELETE_PROGRAMMER,
    UPDATE_PROGRAMMER,
    GET_ALL_PROGRAMMERS,
    ADD_BUG,
    DELETE_BUG,
    UPDATE_BUG,
    SEARCH_USER_BY_NAME,
    SEARCH_TESTER_BY_USERNAME,
    SEARCH_PROGRAMMER_BY_USERNAME,
    SEARCH_BUG_BY_NAME_AND_DESCRIPTION,
    GET_BUGS_BY_PROGRAMMER,
    GET_ALL_BUGS,
    GET_ALL_USERS,
    LOGOUT_TESTER,
    LOGOUT_PROGRAMMER;
}
