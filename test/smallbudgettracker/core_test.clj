(ns smallbudgettracker.core-test
  (:require [clojure.test :refer :all ]
            [smallbudgettracker.category :refer :all ]
            [smallbudgettracker.core :refer :all ]))

(in-ns 'user)

(def budgets)
(in-ns 'smallbudgettracker.core-test)

(deftest load-test
  (testing "test budget load"
    (do
      (parse-file "test/foobar.txt")
      (is (= (list (make-category :foo "bar")) (user/budgets))))))

