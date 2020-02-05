(ns foo.bar
  (:gen-class)
  #_(:require [foo.baz]))

;; (defn do-things []
;;   @(requiring-resolve 'foo.baz/quux))

;; (do-things)

;; (def config "config")

;; (alter-var-root #'config (constantly "prepped config"))

;; ig.repl.state/config
;; ig.repl.state/system

(defn -main [& args]
  ;; (prn config)
  (println @(requiring-resolve 'foo.baz/quux)))
