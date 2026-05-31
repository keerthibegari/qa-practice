# Gmail Compose Function - Test Cases

## Assessment Details
- **Feature Under Test:** Gmail Compose function - Sending an email
- **Test Scenario:** Send an email with Subject: "Incubyte" and Body: "QA test for Incubyte"

## Deliverables

### 1. Traditional_Test_Cases.csv
Contains 25 traditional-style test cases with:
- Test Case ID, Category, Title, Preconditions, Steps, Test Data, Expected Result, Priority, Type (Positive/Negative)

### 2. BDD_Test_Cases.csv
Contains 25 BDD-style test cases in Given/When/Then format with:
- Test Case ID, Feature, Scenario Title, Given, When, Then, Type, Priority

## Test Coverage Summary

| Category | Count |
|----------|-------|
| Positive Test Cases | 14 |
| Negative Test Cases | 11 |
| High Priority | 8 |
| Medium Priority | 12 |
| Low Priority | 5 |

## Areas Covered
- Basic compose and send flow
- Subject and Body field validation
- Recipient field validation (empty, invalid, multiple, CC, BCC)
- Draft auto-save functionality
- Network failure handling
- Security (XSS prevention)
- UI interactions (minimize, restore, keyboard shortcuts)
- Edge cases (long subject, recipient limits, empty fields)

## How to Use
1. Open the CSV files in Microsoft Excel or Google Sheets
2. Each file is formatted as a complete test case document ready for review
