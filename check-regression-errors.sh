#!/bin/bash

# Define the regex pattern to search for
pattern="***"

# Check if the file contains a line that matches the pattern
if grep -q "$pattern" RegressionResults; then
  exit 1
else
  exit 0
fi
