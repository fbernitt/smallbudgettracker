(ns smallbudgettracker.budget
  (:require [smallbudgettracker.category]))

(defrecord Budget [title date amount])

(defn foobar [] 1)

(defn make-budget [title date amount]
  (Budget. title date amount))

(defn budget [title date amount & more]
  (let [b (make-budget title date amount)]
    (if (nil? more)
      (list b)
      (cons b (apply budget more)))))

(defn budget-sum [budgets]
  (reduce + 0 (map #(:amount %) budgets)))
