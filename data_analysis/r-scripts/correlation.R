
source('data_analysis/r-scripts/inputdata.r')
source('data_analysis/r-scripts/applyfriedmantest.R')


results <- getResultsOfRQ1() %>%
  filter(total_cb > 0) %>%
  mutate(CBC = if_else(total_cb > 0, covered_cb / total_cb, NaN))

df <- results %>%
  filter(testsuite == 'C') %>%
  mutate(sub_super = if_else(type == 'sub/super', 1, 0 ))%>%
  select(CBC, caller_complexity, callee_complexity, call_sites, sub_super)

cat("Pearson's coef for test suites C:")
cor(df, method = c("pearson"))

