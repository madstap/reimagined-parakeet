(ns foo.build
  (:refer-clojure :exclude [compile])
  (:require [badigeon.bundle :refer [bundle make-out-path]]
            [badigeon.compile :refer [compile]]))

(defn -main []
  (bundle (make-out-path 'lib nil) {:allow-unstable-deps? true})
  (compile '#{foo.bar foo.baz} {:compile-path "target/classes"}))
