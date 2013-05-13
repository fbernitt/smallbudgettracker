(ns smallbudgettracker.category-test
  (:require [clojure.test :refer :all ]
            [smallbudgettracker.category :refer :all ])
  (:import (smallbudgettracker.category BudgetCategory)))


(deftest category-test
  (testing "CHANGEME, a simple test"
    (is (= (BudgetCategory. "foo" "bar") (make-category "foo" "bar")))))
