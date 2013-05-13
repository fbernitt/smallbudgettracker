(ns smallbudgettracker.budget-test
  (:require [clojure.test :refer :all ]
            [smallbudgettracker.budget :refer :all ])
  (:import (smallbudgettracker.budget Budget)))

(deftest foobar-test
  (testing "FIXME, I fail."
    (is (= 1 (foobar)))))


(deftest budget-test
  (testing "Create a simple budget entry"
    (is (= (Budget. "Test budget" "1.1.2013", 30.5) (make-budget "Test budget" "1.1.2013", 30.5)))))

(deftest budget-list
  (testing "Create a list of budget entries"
    (is (= (list (Budget. "First budget" "1.1.2013" 23) (Budget. "Second budget", "2.1.2013" 42)) (budget "First budget" "1.1.2013" 23, "Second budget", "2.1.2013" 42)))))

(deftest sum
  (testing "calculating budget sum"
    (is (= 65 (budget-sum (budget "First budget" "1.1.2013" 23, "Second budget", "2.1.2013" 42))))))
