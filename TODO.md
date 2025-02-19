# todo

**⚠️ mind:**
- code quality, structure, patterns, comments
- ra, cucumber features use
- correct tests, checks
- regular commits

**steps:**
- [implementation](#implementation)
  - [auth API](#auth-api)
  - [project](#project)
- [👉 analysis](#-analysis)
  - [message API](#message-api)
  - [auth API](#auth-api-1)
- [setup](#setup)

## implementation

### auth API
- implement login
- implement logout
- implement validate

### project

best practices:
- cucumber anti-patterns: use AND

feature testing:
- create: get, post + get
- update: get, post + get, put + get
- delete: get, post + get, delete + get
- test incorrect data: post, put
  - string: test some unhappy strings
  - dates: test some unhappy dates

auth:
- authentication: make helper
- test: check user is authenticated
- test: not authenticated: check error 403

test data:
- json schemas: Booking API
- json schemas: Message API
- test data: Booking API
- test data: Message API

## 👉 analysis
- [x] list API endpoints
- [x] review [endpoints](doc/endpoints.md)
- [x] setup api test framework
- tools doc:
  - cucumber/gherkin features
  - rest assured features
- 👉 define tests: show variation, cover enough test types
- implement

### message API
[message API](https://automationintesting.online/message/swagger-ui/index.html#/):
- PUT /{id}/read
- GET /
- POST /
- GET /{id}/
- DELETE /{id}/
- GET /count

### auth API
[auth API](https://automationintesting.online/auth/swagger-ui/index.html#/):
- POST /validate: token
- POST /logout
- POST /login: username, password

## setup
- [x] install cucumber
- [x] install rest assured
- [x] vscode: java, xml formatter
- [x] review instructions
- [x] note steps
