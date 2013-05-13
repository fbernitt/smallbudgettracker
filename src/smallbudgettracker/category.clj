(ns smallbudgettracker.category)

(defrecord BudgetCategory [name title])

(defn make-category [name title] (BudgetCategory. name title))
